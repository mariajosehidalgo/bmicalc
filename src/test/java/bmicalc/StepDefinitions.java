package bmicalc;

import org.junit.jupiter.api.Assertions;
import bmicalc.NegativeValueException;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitions {

	private BMICalcImpl bmi;
	private double result ;
	private boolean raiseException;
	
	@Before
	public void init() {
		bmi = null;
		result = (Double) null;
		raiseException = false;
	}
	
	@Given("Tenemos inicializada la calculadora")
	public void tenemos_inicializada_la_calculadora() {
	    bmi = new BMICalcImpl();
	}

	@When("El usuario introduce valores validos de {double} y {double}")
	public void el_usuario_introduce_valores_validos_de_y(Double double1, Double double2) throws Exception {
		result = bmi.bmi(double1, double2);
	}

	@Then("La calculadora devuelve el valor del {double} del usuario")
	public void la_calculadora_devuelve_el_valor_del_del_usuario(Double double1) {
		Assertions.assertEquals(double1, result);
	}

	@When("El usuario introduce valores invalidos de {double} y {double}")
	public void el_usuario_introduce_valores_invalidos_de_y(Double double1, Double double2) throws Exception {
		try {
			result = bmi.bmi(double1, double2);
		} catch (NegativeValueException e) {
			raiseException = true;
		}
	}

	@Then("La calculadora lanza un error en el que informa que los datos no estan en un formato valido. Vuelve al menu original.")
	public void la_calculadora_lanza_un_error_en_el_que_informa_que_los_datos_no_estan_en_un_formato_valido_vuelve_al_menu_original() {
		Assertions.assertTrue(raiseException);
	}
	
}
