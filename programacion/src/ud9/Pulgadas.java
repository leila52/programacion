package ud9;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class Pulgadas implements ActionListener {
		private JFrame ventana;
	    private JPanel panel;
	    private JLabel pulgadas;
	    private JLabel cm;
	    private JTextField campopulgadas;
	    private JTextField campocm;
	    private JButton botoncambiaracm,botoncambiarapulgadas;

	    public Pulgadas() {
	    	ventana = new JFrame("Pulgadas");
	        ventana.setBounds(100, 100, 400, 200);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        panel = new JPanel();
	        ventana.add(panel);
	        //label de pulgadas con su campo 
	        pulgadas = new JLabel("pulgadas:");
	        panel.add(pulgadas);
	        //campo
	        campopulgadas = new JTextField(20);
	        panel.add(campopulgadas);
	        //boton para cambiar pulgadas a cm
	        botoncambiaracm = new JButton("cambiar a cm ");
	        botoncambiaracm.addActionListener(this);
	        panel.add(botoncambiaracm);

	        //label de cm
	        cm = new JLabel("cm:");
	        panel.add(cm);
	       //campo de cm
	        campocm = new JTextField(20);
	        panel.add(campocm);
	        
	        //boton para cambiar cm a pulgadas
	        botoncambiarapulgadas = new JButton("cambiar a pulgada");
	        botoncambiarapulgadas.addActionListener(this);
	        panel.add(botoncambiarapulgadas);

	        ventana.setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	        if (e.getSource() == botoncambiaracm) {
	        	cambiarpulgadaacm();
	            
	        }
	        if(e.getSource() == botoncambiarapulgadas) {
	        	cambiarcmapulgada();
	        }
	    }
	    
	    private void cambiarcmapulgada() {
	    	double cm = Double.parseDouble(campocm.getText());
	    	double pulgadas= cm /2.54;
	    	 campopulgadas.setText(pulgadas+"");
	    	
	    }
	    
	    private void cambiarpulgadaacm() {
	    	double pulgadas = Double.parseDouble(campopulgadas.getText());
	    	double cm= pulgadas *2.54;
	    	 campocm.setText(cm+"");
	    }
	}


