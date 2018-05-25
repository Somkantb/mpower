package com.sevletdemo.servlet;
import java.io.IOException;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserUpdate extends GenericServlet {
public void init() {
	System.out.println("init");
}


@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String username = req.getParameter("uname");
	String password = req.getParameter("upw");
	String confirpassword = req.getParameter("upwc");
	if (password.equals(confirpassword)) {
	String phonenumber = req.getParameter("uphone");
	String email = req.getParameter("umail");
	String status = req.getParameter("status");

	UserInsert user = new UserInsert();
	//System.out.println(username+ password+ confirpassword+ phonenumber+ email+ status);
	try {
		//System.out.println(username+ password+ confirpassword+ phonenumber+ email+ status);
		user.inserd(username, password, confirpassword, phonenumber, email, status);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	}
	else {
		System.out.println("paswword does not match");
}
}
}
