package bmicalc;

import java.util.Map;

public class CalcAm extends CalcDecor{

	public CalcAm(IMCHospital calc) {
		super(calc);
	}
	
	@Override
	public Map<Double, String> imc (double altura, double peso) throws Exception{
		double alturam = altura/3.28084;
		double pesokg=peso/2.20462;
		Map<Double, String> imc = super.imc(alturam, pesokg);
		double bmi = (double) imc.keySet().toArray()[0];
		System.out.println("The person who is " + altura + " feet tall and weighs "
				+ peso + " pounds has a BMI of " + bmi + ".");
		return imc;
	}
	
}
