package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora implements ActionListener {
	private JFrame ventana;
	private JPanel panel;
	private JLabel campotextosaluda ;
	private JLabel num1;
	private JLabel num2;
	private JLabel resultado;
	private JTextField camponum1,camponum2,camporesultado;
	
	public Calculadora() {
		/*inicialmente
		 * 1-la ventana no es visible(Lo ultimo)
		 * 2-tiene tamaño 0
		 * 3-no esta especificado el funcionamiento de la x*/ 
		ventana= new JFrame("Calculadora");
		//establecemos la localizacion y tamaño de la ventana
		ventana.setBounds(100, 100, 300, 300);
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
		num1= new JLabel("TBoperador1");
		panel.add(num1);
		 camponum1 = new JTextField(10);
		panel.add(camponum1);
		//asociamos el boton en concreto con la respuesta dicho evento
		JButton boton =new JButton("sumar");
		boton.addActionListener(this);
		panel.add(boton);
		
		campotextosaluda=new JLabel("hola jejej");
		panel.add(campotextosaluda);
		
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//RESPUESTA al evento del click de raton
		//hara las acciones una vez pulsada el boton
		
		String saludo= "hola "+camponum1.getText();
		campotextosaluda.setText(saludo);
		
	}

}
