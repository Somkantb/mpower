package com.DatabaseNServlets.Servlet;
import java.sql.*;
public class databaseCreationC {
	//PreparedStatement pr;
	Connection con1;
	Connection con2;
	public void connectd() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","root123$");
		 
	}
	
	public int created() throws SQLException {
		PreparedStatement pr = con1.prepareStatement("create database mpowerlogic;");
		int num = pr.executeUpdate();
		return num;
	}
	
	public void createtab() throws SQLException {
		con2 =DriverManager.getConnection("jdbc:mysql://localhost:3306/mpowerlogic ","root","root123$");
		
		PreparedStatement pr2 = con2.prepareStatement("create table consultants (id int not null auto_increment, name varchar(25), constraint PK_consultants primary key(id ));");
		int num2 = pr2.executeUpdate();
		PreparedStatement pr3 = con2.prepareStatement("create table task (taskid int not null auto_increment, taskname varchar(25), taskdescription varchar(100),taskduration int, constraint PK_consultants primary key(taskid ));");
		int num3 = pr3.executeUpdate();
		PreparedStatement pr4 = con2.prepareStatement("create table status (statusid int not null auto_increment, consultantid int, ttaskid int, taskstarttime int, taskendtime int, grade varchar (15), constraint pk_status primary key (statusid), constraint fk_status foreign key (consultantid) references consultants(id), constraint fk_status1 foreign key (ttaskid) references task(taskid));");
		int num4 = pr4.executeUpdate();
		
	}
	

public static void main(String[] args) throws Exception, SQLException {
		
 databaseCreationC dbc = new databaseCreationC();
 dbc.connectd();
 dbc.created();
 dbc.createtab();
 dbc.con1.close();
 dbc.con2.close();
 
	}

}
