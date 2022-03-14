package dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.Emp;
import collections.EmpApp;

@WebServlet("/addEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/Html");
		PrintWriter out= response.getWriter();
		
		String id = request.getParameter("id"); 
		int pid = Integer.parseInt(id);
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String salary = request.getParameter("salary");
		double earn = Double.parseDouble(salary);
		
		EmpApp ep = new EmpApp();
		Emp em = new Emp(pid,name,city,earn);
		
		out.write(ep.addEmp(em));
		
	}

}
