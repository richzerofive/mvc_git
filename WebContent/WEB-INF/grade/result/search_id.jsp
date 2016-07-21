<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "member.MemberService" %>
	<%@ page import = "member.MemberServiceImpl" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
		<div class="box">
	<%
		MemberService service = MemberServiceImpl.getInstance();
		String id = request.getParameter("id");
		service.findById(id);
			%>
			<%= %> 
			<h2>결과</h2>
			<a href="${context}/member/memberController.jsp"><img src="${img}/home.jpg"
			alt="home" style="width: 30px"></a> <a href="${context}/index.jsp"><img
			src="${img}/home3.png" alt="home" style="width: 30px"></a>
		</div>
</body>
</html>