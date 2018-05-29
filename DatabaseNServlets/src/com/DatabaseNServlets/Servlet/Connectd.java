package com.DatabaseNServlets.Servlet;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connectd {
	static Connection con;
 public void connect() throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","root123$");
 }
}
