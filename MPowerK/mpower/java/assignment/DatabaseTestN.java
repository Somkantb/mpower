
package mpower.java.assignment;
import java.sql.*;
public class DatabaseTestN {
	int nv;
	Statement st;
	PreparedStatement prest;
	ResultSet rs;
	Connection con;
	public void connect()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root123$");
		 st = con.createStatement();
		
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void execQ()
	{
		try
		{
		rs = st.executeQuery("Select * from person");
		while (rs.next()) {
		System.out.println(rs.getInt(1)+ rs.getString (2)+rs.getString (3)+rs.getString (4)+rs.getString (5)+rs.getString (6)+rs.getString (7)+rs.getString (8)+rs.getString (9)+rs.getString (10));
	}}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		
	}
	public void updateQ()
	{
		try
		{
			nv =st.executeUpdate("insert into person (person_id,fname,lname,gender,city) values(7,'Amandeep','Hooda','M','Rohtak')");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void prestmt() throws SQLException
	{
		prest = con.prepareStatement("update person set lname = ? where person_id = ?");
		prest.setString(1, "Shyamam");
		prest.setInt(2, 5);
		prest.executeUpdate();
	}
	public static void main(String [] args)throws SQLException
	{
		DatabaseTestN DTN = new DatabaseTestN();
		DTN.connect();
		DTN.execQ();
		DTN.updateQ();
		DTN.prestmt();
	}

}
