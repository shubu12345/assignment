package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.Emp;
import collections.EmpApp;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("Text/Html");
		PrintWriter out= resp.getWriter();
		
		out.write("<h1>Employee managment</h1>");
		
	}
}
