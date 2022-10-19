<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10/19 3번 숙제</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id"); //admin
		String user_pw = request.getParameter("passwd"); //1234
	
		if(user_id.equals("admin")&&user_pw.equals("admin1234")){
			
			Cookie cookie_id = new Cookie("userID", user_id);
			Cookie cookie_pw = new Cookie("userPW", user_pw);
			response.addCookie(cookie_id);
			response.sendRedirect("welcome1.jsp");
			
			/* response.sendRedirect("welcome.jsp"); */
		}else{
			out.println("세션 연결에 실패했습니다.");
		}
	%>
</body>
</html>