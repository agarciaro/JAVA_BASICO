package com.sopra.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static final String URL = "jdbc:h2:file:c://BBDD//tienda";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASSNAME = "org.h2.Driver";
	
	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName(DRIVER_CLASSNAME);
		ResultSet rs = null;
		try (
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement statement = connection.createStatement();
		){
			connection.setAutoCommit(false);
			
			try {
				statement.executeUpdate("UPDATE FABRICANTE SET nombre = UPPER(nombre) WHERE codigo = 3");
				rs = statement.executeQuery("SELECT codigo, nombre FROM FABRICANTES");
				System.out.println("COD \t NOMBRE");
				while(rs.next()) {
					System.out.println( rs.getInt("codigo") + "\t " + rs.getString("nombre"));
				}
				
				connection.commit();
			} catch (Exception e) {
				connection.rollback();
				throw e;
			}
		}catch (SQLException e) {
			System.err.println("Fallo Sql: " + e.getMessage());
		}finally {
			try {
				if(rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				System.err.println("Error al Cerrar ResultSet");
			}
		}
		
		System.out.println("FIN");
	}

}
