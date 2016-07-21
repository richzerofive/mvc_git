<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "member.MemberService" %>
	<%@ page import = "member.MemberServiceImpl" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="${css}/member.css" />
</head>
<body><div class="box">
<%
	MemberService service = MemberServiceImpl.getInstance();
	service.count();%>
	<%=service.count()%>명
	
	</div>
</body>
</html>