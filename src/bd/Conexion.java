package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	//Instancia de clase Connection.
	private Connection conexion;
	
	//Variable para la gestión de la conexión.
	private String host = "localhost: 3306";
	private String bd = "recursoshumanosapp";
	
	private String usuario = "root";
	private String contraseña = "";
	
	private String url = "jdbc:mysql://" + host + "/";
	
	//Creación de Metodo para abrir y cerrar conexión.
	
	public Connection conectar() {
		
		try {
			 //Carga de libreria mysql-connector
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuario, contraseña);
			
			/*if (conexion != null){
			  system.out.println("Conexion exitosa a la BD:" +bd);
			  
			  }*/
			
			Statement stmt = conexion.createStatement();
			
			String sqlBd = "CREATE DATABASE IF NOT  EXISTS recursoshumanosapp";
			stmt.execute(sqlBd);
			
			conexion.close();
			
			conexion = DriverManager.getConnection(url + bd, usuario, contraseña);
			stmt = conexion.createStatement();
			
			String sqlTabla = "CREATE TABLE IF NOT EXISTS trabajador (DNI VARCHAR(15)NOT NULL,"
					+ "Nombre VARCHAR(50)NOT NULL,"
					+ "Apellido VARCHAR(50)NOT NULL,"
					+ "Direccion VARCHAR(100)NOT NULL,"
					+ "Email VARCHAR(50)NOT NULL,"
					+ "Telefono FLOAT(50)NOT NULL,"
					+ "Edad INT(11)NOT NULL,"
					+ "Cargo VARCHAR(50)NOT NULL,"
					+ "Sexo BIT(1)NOT NULL,"
					+ "EsExtranjero BIT(1)NOT NULL,"
					+ "Primary key (DNI))"
					+ "ENGINE=InnoDB DEFAULT CHARSET=latin1";
			
			stmt.execute(sqlTabla);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error en la conexión " + e);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//Devolucion de conexion para su uso por otra clase.
		return this.conexion;
					
			
		}
	}


