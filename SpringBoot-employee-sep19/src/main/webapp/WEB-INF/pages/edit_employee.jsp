<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>
	<fmt:setBundle basename="labels" var="lb"/>
	<h1>Add Employee</h1>
	<form:form modelAttribute="employee" action="updateEmployee" method="post">
		<form:hidden path="id"/>
		<table border="1">
			<tr>
				<td><fmt:message key="employee.name" bundle="${lb}"/></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><fmt:message key="employee.address" bundle="${lb}"/></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><fmt:message key="employee.salary" bundle="${lb}"/></td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Update Employee" /></button>
				&nbsp;&nbsp;&nbsp;<a href="getAllEmployees">Cancel</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>