<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>deptform</title>
</head>
<body>
	<form method="post" action="insert">
		<input type="text" name="deptno" value="${deptno }" readOnly>부서번호<br>
		<input type="text" name="dname">이름<br>
		<input type="text" name="loc">근무지<br>
		<input type="submit">
	</form>
</body>
</html>