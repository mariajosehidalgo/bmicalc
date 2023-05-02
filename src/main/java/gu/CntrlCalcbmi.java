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
				resbmi = modelo.calculateBodyMassIndex(masa, altura);
				ObesityCategory cat = modelo.getObesityCategory(resbmi);
				vista.setResutadoBMI(resbmi);
				vista.setResutadoCateg(cat);
			} catch (Exception e1) {
				e1.printStackTrace();
			}		
		}
		else if (comando.equals("OBESIDAD ABDOMINAL")) {
			Gender gender = vista.getInputValueGender();
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
