<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수</title>
<link rel="stylesheet" href="${css}/css/member.css" />
</head>
<style type="text/css">
div.box {
	border: 5px solid powderblue;
	margin: 0 auto;
	width: 500px;
	text-align: center;
}
</style>
<body>
	<div style="width: 500px; margin: 0 auto; text-align: center;">
		<h1>회원수 페이지</h1>
		<div class="box">
		<a href="${context}/member/result/count.jsp">인원수 체크하기</a>
			<a href="${context}/member/memberController.jsp"><img src="${img}/home.jpg"
				alt="home" style="width: 30px"></a> <a href="${context}/index.jsp"><img
				src="${img}/home3.png" alt="home" style="width: 30px"></a>
		</div>
	</div>
</body>
</html>