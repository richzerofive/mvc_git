package grade;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Seperator;

/**
 * Servlet implementation class GradeController
 */
@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Seperator.init(request, response);
		switch (Seperator.command.getAction()) {
		case "move":break;
		case "regist":break;
		case "login":break;
		case "deposit":break;
		default:
			break;
		}
		
	}

	

}
