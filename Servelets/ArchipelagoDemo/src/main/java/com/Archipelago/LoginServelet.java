package com.Archipelago;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServelet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		String email = req.getParameter("email");
		String password=req.getParameter("password");
//		System.out.println("login success "+"email: "+email+",Password: "+password);
//		PrintWriter out = res.getWriter();
//		out.println("login success "+"email: "+email+",Password: "+password);
		
		System.out.println("enter 1 or 0 : ");
		Scanner sc=new Scanner(System.in);
		if(sc.equals("0")) {
			RequestDispatcher rd=req.getRequestDispatcher("signup");
			rd.forward(req, res);
			System.out.println("redirected");
		}else {
			//System.out.println("login success "+"email: "+email+",Password: "+password);
			PrintWriter out = res.getWriter();
			out.println("login success "+"email: "+email+",Password: "+password);
		}
		
	}

}
