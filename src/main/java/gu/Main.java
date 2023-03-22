package gu;

import java.awt.EventQueue;

import bmicalc.*;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalcImpl modelo = new BMICalcImpl();
					Calcbmi vista = new Calcbmi();
					CntrlCalcbmi controlador = new CntrlCalcbmi(modelo, vista);
					vista.registrarControlador(controlador);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
