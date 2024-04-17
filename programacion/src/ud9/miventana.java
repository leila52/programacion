package ud9;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class miventana {
	static JFrame ventana;
	static JPanel panel;
	public static void main(String[] args) {
		/*inicialmente
		 * 1-la ventana no es visible(Lo ultimo)
		 * 2-tiene tamaño 0
		 * 3-no esta especificado el funcionamiento de la x*/ 
		ventana= new JFrame("mi primera ventana");
		//establecemos la localizacion y tamaño de la ventana
		ventana.setBounds(100, 100, 200, 200);
		//ESTABLECEMOS EL FUNCIONAMIENTO AL CERRAR LA VENTANA
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creamos una lamina  la añadimos a laventana
		panel= new JPanel();
		ventana.add(panel);
		agregaComponentesAlPanel();
		//hacemos visinle la ventana
		ventana.setVisible(true);
	
	}
	public static void agregaComponentesAlPanel() {
		JLabel etiquetanombre= new JLabel("nombre");
		panel.add(etiquetanombre);
		JTextField Camponombre = new JTextField(10);
		panel.add(Camponombre);
		JButton boton =new JButton("saluda");
		panel.add(boton);
		
			
	}

}
