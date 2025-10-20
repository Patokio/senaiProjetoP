package application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	//endereço do banco de dados
	private static final String URL = "jdbc:mysql://localhost:3306/db";
	//usuario banco de daos
	private static final String USER = "root";
	//senha do banco de dados
	private static final String PASS = "MaLe0606";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
