package bmicalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
private BMICalcImpl bmi;
	
	@BeforeEach
	void init() {
		bmi = new BMICalcImpl();
	}
	
	@Test
	@DisplayName("Example Test Method.")
	public void bmi() {
		assertEquals(true, true);
	}
	
	@Test
	@DisplayName("TEST CALCULO BMI")
	public void test1() {
		assertEquals(23.62, bmi.bmi(62, 1.62));
		assertEquals(19.36, bmi.bmi(54, 1.67));
		assertEquals(27.77, bmi.bmi(40, 1.20));
		assertEquals(31.21, bmi.bmi(12, 0.62));
		assertEquals(26.87, bmi.bmi(90, 1.83));
		assertEquals(25.09, bmi.bmi(70, 1.67));
	}
	
	@Test
	@DisplayName("BMI<18.5")
	public void test2() {
		assertEquals("UNDERWEIGHT", bmi.category(15.0));
		assertEquals("UNDERWEIGHT", bmi.category(17.7));
		assertEquals("UNDERWEIGHT", bmi.category(18.4));
	}
	
	@Test
	@DisplayName("BMI=18.5")
	public void test3() {
		assertEquals("NORMAL", bmi.category(18.5));
	}
	
	@Test
	@DisplayName("18.5<BMI<=24.9")
	public void test4() {
		assertEquals("NORMAL", bmi.category(18.6));
		assertEquals("NORMAL", bmi.category(22.7));
		assertEquals("NORMAL", bmi.category(24.9));
	}
	
	@Test
	@DisplayName("BMI=25.0")
	public void test5() {
		assertEquals("OVERWEIGHT", bmi.category(25.0));
	}
	
	@Test
	@DisplayName("25.0<BMI<=29.9")
	public void test6() {
		assertEquals("OVERWEIGHT", bmi.category(25.1));
		assertEquals("OVERWEIGHT", bmi.category(28.1));
		assertEquals("OVERWEIGHT", bmi.category(29.9));
	}
	
	@Test
	@DisplayName("BMI=30.0")
	public void test7() {
		assertEquals("OBESE", bmi.category(30.0));
	}
	
	@Test
	@DisplayName("BMI>30")
	public void test8() {
		assertEquals("OBESE", bmi.category(30.1));
		assertEquals("OBESE", bmi.category(33.4));
		assertEquals("OBESE", bmi.category(37.8));
	}
	
	@Test
	@DisplayName("TEST CALCULO ABDOMINALOBESITY")
	public void test9() {
		assertTrue(bmi.abdominalObesity(91, 'M'));
		assertTrue(bmi.abdominalObesity(100, 'M'));
		assertTrue(bmi.abdominalObesity(98, 'F'));
		assertTrue(bmi.abdominalObesity(90, 'F'));
		assertTrue(bmi.abdominalObesity(81, 'F'));
		assertFalse(bmi.abdominalObesity(90, 'M'));
		assertFalse(bmi.abdominalObesity(85, 'M'));
		assertFalse(bmi.abdominalObesity(80, 'F'));
		assertFalse(bmi.abdominalObesity(78, 'F'));
		assertFalse(bmi.abdominalObesity(70, 'F'));
	}
}
