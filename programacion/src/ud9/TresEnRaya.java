package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TresEnRaya implements ActionListener   {
	private JFrame ventana;
    private JPanel panel;
    private JLabel estadisticas;
    private JButton pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9;

    public TresEnRaya() {
    	ventana = new JFrame("Pulgadas");
        ventana.setBounds(100, 100, 400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        ventana.add(panel);
        
        //boton 
        pos1 = new JButton("cambiar a cm ");
        pos1.addActionListener(this);
        panel.add(pos1);

        
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    }
}
