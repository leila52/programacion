package ud9;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class TresEnRayaMaquinaJugador extends JFrame implements ActionListener{
	private JPanel panel;
    private JLabel estadisticas;
    private JButton[] botones;
    private JButton reiniciar,botonvolver;
    private boolean esTurnoJugador, juegoTerminado;
    private VentanaPrincipalTresenraya ventanaPrincipal;
    
    public TresEnRayaMaquinaJugador (VentanaPrincipalTresenraya ventanaPrincipal) {
    	super("TRES EN RAYA");
    	this.ventanaPrincipal = ventanaPrincipal;
        setBounds(100, 100, 200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        setVisible(true);
        esTurnoJugador = true;
        juegoTerminado = false;
    }

    public void construirPanel() {
        panel = new JPanel();
        add(panel);
        botones = new JButton[9];
        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("");
            botones[i].setPreferredSize(new Dimension(60, 60));
            botones[i].addActionListener(this);
            panel.add(botones[i]);
        }
        estadisticas = new JLabel("Se está jugando");
        panel.add(estadisticas);
        reiniciar=new JButton("reiniciar");
    	reiniciar.addActionListener(this);
    	panel.add(reiniciar);
    	botonvolver= new JButton("volver a la página principal");
    	botonvolver.addActionListener(this);
    	panel.add(botonvolver);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==reiniciar) {
    		reiniciar();
            return;
        }
    	if (e.getSource() == botonvolver) {
            volverAPaginaPrincipal();
        }
    	if (juegoTerminado) {
            return;
        }

        JButton botonPulsado = (JButton) e.getSource();
        if (!botonPulsado.getText().isEmpty()) {
            return;
        }

        if (esTurnoJugador) {
            botonPulsado.setText("X");
            
        } else {
            moverMaquina();
        }

        esTurnoJugador = !esTurnoJugador;
        actualizarEstadisticas();
    }
    private void volverAPaginaPrincipal() {
    	// ocultar la ventana actual y mostrar la ventana principal
    	 this.setVisible(false);
         ventanaPrincipal.setVisible(true);
    }
    private void moverMaquina() {
        int posicion;
        do {
        	Random ale = new Random();
            posicion = ale.nextInt(9);
        } while (!botones[posicion].getText().isEmpty());

        botones[posicion].setText("O");
    }

    private void actualizarEstadisticas() {
        if (haGanado("X")) {
            estadisticas.setText("¡Has ganado!");
            juegoTerminado = true;
            desactivarBotones();
        } else if (haGanado("O")) {
            estadisticas.setText("¡Has perdido!");
            juegoTerminado = true;
            desactivarBotones();
        } else if (esEmpate()) {
            estadisticas.setText("¡Empate!");
            juegoTerminado = true;
            desactivarBotones();
        } 
    }

    private boolean haGanado(String jugador) {
        for (int i = 0; i < 3; i++) {
            if (botones[i].getText().equals(jugador) && botones[i + 3].getText().equals(jugador) && botones[i + 6].getText().equals(jugador)) {
                return true;
            }
            if (botones[i * 3].getText().equals(jugador) && botones[i * 3 + 1].getText().equals(jugador) && botones[i * 3 + 2].getText().equals(jugador)) {
                return true;
            }
        
        if (botones[0].getText().equals(jugador) && botones[4].getText().equals(jugador) && botones[8].getText().equals(jugador)) {
            return true;
        }
        if (botones[2].getText().equals(jugador) && botones[4].getText().equals(jugador) && botones[6].getText().equals(jugador)) {
            return true;
        }
        }
        return false;
    }
    private void reiniciar() {
    	for(int i=0;i<botones.length;i++) {
    		botones[i].setText("");
    		botones[i].setEnabled(true);
    	}
    	estadisticas.setText("Se está jugando");
        juegoTerminado = false;
        esTurnoJugador = true;
    }
    private void desactivarBotones() {
        for (int i=0;i<botones.length;i++) {
            botones[i].setEnabled(false);
        }
    }
    private boolean esEmpate() {
        for (JButton boton : botones) {
            if (boton.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
