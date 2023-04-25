package bmicalc;

import java.util.Map;

public interface IMCHospital {

	public Map<Double, String> imc(double altura, double peso) throws Exception;
	
	public boolean tieneObesidadAbdominal (char genero, double circunferencia) throws Exception;
	
}
