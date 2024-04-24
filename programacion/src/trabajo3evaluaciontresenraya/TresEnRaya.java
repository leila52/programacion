package trabajo3evaluaciontresenraya; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnRaya implements ActionListener {
    private JFrame ventana;
    private JPanel panel;
    private JButton[] botones;
    private JTextField campoResultado;
    private boolean turnoX;
    private boolean juegoTerminado;

    public TresEnRaya() {
        turnoX = true;
        juegoTerminado = false;

        ventana = new JFrame("Tres en Raya");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);

        panel = new JPanel(new GridLayout(4, 3));
        botones = new JButton[9];
        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("");
            botones[i].setFont(new Font("Arial", Font.PLAIN, 40));
            botones[i].addActionListener(this);
            panel.add(botones[i]);
        }

        for (int i = 1; i <= 9; i++) {
            JButton boton = new JButton(Integer.toString(i));
            boton.setFont(new Font("Arial", Font.PLAIN, 40));
            boton.addActionListener(this);
            panel.add(boton);
        }

        campoResultado = new JTextField(20);
        campoResultado.setEditable(false);
        panel.add(campoResultado);

        ventana.getContentPane().add(panel);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!juegoTerminado) {
            JButton botonPresionado = (JButton) e.getSource();
            if (botonPresionado.getText().isEmpty()) {
                botonPresionado.setText(turnoX ? "X" : "O");
                turnoX = !turnoX;
                actualizarResultado();
            }
        }
    }

    private void actualizarResultado() {
        String[] simbolos = {"X", "O"};
        for (String simbolo : simbolos) {
            for (int i = 0; i < 3; i++) {
                if (botones[i].getText().equals(simbolo) && botones[i + 3].getText().equals(simbolo) && botones[i + 6].getText().equals(simbolo) ||
                    botones[i * 3].getText().equals(simbolo) && botones[i * 3 + 1].getText().equals(simbolo) && botones[i * 3 + 2].getText().equals(simbolo)) {
                    campoResultado.setText("¡" + simbolo + " ha ganado!");
                    juegoTerminado = true;
                    return;
                }
            }
            if (botones[0].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[8].getText().equals(simbolo) ||
                botones[2].getText().equals(simbolo) && botones[4].getText().equals(simbolo) && botones[6].getText().equals(simbolo)) {
                campoResultado.setText("¡" + simbolo + " ha ganado!");
                juegoTerminado = true;
                return;
            }
        }
        if (esEmpate()) {
            campoResultado.setText("¡Empate!");
            juegoTerminado = true;
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TresEnRaya());
    }
}
