<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Room</title>
<style type="text/css">
td {
	font-size: 12px;
}

caption {
	font-family: Georgia, Garamond, serif;
	font-size: 22px;
	font-weight: bold;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include><br><br><br>
	
<center>
<h3>${status}</h3>
</center>
	
	<br>
	<br>
	<br>
	<form:form method="post" action="saveroom" modelAttribute="room">
		<center>
			<table>

				<caption>Add Room</caption>
				
				
				<tr>
					<td>Room Number</td>
					<td><form:input path="roomNumber" /></td>
				</tr>



				<tr>
					<td>Room Type</td>
					<td><form:input path="roomType" /></td>
				</tr>
				
				
				<tr>
					<td>Room Description</td>
					<td><form:input path="description" /></td>
				</tr>


				<tr>
					<td>Room Capacity</td>
					<td><form:input path="roomCapacity" /></td>
				</tr>

                
                
				<tr>
					<td>Check_in Date</td>
					<td><form:input type="date" path="checkInDate" /></td>
				</tr>


				<tr>
					<td>Check_out Date</td>
					<td><form:input type="date" path="checkOutDate" /></td>
				</tr>


				<tr>
					<td>Room Price</td>
					<td><form:input path="roomCost" /></td>
				</tr>

			</table>
			<br> <input type="submit" value="ADD ROOM" />
		</center>

	</form:form>
<br><br><jsp:include page="footer.jsp"></jsp:include>
</body>
</html>