<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세정보</title>
<link rel="stylesheet" href="${css}/member.css" />
<style>
</style>
</head>
<body>
<!-- id,name,regDate,gender,profileImg -->
	<div class ="box">
		<h1>회원 상세정보</h1> <br>
		
		<table id = "member_detail">
			<tr>
				<td rowspan="4" style = "width:30%">
				<img src="${img}/style_5.jpg" alt="W3Schools.com" width="104" 
			height="142">
			</td>
				<td style ="width:20%" class = "font_bold bg_color_green">ID</td>
				<td style ="width:40%">${member.profileImg}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">이 름</td>
				<td>${member.profileImg}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">성 별</td>
				<td></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">생년월일</td>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_green">등록일</td>
				<td colspan="2"></td>
				
			</tr>
		</table>
		<a href="${context}/member/memberController.jsp"><img src="${img}/home.jpg"
				alt="home" style="width: 30px"></a> <a href="${context}/index.jsp"><img
				src="${img}/home3.png" alt="home" style="width: 30px"></a>
	</div>

</body>
</html>