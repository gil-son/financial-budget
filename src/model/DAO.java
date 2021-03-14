package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	
	/* CRUD CREATE*/
	
	public void insertBudget(JavaBeans budget) {
		String create = "INSERT INTO budget(thedescription, thecategory, thevalue, thestatus) VALUES(?,?,?,?)";
		
		try {
			// Open Connection
			Connection con = connection();
			
			// Prepare a query to run on database
			PreparedStatement pst = con.prepareStatement(create);
			
			// Substituted the parameters (?) to content of the variables Javabeansubstitued the parameters (?) to content of the variables Javabeans
			pst.setString(1, budget.getDescription());
			pst.setString(2, budget.getCategory());
			pst.setString(3, budget.getValue());
			pst.setString(4, budget.getStatus());
			
			// Run Query
			pst.executeUpdate(); 
			
			// Stop Database Connection
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* CRUD READ */
	public ArrayList<JavaBeans> listBudgets(){
		// Creating an object to access a JavaBeans class
		ArrayList<JavaBeans> budget = new ArrayList<>();
		
		String read = "SELECT * FROM budget ORDER BY thevalue desc";
		try {
			Connection con = connection();
			PreparedStatement pst = con.prepareStatement(read);
			
			// It is part of JDBC and temporarily returns data from the database to an object
			ResultSet rs = pst.executeQuery();
			
			//The loop will be obtained as long as there is budget
			while (rs.next()) {		
				//  Support variables that receive the data from database
				String  id_budget = rs.getString(1); // int id_budget = rs.getInt(1);
				String thedescription = rs.getString(2);
				String thecategory = rs.getString(3);
				String thevalue = String.valueOf(rs.getDouble(4));
				String thestatus = rs.getString(5);
				String date = rs.getString(6); // Date date = rs.getDate(6);
				
				// Writing in ArrayList
				budget.add(new JavaBeans(id_budget, thedescription, thecategory, thevalue, thestatus, date));
			}
				con.close();
				return budget;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
}
