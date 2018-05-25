package mpower.java.assignment;
import java.sql.*;
public class DatabaseCreation {
	 PreparedStatement ps;
	 PreparedStatement ps1;
   //Statement st;
  // ResultSet rs;
   Connection con;
   Connection con1;
   int num;
   int num1;
  // public void conn() throws ClassNotFoundException, SQLException {
	//   Class.forName("com.mysql.cj.jdbc.Driver");
	  // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","root123$");
	  // con.close();
	   
   //}
   
 //  public void conn1() throws ClassNotFoundException, SQLException {
	  // Class.forName("com.mysql.cj.jdbc.Driver");
	//   con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","root123$");
	  // con1.close();
  // }
   public void createdb() throws SQLException, ClassNotFoundException {
	  // Class.forName("com.mysql.cj.jdbc.Driver");
	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","root123$");
	   ps=con.prepareStatement("create database testingDB;" );
	   num= ps.executeUpdate();
	   con.close();
	  
   } 
  
   public void createtab() throws SQLException {
	 //  Class.forName("com.mysql.cj.jdbc.Driver");
	   con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingDB","root","root123$");
	  // con1.close();
	  
	  ps1 =con1.prepareStatement("create table customer (customer_id int , customer_name varchar (20));");
	   		 /*"password varchar(20),confirm_password(20),phoneno varchar(20),"+
	   		 " emcontact varchar (40),joining_date date,scheme varchar(30),"+
	   		 " status varchar(10), constraint PK_customer primary key(customer_id)); ");*/
       num1= ps1.executeUpdate();
      if (num>0) {
    	  System.out.println("table created");
      }
      else
    	  System.out.println("not created");//con.close();
      con1.close();
   }
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
		DatabaseCreation dat = new DatabaseCreation();
		//dat.conn();
	    dat.createdb();
	    //dat.conn1();
	    dat.createtab();
	}

}
