<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10/19 3번 숙제</title>
</head>
<body>
<%
Cookie[] userid = request.getCookies();

if(userid[0] == null){
	response.sendRedirect("cookie_out.jsp");
}
%>

<h3><%= userid[0].getValue() %>님 반갑습니다.</h3>
<a href="cookie_out.jsp">로그아웃</a>
</body>
</html>