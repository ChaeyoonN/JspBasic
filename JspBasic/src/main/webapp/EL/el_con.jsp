<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--
    	<% 
    		String name = (String) request.getAttribute(name); 
    		String nick = (String) request.getAttribute(nick); 
    	%> 
    --%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	<p>
		# 이름: <%=name %> <br>
		# 별명: <%=nick %> 
	</p>   
--%>

	<p>
		# 이름: ${param.name} <br>
		# 별명: ${param.nick} 
	</p>
	
	<% //톰캣이 jsp파일을 class파일로 바꿀 때 어차피 내장객체 불러오기 때문에 객체 바로 불러올 수 있음
	session.setAttribute("data1", "hello~!");
	application.setAttribute("data2", "bye~!");
	%>
	
	<a href="el_result.jsp">세션, 어플리케이션 데이터를 화면에 출력하기</a>
	
</body>
</html>