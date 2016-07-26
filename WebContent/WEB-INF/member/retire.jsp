<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${css}/member.css" />
</head>
<body>
		<embed src="${img}/large.gif">
		<h1>탈퇴</h1>
		<div class="box">
			<form action="${context}/member/result/retire.jsp" method="post">
				<span class="meta">ID</span> <input type="text" name="id" /><br />
				<a href="${context}/global.do"><img src="${img}/home.jpg"
		alt="home" style="width: 30px"></a> <a href="${context}/main.do"><img
		src="${img}/home3.png" alt="home" style="width: 30px"></a>
					href="${context}/index.jsp"><img src="${img}/home3.png"
					alt="home" style="width: 30px"></a> <br /> <br /> <br /> <input
					type="submit" value="삭제" /> <input type="reset" value="취소" />
			</form>
		</div>
</body>
</html>