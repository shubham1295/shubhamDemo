<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<a href="/welcome">Home</a> |

	<a href="/addNewEmployee">Add
		Employee</a> |   <a
		href="/getEmployees">Show
		Employees</a>
	<h3 style="color: red;">Add New Employee</h3>

	<div id="addEmployee">
		<form:form action="/addNewEmployee" method="post"
			modelAttribute="emp">
			<p>
				<label>Enter Employee Id</label>
				<form:input path="empId" />
			</p>
			<p>
				<label>Enter Name</label>
				<form:input path="empName" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
		<c:if test="${!empty error }">
	   		<c:out value="${error}"></c:out>
	    </c:if>
	</div>
</body>
</html>