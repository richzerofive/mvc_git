<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/nav.jsp"/>
<script src="${js}/douglas.js"></script>
<div id="container">
<section id="formbox">
	<form name="form">
	<p>DOM 학습장</p>
	</section>
	<section id="databox">
	<p>결과 : </p> <span id="result"></span></section>
	</div>
	<jsp:include page="../global/footer.jsp"/>
	<jsp:include page="../global/end.jsp"/>
	<script>
	douglas.init();
	</script>
