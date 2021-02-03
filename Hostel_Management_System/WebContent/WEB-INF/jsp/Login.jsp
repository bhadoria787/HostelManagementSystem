<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<c:url value="/resources/images" var="img1"></c:url>
</head>
<body >

	<jsp:include page="header.jsp"></jsp:include><br>
	

	<center><h1>${loginfail}</h1></center><br><br>
	<br />
	<center>
		<c:if test="${loginfail==null}">
			<img align="middle" src="${img1}/loginsign.png" alt="image"
				width="90" height="70" />
			<br>
			<br>
		</c:if>
	</center>


	<form method="post" action="savelogin">

		<table align="center">

			<caption style="font-size: 25px;">
				<b>Login</b>
			</caption><tr/><tr/><tr/><tr/>


			<tr>
				<td>Type</td>
				<td><select name="type">
						<option value="Customer">customer</option>
						<option value="Manager">manager</option>
				</select></td>
			</tr>
			
			<tr>
				<td>Email-Id</td>
				<td><input type="email" name="emailid" /></td>
			</tr>
			

			<tr>
				<td>Password</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			


		</table>
		<br>
		<center>
			<input type="submit" value="Login" />
		</center>
	</form>
	<br>
	<br>
	<br><jsp:include page="footer.jsp"></jsp:include>


</body>
</html>