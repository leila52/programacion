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
	//añadir botones para volver a la pagina principal y6 reiniciar la partida
    private JPanel panel;
    private JLabel estadisticas;
    private JButton [] botones;
    private JButton reiniciar;
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
    	reiniciar=new JButton("reiniciar");
    	reiniciar.addActionListener(this);
    	panel.add(reiniciar);
    	add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	    	if(e.getSource()==reiniciar) {
	    		activarbotones();
	    		estadisticas.setText("Se está jugando");
	            juegoterminado = false;
	            return;
	        }
    	
    		int numerobotonespulsados=0;
        	//obtener la casilla pulsada
        	for(int i=0;i<9;i++) {
        		if(e.getSource()==botones[i]) {
        			numerobotonespulsados=i;
        		}
        	}
        	//turno jugador uo es x
        	if(esturnox) {
        		botones[numerobotonespulsados].setText("X");
        		botones[numerobotonespulsados].setEnabled(false);
        		esturnox=false;
        	}
        	//turno del jugaor dos se poe 0
        	else {
        		botones[numerobotonespulsados].setText("O");
        		botones[numerobotonespulsados].setEnabled(false);
        		esturnox=true;
    		}
        	estadisticas();
        	
    	}
    
    private void estadisticas() {
    	    String[] simbolos = {"X", "O"};
    	    for (String simbolo : simbolos) {
    	        for (int i = 0; i < 3; i++) {
    	            //  columnas
    	            if (botones[i].getText().equals(simbolo) && botones[i + 3].getText().equals(simbolo) && botones[i + 6].getText().equals(simbolo)) {
    	                estadisticas.setText("El jugador " + simbolo + " ha ganado");
    	                juegoterminado = true;
    	                descativarbotones();
    	                return;
    	            }
    	            // filas
    	            if (botones[i * 3].getText().equals(simbolo) && botones[i * 3 + 1].getText().equals(simbolo) && botones[i * 3 + 2].getText().equals(simbolo)) {
    	                estadisticas.setText("El jugador " + simbolo + " ha ganado");
    	                juegoterminado = true;
    	                descativarbotones();
    	                return;
    	            }
    	        
    	        // diagonales
    	        if (botones[0].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[8].getText().equals(simbolo) ||
    	            botones[2].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[6].getText().equals(simbolo)) {
    	            estadisticas.setText("El jugador " + simbolo + " ha ganado");
    	            juegoterminado = true;
    	            descativarbotones();
    	            return;
    	        }
    	      
    	    if (esEmpate()) {
    	        estadisticas.setText("¡Empate!");
    	        juegoterminado = true;
    	        descativarbotones();
    	    }
    	        }
    	    }
    	}
    private void activarbotones() {
    	for(int i=0;i<botones.length;i++) {
    		botones[i].setText("");
    		botones[i].setEnabled(true);
    	}
    }
    private void descativarbotones() {
    	for(int i=0;i<botones.length;i++) {
    		botones[i].setEnabled(false);
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
