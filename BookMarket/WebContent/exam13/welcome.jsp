<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10/18 13장 4번 숙제</title>
</head>
<body>
<% 
		String user_id = (String)session.getAttribute("userID"); // a001

		if(user_id.equals("")){
			// session 기본 객체의 userID라는 name속성의 값으로 user_id 변수에
			// user_id 변수에 들어있는 값 admin가 setting이 됨
			response.sendRedirect("session_out.jsp");
			
			
		}else{
			out.println("세션 설정 성공");
			out.println(user_id + "님 환영합니다.");
			
			
		}
		
		out.println("<a href='session_out.jsp'>로그아웃<a/>");
%>
</body>
</html>