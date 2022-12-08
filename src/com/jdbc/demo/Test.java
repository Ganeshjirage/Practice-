package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// same
			// make the connection(url,hostname ,DB name, username,password)
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root",
					"Justdoit@0405");
			// sql query
			String sql = "insert into customers(Customer_name,Custmomer_city,Mobile_number,Email) values('xyz','Pune','8765757557','xyz@gmail.com')";
			// by statement
			Statement stmt = connection.createStatement();

			stmt.execute(sql);
			System.out.println("Successfylly done ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
