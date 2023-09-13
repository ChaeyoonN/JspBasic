<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/JspBasic/cookie/login" method="post">
		<input type="text" name="id" size="10" placeholder="ID" value="${cookie.remember_id.value}">
		<input type="checkbox" name="rememberId" value="true"> <small style="font-size: 0.7em">아이디 기억하기</small>
		
		<br><!-- 0.7em: 부모크기의 0.7배 의미, rem: html 폰트크기 기준 -->
		<input type="password" name="pw" size="10" placeholder="PW"> <br>
		<input type="submit" value="로그인"> <br>
		
	</form>
	
	
</body>
</html>