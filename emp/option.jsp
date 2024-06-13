<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>emp result</title>
</head>
<body>
	<select id="showDept" onchange="printDept();">
		<c:forEach items="${deptinfo }" var="dept">
			<option value="${dept.deptno}">${dept.dname }</option>
		</c:forEach>
	</select>
	
	<div id="select1" style="display:none" >
	</div>
	
	<div id="select2" style="display:none" >
	</div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	//ajax
	function printDept(){
		var no = $("#showDept").val();
		$.getJSON("/emp/select1", { deptno : no }, function(data) {
			  // 성공 시 동작
			  $("#select2").empty();
			  $("#select1").empty();
			  
			  console.log(data);
			  if(data.length==0){
				  console.log(0);
				  $("#select1").append("<p>employee가 없는 부서입니다.</p>");
			  }else{
				  $("#select1").append("<select id='showEmp' onchange='printEmp();' style='display:none'>");
				  $("#select1").append("</select>");
				  var EmpOption="";
				  for(var i in data){
					  var emp = data[i];
					  var ename = emp.ename;
					  EmpOption="<option value=" +ename+">"+ename+"</option>";
					  $("#showEmp").append(EmpOption);
					  $("#showEmp").show();
				  }
			  }
			  $("#select1").show();
			});
	}
	
	function printEmp(){
		var name = $("#showEmp").val();
		$.getJSON("/emp/select1/select2", { ename : name }, function(data) {
			  // 성공 시 동작
			  $("#select2").empty();
			  console.log(data);
			  $("#select2").append("<p>"+data.empno+"/"+data.ename +"/"+data.job+"</p>")
			  $("#select2").show();
			});
	}
	
</script>	
</body>
</html>