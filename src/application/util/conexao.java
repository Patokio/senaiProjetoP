package application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	//endereço do banco de dados
	private static final String URL = "jbdc:mysql://localhost:3306/DB";
	//usuario banco de daos
	private static final String USER = "root";
	//senha do banco de dados
	private static final String PASS = "MaLe0606";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
