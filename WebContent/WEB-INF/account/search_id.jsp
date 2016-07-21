<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!doctype html>
	<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<title>아이디로 검색</title>
	</head>
	<body>
	<div class="box">
			<form action="${context}/member/result/search_id.jsp" method="post">
				<span class="meta">검색할 ID</span> <input type="text" name="id" /><br />
				<a href="${context}/member/memberController.jsp"><img
					src="${img}/home.jpg" alt="home" style="width: 30px"></a> <a
					href="${context}/index.jsp"><img src="${img}/home3.png"
					alt="home" style="width: 30px"></a> <br /> <br /> <br /> <input
					type="submit" value="검색" /> <input type="reset" value="취소" />
			</form>
		</div>
	</body>
	</html>