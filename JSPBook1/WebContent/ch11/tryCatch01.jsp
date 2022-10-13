<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Exception</title>
</head>
<body>
	<%	// 스크립틀릿
		// 페이지 우선순위
		// 1.errorPage 2.web.xml 3.tryCatch
		try{
			int num = 10/0;
			request.getParameter("name").toString();
		}catch(NumberFormatException e){
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("/errorNullPointer.jsp");
			// tryCatch01.jsp 실행을 멈추고, errorNullPointer.jsp 요청
			dispatcher.forward(request, response);
		}
		out.print("집가고싶다.");
	%>

</body>
</html>