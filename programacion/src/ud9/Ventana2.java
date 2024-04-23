package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana2 extends JFrame implements ActionListener{

	private JPanel jPanel;
	private JButton jButton;
	private Ventana1 v1;
	
	public Ventana2() {
		super("Ventana 2");
		setBounds(500, 500, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(false);
	}
	
	private void construirPanel() {
		jPanel=new JPanel();
		jButton=new JButton("Volver");
		jButton.addActionListener(this);
		jPanel.add(jButton);
		add(jPanel);
	}
	
	public void setVentana1(Ventana1 v1) {
		this.v1=v1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		v1.setVisible(true);
	}

}
