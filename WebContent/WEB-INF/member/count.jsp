<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="${css}/global.css" />
	<link rel="stylesheet" href="${css}/member.css" />
	<jsp:include page="../global/top.jsp" />
	<jsp:include page="../global/header.jsp" />
	<jsp:include page="../global/nav.jsp" />

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
		<div class="box">
		<h1>회원수 페이지</h1><br />
		<span style="font-size:50px;color:red">${count} 명</span>
		
			<a href="${context}/global.do"><img src="${img}/home.jpg"
		alt="home" style="width: 30px"></a> <a href="${context}/main.do"><img
		src="${img}/home3.png" alt="home" style="width: 30px"></a>
		</div>
	</div>
	<jsp:include page="../global/footer.jsp"/>
	<jsp:include page="../global/end.jsp"/>
