<%@ page  contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.BookVO"%>
<%@ page import="dao.BookRepository"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page errorPage="exceptionNoBookId.jsp" %>
<!DOCTYPE html>
<%
	String id = request.getParameter("id");
	
	BookRepository bookRepository = BookRepository.getInstance();//객체 생성
	
	BookVO bookVO = bookRepository.getBookById(id);
%>
<c:set var="bookVO" value="<%=bookVO %>" scope="page" />
<html>
<head>
<link rel="stylesheet" 
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>도서 목록</title>
<script type="text/javascript">
// 핸들러 함수(상품 주문 버튼 클릭 시 실행)
function addToCart() {
	let result = confirm("도서을 장바구니에 추가하시겠습니까?");
	
	if(result){ // true
		console.log("true");
		//addCart.jsp?=id=P1235
		document.addForm.submit();
	}else{ //false
		console.log("false");
	}
}



</script>


</head>
<body>
	<fmt:setLocale value="${param.language}"/>
	<fmt:bundle basename="bundle.message">
<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<!-- 내용 들어온다 -->
		<div class="container">
			<h1 class="display-3">도서 목록</h1>
		</div>
	</div>
	<!--============= 도서 목록 시작 ================-->
		<div class="container">
		<div class="row" align="left">
		<div class="col-md-5">
            <img src="/BookMarket/resources/images/${bookVO.filename}" style="width:100%"/>
         </div>
				<div class="col-md-6">
					<h3>${bookVO.category}${bookVO.name}</h3>
					<p>${bookVO.description}</p>
					<p>
						<b>도서 코드 : </b>
						<span class = "badge badge-danger">${bookVO.bookId}</span>
					</p>
					<p><b>출판사  </b> : ${bookVO.publisher}</p>
					<p><b>저자  </b> : ${bookVO.author}</p>
					<p><b>재고수  </b> : ${bookVO.unitsInstock}</p>
					<p><b>총 페이지수 </b> : ${bookVO.totalPages}</p>
					<p><b>출판일  </b> : ${bookVO.releaseDate}</p>
					<h4>${bookVO.unitPrice}원</h4>
					<p>
					<!-- 10/17 추가 5장 숙제 부분  -->
					<form name="addForm" action="addCart.jsp?id=${bookVO.bookId}" method="post">
					<!-- 상품 주문 -> 상품을 장바구니에 넣음-->
					<!-- bundle 폴더의 다국어 변경 부분 bookOrder이랑 booklist 추가 10/18 -->
					<a href="#" class="btn btn-info" onclick="addToCart()"><fmt:message key="bookOrder"/>&raquo;</a>
					<!-- 장바구니에 넣어진 상품 목록을 봄 -->
					<a href="/BookMarket/cart.jsp" class="btn btn-warning">장바구니&raquo;</a>
					<!-- 등록된 상품 목록을 봄 -->
					<a href="/BookMarket/products.jsp" class="btn btn-secondary"><fmt:message key="bookList"/>&raquo;</a>
					</form>
					
					

					</p>
				</div>
		</div>
	</div>
	</fmt:bundle>
	<!--============= 도서 목록 끝==================-->
	<jsp:include page="footer.jsp" />
</body>
</html>