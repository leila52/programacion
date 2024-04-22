package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adivino implements ActionListener {
	private JFrame ventana;
	private JPanel panel;
	private JLabel num1,resultado;
	private JTextField camponum1,camporesultado;
	public Adivino() {
		/*inicialmente
		 * 1-la ventana no es visible(Lo ultimo)
		 * 2-tiene tamaño 0
		 * 3-no esta especificado el funcionamiento de la x*/ 
		ventana= new JFrame("Adivino");
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
		Random ale=new Random();
		int numadivinar=ale.nextInt(5);
		num1= new JLabel("es mayor que 50 ");
		panel.add(num1);
		camponum1 = new JTextField();
		panel.add(camponum1);
		
		resultado= new JLabel("resultado=");
		panel.add(resultado);
		camporesultado=new JTextField(10);
		//asi no se puede editar
		camporesultado.setEditable(false);
		panel.add(camporesultado);
		JButton pregunta =new JButton("enviar");
		pregunta.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String respuesta = camponum1.getText();
		int intentos =6;
		int result=0;
		if(respuesta.equals("si")) {
			intentos--;
			num1= new JLabel("es mayor que 75");
			panel.add(num1);
			camponum1 = new JTextField();
			panel.add(camponum1);
			respuesta = camponum1.getText();
			if(respuesta.equals("si")) {
				result=79;
			}
		}
		camporesultado.setText(result+"");
		
	}

}
