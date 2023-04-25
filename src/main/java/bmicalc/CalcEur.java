package bmicalc;

import java.util.Map;

public class CalcEur extends CalcDecor{
	
	public CalcEur(IMCHospital calc) {
		super(calc);
	}
	
	@Override
	public Map<Double, String> imc (double altura, double peso) throws Exception{
		Map<Double, String> imc = super.imc(altura, peso);
		double bmi = (double) imc.keySet().toArray()[0];
		System.out.println("La persona con altura " + altura + " metros y " + peso +
				" kilos de peso tiene un IMC de " + bmi + ".");
		return imc;
	}
	
}
