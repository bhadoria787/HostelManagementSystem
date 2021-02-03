<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registering Form</title>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include><br>
	<br>
	<br>
	<br><br><br><br>
	<form:form method="post" action="savecustomer" name="regis">
		<center>
			<table>
				<caption style="font-size: 25px;">
					<b>Register Yourself</b>
				</caption>
				<tr />
			

				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>
			

				<tr>
					<td>Email_id</td>
					<td><form:input type="email"  path="emailId" /></td>
				</tr>
				

				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
				</tr>
				

				<tr>
					<td>Mobile Number</td>
					<td><form:input path="mobileNumber" /></td>
				</tr>

			</table>
			<br> <input type="submit" value="save" />
		</center>
	</form:form>

	<br>
	<br><br><br><jsp:include page="footer.jsp"></jsp:include>

</body>
</html>