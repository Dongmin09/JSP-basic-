<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10/18 13장 4번 숙제</title>
</head>
<body>
	<form action="session_process.jsp" method="post">
		<p>아이디 :<input type="text" name="id" /></p>
		<p>비밀번호 :<input type="text" name="passwd" /></p>
		<p><button type="submit" >전송</button> </p>
	</form>
</body>
</html>