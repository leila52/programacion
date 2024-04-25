package ud9;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ud4.booleano;

public class TresEnRaya extends JFrame implements ActionListener   {
	
    private JPanel panel;
    private JLabel estadisticas;
    private JButton [] botones;
    private boolean esturnox,juegoterminado;

    public TresEnRaya() {
    	super("TRES EN RAYA");
        setBounds(100, 100, 200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirpanel();
        setVisible(true);
        esturnox=true;
        juegoterminado=false;
        
        

        
    }
    public void construirpanel(){
    	panel=new JPanel();
    	add(panel);
    	botones=new JButton[9];
    	for(int i=0;i<9;i++) {
    		botones[i]=new JButton("");
    		botones[i].setPreferredSize(new Dimension(60,60));
    		botones[i].addActionListener(this);
    		panel.add(botones[i]);
    	}
    	estadisticas=new JLabel("se esta juegando");
    	panel.add(estadisticas);
    	add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	int numerobotonespulsados=0;
    	for(int i=0;i<9;i++) {
    		if(e.getSource()==botones[i]) {
    			numerobotonespulsados=i;
    		}
    	}
    	if(esturnox) {
    		botones[numerobotonespulsados].setText("X");
    		esturnox=false;
    	}else {
    		botones[numerobotonespulsados].setText("0");
    		esturnox=true;
		}
    	estadisticas();
    }
    private void estadisticas() {
    	String[]simbolos= {"x","o"};
    	for(String simbolo : simbolos) {
    		for(int i=0;i<3;i++) {
    			if(botones[i].getText().equals(simbolo) && botones[i + 3].getText().equals(simbolo) && botones[i + 6].getText().equals(simbolo) ||
    					botones[i +1].getText().equals(simbolo) && botones[i +4].getText().equals(simbolo) && 
    					botones[i+7].getText().equals(simbolo)|| botones[i+2].getText().equals(simbolo) && botones[i + 5].getText().equals(simbolo) && botones[i + 8].getText().equals(simbolo)){
					estadisticas.setText("el jugador del simbolo "+simbolo +"ha ganado");
					juegoterminado = true;
                 	return;
    			}
    		}
    		//otro caso
    		if (botones[0].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[8].getText().equals(simbolo) ||
                    botones[2].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[6].getText().equals(simbolo)) {
                    estadisticas.setText("¡" + simbolo + " ha ganado!");
                    juegoterminado = true;
                    return;
                }
            }
            if (esEmpate()) {
                estadisticas.setText("¡Empate!");
                juegoterminado = true;
            }
    	}
    private boolean esEmpate() {
    	for(int i=0;i<9;i++) {
    		if(botones[i].getText().isEmpty()) {
    			return false;
    		}
    	}return true;
    	
    }
}
