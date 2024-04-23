package ud9_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame implements ActionListener{
	
	private JPanel jPanel;
	private JButton jButton;
	private Ventana2 v2;
	
	public Ventana1() {
		super("Ventana 1");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	
	public void setVentana2(Ventana2 v2) {
		this.v2=v2;
	}
	
	private void construirPanel() {
		jPanel=new JPanel();
		jButton=new JButton("Usar");
		jButton.addActionListener(this);
		jPanel.add(jButton);
		add(jPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		v2.setVisible(true);
	}
}
