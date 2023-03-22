package gu;

import bmicalc.*;

import java.awt.event.*;

public class CntrlCalcbmi implements ActionListener {

	private BMICalcImpl modelo;
	private Calcbmi vista;
	
	public CntrlCalcbmi(BMICalcImpl modelo, Calcbmi vista){
		this.modelo = modelo;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("BMI")) {
			double masa = vista.getInputValueMasa();
			double altura = vista.getInputValueAltura();
			double resbmi;
			try {
				resbmi = modelo.bmi(masa, altura);
				String cat = modelo.category(resbmi);
				String rescat = "";
				if(cat.equalsIgnoreCase("UNDERWEIGHT")) {
					rescat = "PESO BAJO";
				} else if (cat.equalsIgnoreCase("OVERWEIGHT")) {
					rescat = "SOBREPESO";
				} else if (cat.equalsIgnoreCase("OBESE")) {
					rescat = "OBESIDAD";
				} else {
					rescat = "NORMAL";
				}
				vista.setResutadoBMI(resbmi);
				vista.setResutadoCateg(rescat);
			} catch (Exception e1) {
				e1.printStackTrace();
			}		
		}
		else if (comando.equals("OBESIDAD ABDOMINAL")) {
			char gender = vista.getInputValueGender();
			double abdcirc = vista.getInputValueAbdCirc();
			boolean boolabdobs = false;
			String resabdobs = "";
			try {
				boolabdobs = modelo.abdominalObesity(abdcirc, gender);
				if(boolabdobs == false) {
					resabdobs = "FALSO";
				} else {
					resabdobs = "VERDADERO";
				}
				vista.setResutadoAbdObs(resabdobs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
