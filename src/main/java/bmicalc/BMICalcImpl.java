package bmicalc;

public class BMICalcImpl implements CardioVascularMetrics, MetabolicMetrics {

	@Override
	public double calculateBodyMassIndex(double mass, double height) throws Exception {
		if(mass<=0 || height<=0) {
			throw new NegativeValueException("La masa y la altura deben ser valores positivos");
		}
		double bmi = mass/Math.pow(height, 2);
		return bmi;
	}

	@Override
	public ObesityCategory getObesityCategory(double bmi) {
		if(bmi<18.5) {
			return ObesityCategory.UNDERWEIGHT;
		} else if (18.5 <= bmi && bmi < 25.0) {
			return ObesityCategory.NORMAL;
		} else if (25.0 <= bmi && bmi < 30.0) {
			return ObesityCategory.OVERWEIGHT;
		} else {
			return ObesityCategory.OBESE;
		}
	}
	
	public boolean abdominalObesity(double waistCircumference, Gender gender) throws Exception {
		if (gender != Gender.FEMALE && gender != Gender.MALE) {
			throw new NegativeValueException("El g nero debe ser Masculino (M) o femenino(F)");
		} else if(waistCircumference<=0.0) {
			throw new NegativeValueException("El radio de circunferencia debe ser un valor positivo");
		}
		boolean obese = false;
		if(waistCircumference > 90.0 && gender == Gender.MALE) {
			obese = true;
		} else if (waistCircumference > 80.0 && gender == Gender.FEMALE) {
			obese = true;
		}
		return obese;
	}

}