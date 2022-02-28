package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class CalcServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int n=Integer.parseInt(req.getParameter("num1"));
		int m=Integer.parseInt(req.getParameter("num2"));
		char ch=req.getParameter("op").charAt(0);
		PrintWriter out=res.getWriter();
		switch(ch) {
			case '+':
				out.println("Sum: "+(n+m));
				break;
			case '-':
				out.println("Difference: "+(n-m));
				break;
			case '*':
				out.println("Product: "+(n*m));
				break;
			case '/':
				out.println("Division: "+((float)n/m));
				break;
			default:
				out.println("Something went wrong");
		}
		req.setAttribute("n",(n+m));
		RequestDispatcher rd=req.getRequestDispatcher("prime");
		rd.forward(req, res);
	}
}
