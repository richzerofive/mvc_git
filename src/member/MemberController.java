package member;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.DispatcherServlet;
import global.Seperator;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/member.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===member 컨트롤러진입=====");
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean bean =  new MemberBean();
		Seperator.init(request, response);
		switch (Seperator.command.getAction()) {
		case "login":
			System.out.println("=====로그인 진입=====");
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			String name = service.login(bean);
			if (name.equals("")) {
				Seperator.command.setPage("login");
				Seperator.command.setView();
			} else {
				Seperator.command.setDirectory(request.getParameter("directory"));
				request.setAttribute("abc", name);
			}
			break;
		case "regist":
			System.out.println("===========case:regist===========");
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			bean.setName(request.getParameter("name"));
			System.out.println(bean);
			bean.setSsn(request.getParameter("ssn"));
			bean.setRegDate();
			System.out.println("두번째 빈"+bean);
			service.regist(bean);
			if (service.regist(bean)==1) {
				Seperator.command.setPage("login");
				Seperator.command.setView();
			} else {
				Seperator.command.setPage("home");
			}
			break;
		default:
			break;
		}
		DispatcherServlet.send(request, response, Seperator.command);
	}
		
	
}
