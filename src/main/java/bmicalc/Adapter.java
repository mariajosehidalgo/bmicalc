package bmicalc;

import java.util.HashMap;
import java.util.Map;

public class Adapter implements IMCHospital {

	private BMICalc calc;
	
	public Adapter(BMICalc calc) {
		this.calc=calc;
	}
	
	@Override
	public Map <Double, String> imc (double altura, double peso) throws Exception {
		double bmi =calc.bmi(peso, altura);
		String cat = calc.category(bmi);
		Map<Double, String> imc = new HashMap<Double, String>();
		imc.put(bmi, cat);
		return imc;
	}
	
	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) throws Exception {
		boolean obab = calc.abdominalObesity(circunferencia, genero);
		return obab; 
	}

	

}
