<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>deptall</title>
</head>
<body>
	<c:forEach items="${deptAll }" var="dept">
		${ dept.deptno} / ${dept.dname } / ${dept.loc } 
	<br>
	</c:forEach>
</body>
</html>