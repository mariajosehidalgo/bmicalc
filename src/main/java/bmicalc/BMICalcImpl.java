package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if(mass<=0 || height<=0) {
			throw new RuntimeException("La masa y la altura deben ser valores positivos");
		}
		return Math.round(mass/Math.pow(height, 2)*10)/10;
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

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
