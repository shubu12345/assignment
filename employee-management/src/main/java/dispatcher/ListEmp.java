package dispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.Emp;
import collections.EmpApp;

@WebServlet("/list")
public class ListEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String city = request.getParameter("city");

		EmpApp app = new EmpApp();

		for (String p : app.listEmpById(city)) {
			System.out.println(p);

		}
	}
}
