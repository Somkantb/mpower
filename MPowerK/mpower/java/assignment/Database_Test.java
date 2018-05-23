package mpower.java.assignment;
import java.sql.*;
public class Database_Test {
	
	

	public static void main(String[] args) throws SQLException {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root123$");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from person");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2) );
			//System.out.println(rs.getString(2));
		}
		int nv = st.executeUpdate("insert into person (person_id,fname,lname,gender,birth_date, street, city, state,country,postal_code) values(4,'Govardhan','V','M','1992-01-01',' Beach','Chennai', 'TN','India','450123')");
		//System.out.println(nv);
	}

}
