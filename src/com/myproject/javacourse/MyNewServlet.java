package com.myproject.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyNewServlet extends HttpServlet{
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
	
resp.setContentType("text/html");

double result1 = Math.PI * Math.pow(50,2) ;
String line1 = new String("<b>calculation 1:</b> Area of circle with radius 50"+
		" "+"is:"+" "+result1+" "+"square-cm.");

double degrees = 30.0;
double radians = Math.toRadians(degrees);
double result2 = Math.sin(radians)*50;
String line2 = new String ("<b>calculation 2:</b> Length of opposite where angle "
		+ "B is 30 degrees and Hypotenuse length is 50 cm is:"+" "+result2+" "+"cm."); 

double result3 = Math.pow(20,13);
String line3 = new String ("<b>calculation 3:</b> Power of 20 with exp of 13 is:"+
" "+result3);

String resultStr = line1 +"<br>" + line2+"<br>"+line3; 
resp.getWriter().println(resultStr);

       }
}




