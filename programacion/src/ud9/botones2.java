package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class botones2 extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton boton ;
	private JButton boton2;
	private JLabel campotextosaluda ;
	private JLabel etiquetanombre;
	private JTextField Camponombre;
	
	public  botones2() {
		super("ventana con dos botones");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construirPane();
		setVisible(true);
	}
	private void construirPane() {
		panel=new JPanel();
		boton=new JButton("boton1");
		boton.addActionListener(this);
		panel.add(boton);
		boton2=new JButton("boton2");
		panel.add(boton2);
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			System.out.println("has pulsado el boton uno");
		}else {
			System.out.println("as pulsado el boton 2");
		}
		
	}
}
