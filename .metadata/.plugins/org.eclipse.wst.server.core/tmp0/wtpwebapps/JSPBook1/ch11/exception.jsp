<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Exception</title>
</head>
<body>
	<!-- exception_process.jsp : URL 
		...?num1=10&num2=3 : 요청퍼라미터(HTTP 파라미터)
		request.getParmaterNames() = return타입? Enumeration
	-->
	<form action="exception_process.jsp" method="post">
		<p>숫자 1 : <input type="text" name="num1" /></p>
		<p>숫자 2 : <input type="text" name="num2" /></p>
		<p><button type="submit">나누기</button></p>
	</form>
</body>
</html>