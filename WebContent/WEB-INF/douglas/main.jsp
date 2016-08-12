<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/nav.jsp"/>

<link rel="stylesheet" href="${css}/douglas.css" />
<div id="container">
<section>
	<button id="bt_bom">BOM(Browser Object Model)</button><br />
	<button id="bt_dom">DOM(Document Object Model)</button><br />
	<button id="bt_kaup">KAUP</button><br />
	<button id="bt_account">ACCOUNT</button>
</section>
<script src="${js}/douglas.js"></script>
<script src="${js}/application.js"></script>
	<jsp:include page="../global/footer.jsp"/>
	<jsp:include page="../global/end.jsp"/>
	<script>
	douglas.init();
	</script>
