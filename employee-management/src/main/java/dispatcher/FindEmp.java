package dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.EmpApp;


@WebServlet("/findEmp")
public class FindEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/Html");
		PrintWriter out= response.getWriter();
		
		String id = request.getParameter("id"); 
		int pid = Integer.parseInt(id);
		
		EmpApp ep = new EmpApp();
		out.write(ep.findEmp(pid));
	}

}
