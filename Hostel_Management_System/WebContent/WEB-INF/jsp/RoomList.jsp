<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rooms</title>
<c:url value="/resources/images" var="img1"></c:url>
<style type="text/css">
td {
	font-family: Georgia, Garamond, serif;
	color: #002b80;
	font-style: italic;
	font-size: 15px;
	font-weight: bold;
	text-align: center;
}

th {
	font-family: Georgia, Garamond, serif;
	color: black;
	font-style: italic;
	font-size: 15px;
}

caption {
	font-family: Georgia, Garamond, serif;
	font-size: 22px;
	font-weight: bold;
}
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br>
	<center>${status}</center>
	<%
	String customerEmailId=(String)session.getAttribute("customer"); 
	String managerEmailId=(String)session.getAttribute("manager");
	%>
	
	<br><br><br><br><br><br>


	<table align="center" border="1" cellspacing="0.5">
		<caption>ROOMS AVALIABLE</caption><tr/><tr/><tr/>
		<tr>
			<th>Room Number</th>
			<th>Room Type</th>
			<th>Room Description</th>
			<th>Room Capacity</th>
			<th>Check_in Date</th>
			<th>Check_out Date</th>
			<th>Room Cost</th>

			<%
				if (customerEmailId != null && managerEmailId == null) {
			%>
			<th>Book it</th>
			<%
				}
			%>
		</tr>
		<tr />
		<tr />
		<tr />
		<tr />
		<c:forEach var="room" items="${roomlist}">
			<tr>
			
			    <td>${room.roomNumber}</td>
				<td Style="color: #3399ff;">${room.roomType}</td>
				<td>${room.description}</td>
				<td>${room.roomCapacity}</td>
				<td>${room.checkInDate}</td>
				<td>${room.checkOutDate}</td>
				<td Style="color: #3399ff;">${room.roomCost}</td>
				

				<%
					if (customerEmailId != null && managerEmailId == null) {
				%>
				<td><a href="bookRoom?roomNumber=${room.roomNumber}">Book</a></td>
				<%
					}
				%>
			</tr>
			<tr />
			<tr />
		</c:forEach>
	</table>
<br><br><br><br><br><br><br><jsp:include page="footer.jsp"></jsp:include>
</body>
</html>