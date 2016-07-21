<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "member.MemberService" %>
	<%@ page import = "member.MemberServiceImpl" %>
	<%@ page import = "member.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>비번수정</title>
	<link rel="stylesheet" href="${css}/css/member.css" />
</head>
<body>
	<div class="box">
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean bean = new MemberBean();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		bean.setId(id);
		bean.setPw(pw);
		service.update(bean);
			%> 
			<h2>수정완료</h2>
			<a href="${context}/member/memberController.jsp"><img src="${img}/home.jpg"
			alt="home" style="width: 30px"></a> <a href="${context}/index.jsp"><img
			src="${img}/home3.png" alt="home" style="width: 30px"></a>
		</div>
</body>
</html>