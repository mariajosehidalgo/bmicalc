package bmicalc;

import java.util.Map;

public class CalcDecor implements IMCHospital{
	
	private IMCHospital calc;

	public CalcDecor(IMCHospital calc) {
		this.calc = calc;
	}
	
	@Override
	public Map<Double, String> imc(double altura, double peso) throws Exception {
		Map<Double, String> imc = calc.imc(altura, peso);
		return imc;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) throws Exception {
		boolean abob = calc.tieneObesidadAbdominal(genero, circunferencia);
		return abob;
	}
	
}
