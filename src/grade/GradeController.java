package grade;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.DispatcherServlet;
import global.Seperator;
import javafx.scene.control.Separator;

/**
 * Servlet implementation class GradeController
 */
@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=========GradeController=============");
		Command c = Seperator.init(request,response);
		DispatcherServlet.send(request, response, Seperator.init(request, response));
	}

}

