package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {


	public static String getData(String columnName) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/april2020", "root", "root");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from users");		
	while (rs.next()) {
		return rs.getString(columnName);
	
	}
		return columnName;
	
	
	
	
	/*public static String getData(String columnName) throws ClassNotFoundException, SQLException {
		//Setting properties for mySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating Connection to local DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/april2020", "root", "Qazwsx12!");
		//Empowering the con reference avaliable to execute queries 
		Statement smt = con.createStatement();
		//Delivering the SQL Query
		ResultSet rs = smt.executeQuery("select * from users");

		while (rs.next()) {
			return rs.getString(columnName);

		}

		return columnName;

	}*/

	}}
