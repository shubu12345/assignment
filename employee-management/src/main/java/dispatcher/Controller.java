package dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");

		switch (data) {
		case "findEmp":
			RequestDispatcher rd = request.getRequestDispatcher("/findEmp");
			rd.forward(request, response);
			break;

		case "addEmp":
			RequestDispatcher rd1 = request.getRequestDispatcher("/addEmp");
			rd1.forward(request, response);
			break;

		case "list":
			RequestDispatcher rd2 = request.getRequestDispatcher("/list");
			rd2.forward(request, response);
			break;

		default:
			response.sendError(404);
			break;
		}
	}	

}
