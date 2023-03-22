package gu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class Calcbmi extends JFrame {

	private JTextField resultadobmi;
	private JTextField resultadocateg;
	private JButton btnbmi;
	private JButton btnobsabd;
	private JSpinner masa;
	private JSpinner altura;
	private JSpinner abdcirc;
	private JTextField resultadoabdobs;
	private JRadioButton btnm;
	private JComboBox comboBoxgen;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcbmi window = new Calcbmi();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public Calcbmi() {
		setBounds(100, 100, 451, 558);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		resultadobmi = new JTextField();
		resultadobmi.setFont(new Font("Verdana", Font.PLAIN, 14));
		resultadobmi.setHorizontalAlignment(SwingConstants.RIGHT);
		resultadobmi.setBounds(55, 196, 162, 30);
		getContentPane().add(resultadobmi);
		resultadobmi.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULO BMI Y CATEGOR\u00CDA");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(83, 10, 296, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MASA(KG)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(127, 42, 81, 18);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ALTURA(M)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(225, 42, 97, 18);
		getContentPane().add(lblNewLabel_2);
		
		altura = new JSpinner();
		altura.setModel(new SpinnerNumberModel(1.70, 0.0, 2.50, 0.01));
		altura.setFont(new Font("Verdana", Font.PLAIN, 14));
		altura.setBounds(239, 62, 67, 31);
		getContentPane().add(altura);
		
		resultadocateg = new JTextField();
		resultadocateg.setHorizontalAlignment(SwingConstants.CENTER);
		resultadocateg.setFont(new Font("Verdana", Font.PLAIN, 14));
		resultadocateg.setBounds(224, 196, 162, 31);
		getContentPane().add(resultadocateg);
		resultadocateg.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(110, 180, 45, 13);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CATEGOR\u00CDA");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(252, 180, 106, 13);
		getContentPane().add(lblNewLabel_3_1);
		
		btnbmi = new JButton("BMI");
		btnbmi.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnbmi.setBounds(189, 103, 67, 67);
		getContentPane().add(btnbmi);
		
		masa = new JSpinner();
		masa.setModel(new SpinnerNumberModel(70.00, 0.00, 550.00, 0.01));
		masa.setFont(new Font("Verdana", Font.PLAIN, 14));
		masa.setBounds(134, 63, 67, 31);
		getContentPane().add(masa);
		
		JLabel lblNewLabel_4 = new JLabel("OBESIDAD ABDOMINAL");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_4.setBounds(83, 243, 296, 30);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GENERO");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(189, 278, 67, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CIRCUNFERENCIA ABDOMINAL (CM)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(83, 333, 308, 18);
		getContentPane().add(lblNewLabel_6);
		
		abdcirc = new JSpinner();
		abdcirc.setModel(new SpinnerNumberModel(80.00, 0.00, 200.00, 0.01));
		abdcirc.setFont(new Font("Verdana", Font.PLAIN, 14));
		abdcirc.setBounds(189, 352, 67, 30);
		getContentPane().add(abdcirc);
		
		btnobsabd = new JButton("OBESIDAD ABDOMINAL");
		btnobsabd.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnobsabd.setBounds(121, 395, 209, 60);
		getContentPane().add(btnobsabd);
		
		resultadoabdobs = new JTextField();
		resultadoabdobs.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoabdobs.setFont(new Font("Verdana", Font.PLAIN, 14));
		resultadoabdobs.setBounds(172, 465, 106, 30);
		getContentPane().add(resultadoabdobs);
		resultadoabdobs.setColumns(10);
		
		comboBoxgen = new JComboBox();
		comboBoxgen.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		comboBoxgen.setToolTipText("");
		comboBoxgen.setFont(new Font("Verdana", Font.PLAIN, 14));
		comboBoxgen.setBounds(172, 293, 106, 30);
		getContentPane().add(comboBoxgen);

		setVisible(true);
	}
	
	public double getInputValueMasa() {
		double valor = (Double)masa.getValue();
		return valor;
	}
	
	public double getInputValueAltura() {
		double valor = (Double)altura.getValue();
		return valor;
	}
	
	public Character getInputValueGender() {
		String genero = ((String) comboBoxgen.getSelectedItem()).strip();
		Character valor = null;
		if (genero.equals("Femenino")) {
			valor = 'F';
		} else if (genero.equals("Masculino")) {
			valor = 'M';
		}
		return valor;
		
	}
	
	public double getInputValueAbdCirc() {
		double valor = (Double)abdcirc.getValue();
		return valor;
	}
	
	public void setResutadoBMI(double res) {
		resultadobmi.setText(String.valueOf(res));
	}
	
	public void setResutadoCateg(String res) {
		resultadocateg.setText(res);
	}
	
	public void setResutadoAbdObs(String res) {
		resultadoabdobs.setText(res);
	}
	
	public void registrarControlador(ActionListener ctrl) {
		btnbmi.addActionListener(ctrl);
		btnbmi.setActionCommand("BMI");
		btnobsabd.addActionListener(ctrl);
		btnobsabd.setActionCommand("OBESIDAD ABDOMINAL");
	}
	
	
}
