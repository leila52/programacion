package ud9;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaTresEnRaya extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton[] botones;
	private JButton botonReiniciar;
	private JLabel etiquetaResultado;
	private boolean esTurnoJugador1;
	private int[] tablero;
	
	public VentanaTresEnRaya() {
		super("Tres en Raya");
		setBounds(100, 100, 200, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
		esTurnoJugador1=true;
		tablero=new int[9];
	}
	public void construirPanel() {
		panel=new JPanel();
		botones=new JButton[9];
		for (int i=0;i<9;i++) {
			botones[i]=new JButton("");
			botones[i].setPreferredSize(new Dimension(60,60));
			botones[i].addActionListener(this);
			panel.add(botones[i]);
		}
		botonReiniciar=new JButton("Reiniciar");
		botonReiniciar.addActionListener(this);
		panel.add(botonReiniciar);
		
		etiquetaResultado=new JLabel("Se esta jugando");
		panel.add(etiquetaResultado);
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//se ha pulsado el boton reiniciar
		if (e.getSource()==botonReiniciar) {
			reiniciar();
			return;
		}
		int numeroBotonPulsado=0;
		for (int i=0;i<9;i++) { //obtenemos la casilla pulsada
			if (e.getSource()==botones[i]) {
				numeroBotonPulsado=i;
			}
		}
		if ((esTurnoJugador1) && (casillaVacia(numeroBotonPulsado))
				&& (!ganaJugador(2)) && (quedanCasillas()))
		{ //si es el turno del jugador 1 ->X
			tablero[numeroBotonPulsado]=1;
			botones[numeroBotonPulsado].setText("X");
			esTurnoJugador1=false;
		}
		if ((!esTurnoJugador1) && (casillaVacia(numeroBotonPulsado))
				&& (!ganaJugador(1)) && (quedanCasillas())) 
		{//si es el turno del jugador 1 ->O
			tablero[numeroBotonPulsado]=2;
			botones[numeroBotonPulsado].setText("O");
			esTurnoJugador1=true;
		}
		
		
		if (ganaJugador(1)) {
			etiquetaResultado.setText("Ha ganado el jugador 1");
		}
		if (ganaJugador(2)) {
			etiquetaResultado.setText("Ha ganado el jugador 2");
		}
		if (!ganaJugador(1) && !ganaJugador(2) && !quedanCasillas()) {
			etiquetaResultado.setText("Hay empate entre jugadores");
		}
		
			
	}
	public boolean quedanCasillas() {
		for(int i=0;i<9;i++) {
			if (tablero[i]==0)
				return true; 
		}
		return false;
	}
	public boolean casillaVacia(int pos) {
		if (tablero[pos]==0)
			return true;
		
		return false;
	}
	
	public boolean ganaJugador(int jugador) {
		//columnas
		for(int i=0;i<3;i++) {
			if ((tablero[i]==jugador)&&(tablero[3+i]==jugador)
				&&(tablero[6+i]==jugador)){
				return true;
			}
			if ((tablero[i*3]==jugador)&&(tablero[1*3+1]==jugador)
					&&(tablero[1*3+2]==jugador)){
					return true;
				}
		}
		//diagonal
		if ((tablero[0]==jugador) && (tablero[4]==jugador)&& 
				(tablero[8]==jugador))
			return true;
		if ((tablero[2]==jugador) && (tablero[4]==jugador)&& 
				(tablero[6]==jugador))
			return true;
			
		return false;
	}
	
	public void reiniciar() {
		for (int i=0;i<9;i++) {
			tablero[i]=0;
			botones[i].setText("");
		}
	}
	
	
}