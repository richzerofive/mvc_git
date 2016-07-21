<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 	div{border: 1px solid powderblue;width: 200px;margin: 0 auto;text-align:center;}
 	</style>
</head>
<body>
	<div id="" class="memberclass">
	회원관리<br/>
	<ol>
		<li><a href="${context}/member/regist.do">회원가입</a></li>
		<li><a href="${context}/member/login.do">로그인</a></li>
		<li><a href="${context}/member/logout.do">로그아웃</a></li>
		<li><a href="${context}/member/show.do">내정보보기</a></li>
		<li><a href="${context}/member/update.do">내정보수정</a></li>
		<li><a href="${context}/member/retire.do">탈퇴</a></li>
		<li><a href="${context}/member/list.do">회원목록</a></li>
		<li><a href="${context}/member/searchid.do">검색</a></li>
		<li><a href="${context}/member/count.do">회원수</a></li>
	</ol>
	<a href="home.do"><img src="${context}/home.jpg" alt="home" style="width: 30px"></a>
		
	</div>
</body>
</html>