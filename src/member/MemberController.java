package member;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Seperator;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/member/main.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private String directory,view; 

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("커멘드방식으로 전환"+request.getParameter("cmd"));
		Seperator.init(request, response);
		String page = request.getParameter("page");
		String cmd = request.getParameter("cmd");
		if (!page.equals("")) {
			request.getRequestDispatcher("/WEB-INF/member/"+page+".jsp")
			.forward(request, response);
		} 
		MemberService service = MemberServiceImpl.getInstance();
		switch (Seperator.command.getAction()) {
		case "main":
		/*	this.dispatch(request, response, Seperator.command.getDirectory()+"/"+Seperator.command.getAction());*/
			
			break;
		/*case "login":
			String name = service.login(this.init(request));
			request.setAttribute("result", name);
			if (!name.equals("")) {
				this.directory = "global";
				this.view = "main";
			}
			break;*/
		case "regist":
			MemberBean m2 = new MemberBean();
			m2.setId(request.getParameter("id"));
			m2.setPw(request.getParameter("pw"));
			m2.setName(request.getParameter("name"));
			m2.setSsn(request.getParameter("ssn"));
			service.regist(m2);
			
				this.directory = "global";
				this.view = "login";
			break;
		default:
			break;
		}
	}
		
		/*try {
			this.dispatch(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	public void dispatch(HttpServletRequest request, HttpServletResponse response,String page) throws Exception{
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/"+page+".jsp");
		dis.forward(request, response);
	}
}
