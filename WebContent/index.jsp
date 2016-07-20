<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <jsp:include page="/WEB-INF/global/top.jsp"/>
<jsp:include page="/WEB-INF/global/header.jsp"/>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>
<div class="box">
	<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다</h2>
	<a href="<%=ctx %>/WEB-INF/member/service/regist.jsp">회원가입 하러 가기</a> <br />
	<a href="<%=ctx %>/WEB-INF/member/service/login.jsp">로그인 하러 가기</a><br />
	<a href="<%=ctx %>/WEB-INF/global/main.jsp">글로벌 메인</a>
</div> --%>
<form action="${context}/home.do">
<input type="submit" value="홈으로가기" />
</form>