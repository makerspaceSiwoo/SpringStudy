<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>emp result</title>
</head>
<body>
	<h5>${ename }과 ${job }의 검색 결과 입니다.</h5>
	<c:if test="${elsit.size == 0 }">
		검색 조건에 맞는 사원이 없습니다.
	</c:if>
	<c:if test="${elsit.size != 0 }">
		<c:forEach items="${elist }" var="e">
		${ e.empno} / ${e.ename } / ${e.job } / 
		<fmt:formatDate value="${e.hiredate }" pattern="yyyy/MM/dd" />
			<br>
		</c:forEach>
	</c:if>


</body>
</html>