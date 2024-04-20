package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventanascondosbotones implements ActionListener {
	private JFrame ventana1,ventana2;
	private JButton boton1,boton2;
	private boolean ventana1visible=true;
	
	public Ventanascondosbotones() {
		ventana1 =new JFrame("ventana 1");
        boton1 = new JButton("ir a ventana 2");
        boton1.addActionListener(this);
        ventana1.add(boton1);
        ventana1.setBounds(100, 100, 300, 300);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //segunda ventana
        ventana2 =new JFrame("ventana 2");
        boton2 = new JButton("ir a ventana 1");
        boton2.addActionListener(this);
        ventana2.add(boton2);
        ventana2.setBounds(100, 100, 300, 300);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //mostrar la primera por defecto
        ventana1.setVisible(true);
        ventana2.setVisible(false);
	
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(ventana1visible) {
			ventana1.setVisible(false);
			ventana2.setVisible(true);
			ventana1visible=false;
		}else {
			ventana1.setVisible(true);
			ventana2.setVisible(false);
			ventana1visible=true;
		}
		
	}
}
