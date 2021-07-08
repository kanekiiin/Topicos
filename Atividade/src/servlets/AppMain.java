package servlets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import com.mysql.cj.protocol.Resultset;

import database.ConnectionFactory;

public class AppMain {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connFactory = new ConnectionFactory();
		connFactory.getConnection();
		Connection conn = connFactory.getConnection();
	
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tb_product");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()){
			System.out.println("ID do produto: " + result.getLong("id") + " Nome: " + result.getString("name"));
		}
	} 
}
