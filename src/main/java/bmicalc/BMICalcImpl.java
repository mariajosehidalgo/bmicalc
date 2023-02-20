package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if(mass<=0 || height<=0) {
			throw new RuntimeException("La masa y la altura deben ser valores positivos");
		}
		return Math.round(mass/Math.pow(height, 2)*10)/10;
	}

	public String category(double bmi) {
		return "";
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
