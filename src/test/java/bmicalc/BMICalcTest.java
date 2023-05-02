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
	public void test1() throws Exception {
		assertEquals(23.85, ((Math.round((bmi.calculateBodyMassIndex(62.58, 1.62))*100.0)))/100.0);
		assertEquals(19.54, ((Math.round((bmi.calculateBodyMassIndex(54.49, 1.67))*100.0)))/100.0);
		assertEquals(27.99, ((Math.round((bmi.calculateBodyMassIndex(40.30, 1.20))*100.0)))/100.0);
		assertEquals(32.93, ((Math.round((bmi.calculateBodyMassIndex(12.66, 0.62))*100.0)))/100.0);
		assertEquals(27.44, ((Math.round((bmi.calculateBodyMassIndex(91.89, 1.83))*100.0)))/100.0);
		assertEquals(25.10, ((Math.round((bmi.calculateBodyMassIndex(70.00, 1.67))*100.0)))/100.0);
	}
	
	@Test
	@DisplayName("BMI<18.5")
	public void test2() {
		assertEquals(ObesityCategory.UNDERWEIGHT, bmi.getObesityCategory(15.0));
		assertEquals(ObesityCategory.UNDERWEIGHT, bmi.getObesityCategory(17.7));
		assertEquals(ObesityCategory.UNDERWEIGHT, bmi.getObesityCategory(18.4));
	}
	
	@Test
	@DisplayName("BMI=18.5")
	public void test3() {
		assertEquals(ObesityCategory.NORMAL, bmi.getObesityCategory(18.5));
	}
	
	@Test
	@DisplayName("18.5<BMI<=24.9")
	public void test4() {
		assertEquals(ObesityCategory.NORMAL, bmi.getObesityCategory(18.6));
		assertEquals(ObesityCategory.NORMAL, bmi.getObesityCategory(22.7));
		assertEquals(ObesityCategory.NORMAL, bmi.getObesityCategory(24.9));
	}
	
	@Test
	@DisplayName("BMI=25.0")
	public void test5() {
		assertEquals(ObesityCategory.OVERWEIGHT, bmi.getObesityCategory(25.0));
	}
	
	@Test
	@DisplayName("25.0<BMI<=29.9")
	public void test6() {
		assertEquals(ObesityCategory.OVERWEIGHT, bmi.getObesityCategory(25.1));
		assertEquals(ObesityCategory.OVERWEIGHT, bmi.getObesityCategory(28.1));
		assertEquals(ObesityCategory.OVERWEIGHT, bmi.getObesityCategory(29.9));
	}
	
	@Test
	@DisplayName("BMI=30.0")
	public void test7() {
		assertEquals(ObesityCategory.OBESE, bmi.getObesityCategory(30.0));
	}
	
	@Test
	@DisplayName("BMI>30")
	public void test8() {
		assertEquals(ObesityCategory.OBESE, bmi.getObesityCategory(30.1));
		assertEquals(ObesityCategory.OBESE, bmi.getObesityCategory(33.4));
		assertEquals(ObesityCategory.OBESE, bmi.getObesityCategory(37.8));
	}
	
	@Test
	@DisplayName("TEST CALCULO ABDOMINALOBESITY")
	public void test9() throws Exception {
		assertTrue(bmi.abdominalObesity(91.2, Gender.MALE));
		assertTrue(bmi.abdominalObesity(100.7, Gender.MALE));
		assertTrue(bmi.abdominalObesity(98.4, Gender.FEMALE));
		assertTrue(bmi.abdominalObesity(90.2, Gender.FEMALE));
		assertTrue(bmi.abdominalObesity(81.8, Gender.FEMALE));
		assertFalse(bmi.abdominalObesity(90.0, Gender.MALE));
		assertFalse(bmi.abdominalObesity(85.3, Gender.MALE));
		assertFalse(bmi.abdominalObesity(80.0, Gender.FEMALE));
		assertFalse(bmi.abdominalObesity(78.1, Gender.FEMALE));
		assertFalse(bmi.abdominalObesity(70.6, Gender.FEMALE));
	}
	
	@Test
	@DisplayName("TEST PRUEBA DE SALTO DE ERRORES")
	public void exceptionTesting() throws Exception{
		assertThrows(Exception.class, ()->bmi.calculateBodyMassIndex(46.0, 0.0));
		assertThrows(Exception.class, ()->bmi.calculateBodyMassIndex(0.0, 1.20));
		assertThrows(Exception.class, ()->bmi.calculateBodyMassIndex(0.0, 0.0));
		assertThrows(Exception.class, ()->bmi.calculateBodyMassIndex(-46.0, -1.45));
		assertThrows(Exception.class, ()->bmi.abdominalObesity(-23.3, Gender.MALE));
		assertThrows(Exception.class, ()->bmi.abdominalObesity(-90.8, Gender.FEMALE));
	}
}
