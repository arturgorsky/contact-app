<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact add/edit</title>
</head>
<body>
	<div align="center">
		<h1>Add/Edit Contact</h1>
		<form:form action="save" method="post" modelAttribute="contact">
			<table>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" />
					</td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" />
					</td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><form:input path="phone" />
					</td>
				</tr>
			</table>
			<input type="submit" value="Save" />
		</form:form>
	</div>
</body>
</html>