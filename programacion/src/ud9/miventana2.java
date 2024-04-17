package ud9;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class miventana2 implements ActionListener{
	private JFrame ventana;
	private JPanel panel;
	private JLabel campotextosaluda ;
	private JLabel etiquetanombre;
	private JTextField Camponombre;
	
	public miventana2() {
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
	private void agregaComponentesAlPanel() {
		etiquetanombre= new JLabel("nombre");
		panel.add(etiquetanombre);
		 Camponombre = new JTextField(10);
		panel.add(Camponombre);
		//asociamos el boton en concreto con la respuesta dicho evento
		JButton boton =new JButton("saluda");
		boton.addActionListener(this);
		panel.add(boton);
		
		campotextosaluda=new JLabel("hola jejej");
		panel.add(campotextosaluda);
		
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//RESPUESTA al evento del click de raton
		//hara las acciones una vez pulsada el boton
		
		String saludo= "hola "+Camponombre.getText();
		campotextosaluda.setText(saludo);
		
	}

}
