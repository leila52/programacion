package ud8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class carrito implements ActionListener {
    private JFrame ventana;
    private JPanel panel;
    private JLabel cod_producto, unidades, carrito;
    private JTextField campocod_producto, campounidades;
    private JTextArea campo_carrito;
    private JButton añadir, mostrar, hacer_pedido;

    private Connection miConexion;
    private ArrayList<Producto> listaCarrito;

    public carrito() {
        listaCarrito = new ArrayList<>();
        ventana = new JFrame("Carrito de la compra de Leilus");
        ventana.setBounds(100, 100, 400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        ventana.add(panel);

        cod_producto = new JLabel("Código Producto:");
        panel.add(cod_producto);
        campocod_producto = new JTextField(10);
        panel.add(campocod_producto);

        unidades = new JLabel("Unidades:");
        panel.add(unidades);
        campounidades = new JTextField(10);
        panel.add(campounidades);

        añadir = new JButton("Añadir al carrito");
        añadir.addActionListener(this);
        panel.add(añadir);

        mostrar = new JButton("Mostrar carrito");
        mostrar.addActionListener(this);
        panel.add(mostrar);

        hacer_pedido = new JButton("Hacer Pedido");
        hacer_pedido.addActionListener(this);
        panel.add(hacer_pedido);

        carrito = new JLabel("Carrito:");
        panel.add(carrito);

        campo_carrito = new JTextArea(10, 20);
        campo_carrito.setEditable(false);
        panel.add(campo_carrito);

        ventana.setVisible(true);

        conectarBaseDatos();
    }

    private void conectarBaseDatos() {
        try {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == añadir) {
            añadirAlCarrito();
        } else if (e.getSource() == mostrar) {
            mostrarCarrito();
        } else if (e.getSource() == hacer_pedido) {
            hacerPedido();
        }
    }

    private void añadirAlCarrito() {
        try {
            int codigoProducto = Integer.parseInt(campocod_producto.getText());
            int unidades = Integer.parseInt(campounidades.getText());

            String query = "SELECT * FROM productos WHERE cod_producto = ?";
            PreparedStatement statement = miConexion.prepareStatement(query);
            statement.setInt(1, codigoProducto);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int stockDisponible = resultSet.getInt("stock");
                if (stockDisponible >= unidades) {
                    Producto producto = new Producto();
                    producto.setCod_producto(resultSet.getInt("cod_producto"));
                    producto.setNom_producto(resultSet.getString("nom_producto"));
                    producto.setStock(unidades);

                    listaCarrito.add(producto);
                    JOptionPane.showMessageDialog(ventana, "Producto añadido al carrito.");
                } else {
                    JOptionPane.showMessageDialog(ventana, "No hay suficiente stock para añadir al carrito.");
                }
            } else {
                JOptionPane.showMessageDialog(ventana, "No se encontró el producto con el código especificado.");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(ventana, "Error al añadir producto al carrito.");
        }
    }

    private void mostrarCarrito() {
        campo_carrito.setText("");
        for (Producto producto : listaCarrito) {
            campo_carrito.append("Código: " + producto.getCod_producto() + ", Nombre: " + producto.getNom_producto() + ", Unidades: " + producto.getStock() + "\n");
        }
    }

    private void hacerPedido() {
        try {
            for (Producto producto : listaCarrito) {
                int codigoProducto = producto.getCod_producto();
                int unidades = producto.getStock();
                String query = "UPDATE productos SET stock = stock - ? WHERE cod_producto = ?";
                PreparedStatement statement = miConexion.prepareStatement(query);
                statement.setInt(1, unidades);
                statement.setInt(2, codigoProducto);
                statement.executeUpdate();
                statement.close();
            }
            JOptionPane.showMessageDialog(ventana, "Pedido realizado correctamente. Stock actualizado.");
            listaCarrito.clear();
            campo_carrito.setText("");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(ventana, "Error al realizar el pedido.");
        }
    }
}

