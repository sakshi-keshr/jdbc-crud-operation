package com.jdbcbasic;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class student {

	public static void main(String[] args) {
		 
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc_project_assignment3";
			String user="root";
			String password="Amitabh_98";
			
			 connection=DriverManager.getConnection(url, user, password);
			
			Statement statement=connection.createStatement();

			String insert1="insert into student values(103,'Gita','gita134@gmail.com')";
			
			statement.execute(insert1);
			System.out.println("data inserted");
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
