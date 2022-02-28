package com.calculator;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PrimeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int num=(int)req.getAttribute("n");
		boolean prime=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		PrintWriter out=res.getWriter();
		if(prime==true)
			out.println("Prime number");
		else
			out.println("Not a prime number");
	}
}
