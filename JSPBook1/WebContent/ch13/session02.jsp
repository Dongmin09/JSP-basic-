<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Session</title>
</head>
<body>
	<% // 스크립틀릿 
		// session 기본 객체에 저장된 ueserID라는 속성 이름에 대응한 값을 가져옴
		String user_id = (String)session.getAttribute("userID");
		String user_pw = (String)session.getAttribute("userPW");
		
		out.println("userID :" + user_id);
		out.println("userPW :" + user_pw);
	
	%>

</body>
</html>