package member;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.ParamMap;
import global.Seperator;
import subject.SubjectBean;
import subject.SubjectMember;
import subject.SubjectService;
import subject.SubjectServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/member.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===member 컨트롤러진입=====");
		HttpSession session = request.getSession();
		MemberService service = MemberServiceImpl.getInstance();
		SubjectService subjService = SubjectServiceImpl.getInstance();
		SubjectBean subject = new SubjectBean();
		SubjectMember sm = new SubjectMember();
		MemberBean bean =  new MemberBean();
		Seperator.init(request, response);
		switch (Seperator.command.getAction()) {
		case "move":
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "detail":
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "login":
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			sm=service.login(bean);
			if(bean.getId().equals("fail")){
				System.out.println("컨트롤러 : 로그인실패");
				Seperator.command.setPage("login");
				Seperator.command.setView();
			}else{
				System.out.println("컨트롤러 : 로그인성공");
				request.setAttribute("user", sm);
				session.setAttribute("user", sm);
				Seperator.command.setDirectory("global");
				Seperator.command.setView();
				System.out.println(("로그인 후 빈값"+sm));
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "regist":
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			bean.setName(request.getParameter("name"));
			bean.setSsn(request.getParameter("ssn"));
			bean.setRegDate();
			bean.setPhone(request.getParameter("phone"));
			bean.setEmail(request.getParameter("email"));
			System.out.println("전공 :::"+request.getParameter("major"));
			System.out.println("======================="+bean+"==================");
			if (service.regist(bean).equals("fail")) {
				System.out.println("컨트롤러 : 회원가입 실패");
				Seperator.command.setPage("regist");
				Seperator.command.setView();
			} else {
				System.out.println("컨트롤러 : 회원가입 성공");
				subject.setId(request.getParameter("id"));
				subject.setMajor(request.getParameter("major"));
				subject.setSubjects(ParamMap.getValues(request, "subject"));
				subjService.insert(subject);
				subject.setId(request.getParameter("id"));
				Seperator.command.setPage("login");
				Seperator.command.setView();
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "update":
			bean = (MemberBean) session.getAttribute("user");
			bean.setEmail(request.getParameter("email"));
			bean.setPw(request.getParameter("pw"));
			service.update(bean);
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "delete":
			bean = (MemberBean) session.getAttribute("user");
			session.invalidate();
			service.delete(bean);
			Seperator.command.setDirectory("home");
			Seperator.command.setPage("main");
			Seperator.command.setView();
			
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "logout":
			session.invalidate();
			Seperator.command.setDirectory("home");
			Seperator.command.setPage("main");
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "list":
			request.setAttribute("list", service.list());
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "find_by_id":
			request.setAttribute("member", service.findById(request.getParameter("keyword")));
			DispatcherServlet.send(request, response, Seperator.command);
			break;

		case "find_by_name":
			request.setAttribute("list", service.findBy(request.getParameter("keyword")));
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "count":
			System.out.println("카운트 진입");
			request.setAttribute("count", service.count());
			Seperator.command.setPage("count");
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		default:
			break;
		}
}
}