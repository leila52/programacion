package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adivino extends JFrame implements ActionListener{
	//atributos
	private JPanel panel;
	private JLabel lNumero;
	private JButton bMayor, bMenor, bAcierto;
	private int numero,maximo,minimo;

	
	//constructor
	public Adivino() {
		super("Ventana Adivinar");
		minimo=1;
		maximo=100;
		setBounds(100,200,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		dameUnNumeroAleatorio();
		construirPanel();
		setVisible(true);
	}
	public void construirPanel() {
		panel = new JPanel();
		
		lNumero=new JLabel("El numero que pensaste es el "+numero);
		panel.add(lNumero);
		
		bMayor=new JButton("MAYOR");
		bMayor.addActionListener(this);
		panel.add(bMayor);
		
		bMenor=new JButton("MENOR");
		bMenor.addActionListener(this);
		panel.add(bMenor);
		
		bAcierto=new JButton("ACIERTO");
		bAcierto.addActionListener(this);
		panel.add(bAcierto);
		
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("MAYOR")) {
			minimo=numero+1;
			dameUnNumeroAleatorio();
			lNumero.setText("El numero que buscas es el "+numero);
			
		}
		
		if(e.getActionCommand().equals("MENOR")) {
			maximo=numero-1;
			dameUnNumeroAleatorio();
			lNumero.setText("El numero que buscas es el "+numero);
			
		}
		if((e.getActionCommand().equals("ACIERTO"))) {
			lNumero.setText("Has acertado!!!");
		}
		
	}
	
	private void dameUnNumeroAleatorio() {
		Random random=new Random();
		numero=random.nextInt(maximo+1-minimo)+minimo;
		System.out.println("Max:"+maximo+" Min:"+minimo+" Numero:"+numero);
	}


}

