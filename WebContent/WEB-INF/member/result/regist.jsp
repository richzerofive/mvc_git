<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원가입</title>
<link rel="stylesheet" href="${context}/css/member.css" />
<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float: left
}

div.joinDiv {
	border: 1px dotted gray;
	width: 80%;
	margin: 10px 50px 10px 50px
}
</style>
</head>
<body>
	<div class="box">
	<% 
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String ssn = request.getParameter("ssn");
		
		response.sendRedirect("");
				%>
		<a href="${context}/member/memberController.jsp"><img src="${img}/home.jpg"
			alt="home" style="width: 30px"></a> <a href="${context}/index.jsp"><img
			src="${img}/home3.png" alt="home" style="width: 30px"></a>
	</div>
</body>
</html>