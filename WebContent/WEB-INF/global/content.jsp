<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	div.memberClass{font-size: 20px}
</style>
<div id="" class="memberClass box">
	
	<h1>계좌관리</h1>
	<div style="width: 300px;margin: 0 auto;text-align: left;">
	<ol>
		<li><a href="${context}/regist.jsp">개설</a></li>
		<li><a href="${context}/deposit.do">입금</a></li>
		<li><a href="${context}/withdraw.do">출금</a></li>
		<li><a href="${context}/update.do">비번수정 </a></li>
		<li><a href="${context}/delete.do">해지</a></li>
		<li><a href="${context}/list.do">목록 </a></li>
		<li><a href="${context}/search.do">조회 </a></li>
		<li><a href="${context}/count.do">통장수</a></li>
	</ol>
	</div>
	<a href="../index.jsp">
		<img src="../img/home.png" alt="home" style="width: 30px"/>
	</a>
</div>