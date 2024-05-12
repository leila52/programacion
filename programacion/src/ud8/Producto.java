package ud8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Producto {
	private Connection miConexion;
	private int cod_producto,stock;
	private String nom_producto;
	
	
	public Producto() {
		//conectar base de datos
        try {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Producto", "user", "password");
            cargardatos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	private void cargardatos() {
		String instruccion = "select * from producto";
		try {
            Statement statement = miConexion.createStatement();
            ResultSet resultSet = statement.executeQuery(instruccion);
            if (resultSet.next()) {
                cod_producto = resultSet.getInt("cod_producto");
                nom_producto = resultSet.getString("nom_producto");
                stock = resultSet.getInt("stock");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
	}
	public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
