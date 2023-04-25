package bmicalc;

public class BMICalcImpl implements BMICalc {
	
	private static BMICalcImpl instancia;
	
	private BMICalcImpl() {
		
	}

	public double bmi(double mass, double height) throws Exception {
		if(mass<=0 || height<=0) {
			throw new NegativeValueException("La masa y la altura deben ser valores positivos");
		}
		double bmi = mass/Math.pow(height, 2);
		return bmi;
	}

	public String category(double bmi) {
		String str = "";
		if(bmi<18.5) {
			str = "UNDERWEIGHT";
		} else if (18.5 <= bmi && bmi < 25.0) {
			str = "NORMAL";
		} else if (25.0 <= bmi && bmi < 30.0) {
			str = "OVERWEIGHT";
		} else {
			str = "OBESE";
		}
		return str;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) throws Exception {
		if (gender != 'M' && gender != 'F') {
			throw new NegativeValueException("El g�nero debe ser Masculino (M) o femenino(F)");
		} else if(waistCircumference<=0.0) {
			throw new NegativeValueException("El radio de circunferencia debe ser un valor positivo");
		}
		boolean obese = false;
		if(waistCircumference > 90.0 && gender == 'M') {
			obese = true;
		} else if (waistCircumference > 80.0 && gender == 'F') {
			obese = true;
		} else {
			obese = false;
		}
		return obese;
	}
	
	public static BMICalcImpl getInstancia() {
		if(instancia == null) {
			instancia = new BMICalcImpl();
		}
		return instancia;
	}

}
