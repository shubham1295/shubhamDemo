<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Employees</title>
</head>
<body>
	<a href="/welcome">Home</a> |

	<a href="/addNewEmployee">Add
		Employee</a> |   <a
		href="/getEmployees">Show
		Employees</a>
	<h3 style="color: red;">Show All Employees</h3>
	<ul>
		
		<table border="2" cellpadding="2">  
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach var="listValue" items="${employees}">
		<tr>  
			<td>${listValue.empId}</td>  
		   	<td>${listValue.empName}</td> 
		</tr>  
		</c:forEach>  
		</table>  
	</ul>
</body>
</html>