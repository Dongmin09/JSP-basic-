<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- j_security_check : 우리는 목적지가 이미 있음. 
		폼 기반 인증(로그인) 처리 action 속성 값
		로그인 인증
		권한이 있는가?
		..............
		j_username과 j_password는 정해져 잇는대로 사용하는 것임
		-->
	<form name="loginForm" action="j_security_check" method="post">
		<p>ID : <input type="text" name="j_username" /></p>
		<p>비밀번호 : <input type="password" name="j_password" /></p>
		<p><input type="submit" name="로그인" /></p>
	</form>
</body>
</html>