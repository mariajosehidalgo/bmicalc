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
		
	}
	
	@Test
	@DisplayName("BMI=18.5")
	public void test3() {
		
	}
	
	@Test
	@DisplayName("18.5<BMI<=24.9")
	public void test4() {
		
	}
	
	@Test
	@DisplayName("BMI=25.0")
	public void test5() {
		
	}
	
	@Test
	@DisplayName("25.0<BMI<=29.9")
	public void test6() {
		
	}
	
	@Test
	@DisplayName("BMI=30.0")
	public void test7() {
		
	}
	
	@Test
	@DisplayName("BMI>30")
	public void test8() {
		
	}
	
	@Test
	@DisplayName("TEST CALCULO ABDOMINALOBESITY")
	public void test9() {
		
	}
}
