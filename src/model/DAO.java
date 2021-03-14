package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/*Module to connection*/
	
	// Parameters to connection
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/financial_budget?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";
	
	
	// Methods to connection
	private Connection connection() {
		Connection con = null;
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	// Connection Test
	/*public void connectionTest() {
		try {
			Connection con = connection();
			System.out.println(con); // show a String
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/
}
