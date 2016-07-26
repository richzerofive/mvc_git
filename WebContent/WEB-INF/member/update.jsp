<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="${css}/global.css" />
	<link rel="stylesheet" href="${css}/member.css" />
	<jsp:include page="../global/top.jsp" />
	<jsp:include page="../global/header.jsp" />
	<jsp:include page="../global/nav.jsp" />
<div class="box">
	<h1>회원 정보 수정</h1>
	<br>
	<form action="${context}/member.do" method="post">
		<table id="member_detail">
			<tr>
				<td rowspan="4" style="width: 30%"><img
					src="${img}/member/${user.profileImg}" alt="W3Schools.com"
					width="104" height="142"></td>
				<td style="width: 20%" class="font_bold bg_color_green">ID</td>
				<td style="width: 40%">${user.id}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">이 름</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">성 별</td>
				<td>${user.gender}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">비밀번호</td>
				<td><input type="text" name="PW" value="${user.gender}">
				</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">이메일</td>
				<td><input type="text" name="email" value="${user.email}">
				</td>
				<td>${user.gender}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">생년월일</td>
				<td colspan="2">${user.ssn}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">등록일</td>
				<td colspan="2">${user.regDate}</td>

			</tr>
		</table>
		<div style="margin: 0 auto">
			<input type="hidden" name="action" value="update" /> <input
				type="hidden" name="page" value="detail" /> <input type="submit"
				value="수정" /> <input type="reset" value="취소" />
		</div>
	</form>
	<br />
	<p></p>
	<a href="${context}/global.do"><img src="${img}/home.jpg"
		alt="home" style="width: 30px"></a> <a href="${context}/main.do"><img
		src="${img}/home3.png" alt="home" style="width: 30px"></a>
</div>
	<jsp:include page="../global/footer.jsp" />
	<jsp:include page="../global/end.jsp" />