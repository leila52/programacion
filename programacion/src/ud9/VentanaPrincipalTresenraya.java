package ud9;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipalTresenraya extends JFrame{
	public VentanaPrincipalTresenraya() {
		super("TRES EN RAYA");
        setBounds(100, 100, 200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnJugadorVsJugador = new JButton("Jugador vs Jugador");
        JButton btnJugadorVsMaquina = new JButton("Jugador vs Máquina");

        btnJugadorVsJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaJugadorVsJugador();
            }
        });
        btnJugadorVsMaquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaJugadorVsMaquina();
            }
        });

       

        JPanel panel = new JPanel();
        panel.add(btnJugadorVsJugador);
        panel.add(btnJugadorVsMaquina);
        add(panel);

        setVisible(true);
    }

    private void abrirVentanaJugadorVsJugador() {
        TresEnRaya ventanaJuego = new TresEnRaya();
        this.setVisible(false);
    }


    private void abrirVentanaJugadorVsMaquina() {
    	TresEnRayaMaquinaJugador m =new TresEnRayaMaquinaJugador();
        this.setVisible(false);
    }
}
