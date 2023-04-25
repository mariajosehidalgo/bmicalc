package bmicalc;

import java.util.Map;

public class Proxy implements IMCStats, IMCHospital {

	private IMCHospital servicio;
	private double alturaTotal=0.0;
	private double pesoTotal=0.0;
	private double imcTotal=0.0;
	private int numPacientes=0;
	
	
	public Proxy (IMCHospital s) {
		this.servicio=s;
	}

	@Override
	public Map<Double, String> imc(double altura, double peso) throws Exception {
		numPacientes++;
		pesoTotal += peso;
		alturaTotal += altura;
		Map<Double, String> imc = servicio.imc(altura, peso);
		imcTotal += (double)servicio.imc(altura, peso).keySet().toArray()[0];
		return imc;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) throws Exception {
		boolean obab = servicio.tieneObesidadAbdominal(genero, circunferencia);
		return obab;
	}
	
	@Override
	public double alturaMedia() {
		if (numPacientes == 0) {
			return 0.0;
		} else {
			return alturaTotal/numPacientes;
		}
	}

	@Override
	public double pesoMedio() {
		if (numPacientes == 0) {
			return 0.0;
		} else {
			return pesoTotal/numPacientes;
		}
	}

	@Override
	public double imcMedio() {
		if (numPacientes == 0) {
			return 0.0;
		} else {
			return imcTotal/numPacientes;
		}
	}

	@Override
	public int numPacientes() {
		return numPacientes;
	}
	
}
