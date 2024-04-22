package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ud4.booleano;

public class Calculadora implements ActionListener {
	private JFrame ventana;
	private JPanel panel;
	private JLabel num1,num2, resultado;
	private JTextField camponum1,camponum2,camporesultado;
	private JButton suma, resta, multiplicacion, division;
	
	public Calculadora() {
		/*inicialmente
		 * 1-la ventana no es visible(Lo ultimo)
		 * 2-tiene tamaño 0
		 * 3-no esta especificado el funcionamiento de la x*/ 
		ventana= new JFrame("Calculadora");
		//establecemos la localizacion y tamaño de la ventana
		ventana.setBounds(100, 100, 400, 300);
		//ESTABLECEMOS EL FUNCIONAMIENTO AL CERRAR LA VENTANA
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creamos una lamina  la añadimos a laventana
		panel= new JPanel();
		ventana.add(panel);
		agregaComponentesAlPanel();
		//hacemos visinle la ventana
		ventana.setVisible(true);
	
	}
	private void agregaComponentesAlPanel() {
		num1= new JLabel("operador1");
		panel.add(num1);
		camponum1 = new JTextField(10);
		panel.add(camponum1);
		
		num2=new JLabel("operador2");
		panel.add(num2);
		camponum2=new JTextField(10);
		panel.add(camponum2);
		
		//resultado
		resultado= new JLabel("resultado=");
		panel.add(resultado);
		camporesultado=new JTextField(10);
		//asi no se puede editar
		camporesultado.setEditable(false);
		panel.add(camporesultado);
		
		//asociamos el boton en concreto con la respuesta dicho evento
		suma=new JButton("+");
		suma.addActionListener(this);
		panel.add(suma);
		resta=new JButton("-");
		resta.addActionListener(this);
		panel.add(resta);
		multiplicacion=new JButton("x");
		multiplicacion.addActionListener(this);
		panel.add(multiplicacion);
		division=new JButton("/");
		division.addActionListener(this);
		panel.add(division);
		
		
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//cogeremos los operadores y el resultado q sera 0
		double op1 = Double.parseDouble(camponum1.getText());
		double op2 = Double.parseDouble(camponum2.getText());
		double result=0;
		boolean divisionporcero=false;
		
		if(e.getSource()==suma) {
			result=op1+op2;
		}else if(e.getSource()==resta){
			result=op1-op2;
		}
		else if(e.getSource()==multiplicacion){
			
			result=op1*op2;
		}
		else if(e.getSource()==division){
			
			if(op2 !=0) {
				result=op1/op2;
			}else {
				divisionporcero=true;
			}
		}
		//set el resultado 
		if(divisionporcero== false) 
			camporesultado.setText(result+"");
		else {
			camporesultado.setText("error operador2 !=0");
		}
	}

}
