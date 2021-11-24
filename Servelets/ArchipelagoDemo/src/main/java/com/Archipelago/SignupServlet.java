package com.Archipelago;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String email = req.getParameter("email");
		String password= req.getParameter("password");
		PrintWriter pw=res.getWriter();
		pw.println("login denied "+"email: "+email+",Password: "+password+"try Signing up");
	}

}
