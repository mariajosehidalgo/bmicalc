package bmicalc;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) throws Exception {
		BMICalcImpl bmi = BMICalcImpl.getInstancia();
		IMCHospital imc = new Adapter(bmi);
		Proxy imcproxy = new Proxy(imc);
		CalcDecor am = new CalcAm(imcproxy);
		CalcDecor eur = new CalcEur(imcproxy);
		
		System.out.println("Elija una opción:");
		try (Scanner sc = new Scanner (System.in)) {
			boolean choose = false;
			
			while (choose == false) {
				System.out.println("1. Obtener el índice de masa corporal del paciente");
				System.out.println("2. Obtain the patient's body mass index");
				System.out.println("3. ¿Tiene el paciente obesidad abdominal? / Has the patient abdominal obesity?");
				System.out.println("4. Numero de pacientes totales / Total number of patients");
				System.out.println("5. Altura media / Average height");
				System.out.println("6. Peso medio / Average weight");
				System.out.println("7. IMC medio / Average BMI");
				
				int opcion = sc.nextInt();
				sc.nextLine();
				
				if (opcion == 1) {
					System.out.println("Introduzca la altura en metros (ej: 1,20): ");
					double altura = sc.nextDouble();
					System.out.println("Introduzca el peso en kilogramos (ej: 63,5): ");
					double peso = sc.nextDouble();
					System.out.println(eur.imc(altura, peso));
				} else if (opcion == 2) {
					System.out.println("Enter the height in feet (ej: 3,20): ");
					double altura = sc.nextDouble();
					System.out.println("Enter the weight in weight pounds (ej: 100,5): ");
					double peso = sc.nextDouble();
					System.out.println(am.imc(altura, peso));
				} else if (opcion == 3) {
					System.out.println("Introduzca el género del paciente / Enter the gender of the patient (Ej. M/F): ");
					char gender = sc.next().charAt(0);
					System.out.println("Introduzca el radio de circunferencia en cm / Enter the radius of circumference in cm (Ej. 80,6): ");
					double circun = sc.nextDouble();
					System.out.println(imc.tieneObesidadAbdominal(gender, circun));
				} else if (opcion == 4) {
					System.out.println(imcproxy.numPacientes());
				}else if (opcion == 5) {
					System.out.println(imcproxy.alturaMedia());
				} else if (opcion == 6) {
					System.out.println(imcproxy.pesoMedio());
				} else if (opcion == 7) {
					System.out.println(imcproxy.imcMedio());
				}
			}
		}
	}

}
