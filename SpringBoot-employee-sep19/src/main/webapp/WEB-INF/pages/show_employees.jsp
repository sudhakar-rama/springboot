<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMS</title>
<script type="text/javascript">
	function deleteEmployee(id){
		if (confirm("Do you want to delete ?")){
			document.frm.emp_id.value=id;
			document.frm.action="deleteEmployee";
			document.frm.submit();
		}
	}
	function editEmployee(id){
		document.frm.emp_id.value=id;
		document.frm.action="editEmployee";
		document.frm.submit();
	}
</script>
</head>
<body>
	<fmt:setBundle basename="labels"/>
	<h1><fmt:message key="employee.show-employees.header"/></h1>
	<a href="addEmployee"><fmt:message key="employee.show-employees.add-employee.header"/></a><br/><br/>
	<form name="frm">
		<input type="hidden" name="emp_id"/>
		<table border="1" width="100%">
			<tr>
				<td align="right" colspan="6"><b><fmt:message key="employee.show-employees.date"/></b> <fmt:formatDate
						value="<%=new Date()%>" pattern="dd-MMM-yyyy" /></td>
			</tr>

			<c:forEach items="${emps}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.address}</td>
					<td>${emp.salary}</td>
					<td align="center"><button onClick="editEmployee(${emp.id})">Edit</button></td>
					<td align="center"><button onClick="deleteEmployee(${emp.id})">Delete</button></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>