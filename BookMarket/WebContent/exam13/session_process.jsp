<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10/18 13장 4번 숙제</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");
		

		
		if(user_id.equals("admin")&&user_pw.equals("admin1234")){
			session.setAttribute("userID", user_id); // {"userID" : "admin"}
			session.setAttribute("userPW", user_pw); // {"userPW" : "1234"}
			response.sendRedirect("welcome.jsp");
			
			/* response.sendRedirect("welcome.jsp"); */
		}else{
			session.setAttribute("userID", ""); // {"userID" : "admin"}
			session.setAttribute("userPW", ""); // {"userPW" : "1234"}
			response.sendRedirect("welcome.jsp");
		}
	
	%>
</body>
</html>