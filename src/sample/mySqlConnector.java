package sample;

import java.sql.*;

public class mySqlConnector{  

	public static void main(String args[]){  

	try{  
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/intelligenttesting","root","");
		//here project is database name, root is username and password is ics324
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from question");

		while(rs.next()) 
		{ 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
			//rs.getInt(1) is the first column and rs.getString(2) is the second column..
			//You have to take care of the mapping on your own here.
		}
		con.close();  
	}

	catch(Exception e){ System.out.println(e);}  
	}  
}  