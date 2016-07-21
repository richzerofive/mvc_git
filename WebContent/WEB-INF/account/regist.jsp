<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
	<link rel="stylesheet" href="${css}/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
	<div class="box">
	<form action="${context}/member/result/regist.jsp" method="post">
		<span class="meta">이름</span> <input type="text" name="name" /><br />
		<span class="meta">ID</span> <input type="text" name="id" /><br />
		<span class="meta">비밀번호</span> <input type="text" name="pw" /><br />
		<span class="meta">SSN</span> <input type="text" name="ssn" /><br />
		<span class="meta">전공</span> <br /><br />
		<input type="radio" name="major" value="computer" checked/> 컴공
		<input type="radio" name="major" value="mgmt" /> 경영
		<input type="radio" name="major" value="math" /> 수학
		<input type="radio" name="major" value="eng" /> 영문 <br /><br /><br />
		<span class="meta">수강과목</span> <br /><br />
		<input type="checkbox" name="subject" value="java"/> 자바
		<input type="checkbox" name="subject" value="sql"/> SQL
		<input type="checkbox" name="subject" value="cpp"/> C++
		<input type="checkbox" name="subject" value="python"/> 파이썬
		<input type="checkbox" name="subject" value="delphi"/> 델파이
	<br /><br /><br />
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
	</form>

	</div>
</body>
</html>