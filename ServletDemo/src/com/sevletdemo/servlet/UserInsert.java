package com.sevletdemo.servlet;
import java.sql.*;
public class UserInsert {



public void inserd(String user, String passwd, String cpasswd,String pn, String eml, String sts) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appusers","root","root123$");
	System.out.println(user+ passwd+  cpasswd+ pn+  eml+  sts);
	PreparedStatement ps= con.prepareStatement("insert into userupadate(username,password,confirmpassword,phonenumber,email,status) values(?,?,?,?,?,?); ");
	ps.setString(1, user);
	ps.setString(2, passwd);
	ps.setString(3, cpasswd);
	ps.setString(4, pn);
	ps.setString(5, eml);
	ps.setString(6, sts);
	ps.executeUpdate();
	con.close();
}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
