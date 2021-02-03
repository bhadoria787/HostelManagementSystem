<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Room</title>
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
	<jsp:include page="header.jsp" /><br><br><br><br>
	
	<% 
	String customerEmailId=(String)session.getAttribute("customer");
	String managerEmailId = (String) session.getAttribute("manager");  
%>
	<br>
	<br>
	<br>
	<form:form method="post" action="roomBooking">
		<center>
			<table>
				<caption>Booking Room</caption>
				
				<tr>
					<td>Customer Name</td>
					<td><form:input path="customerName" /></td>
				</tr>
	
				<tr>
					<td>No Of Guest</td>
					<td><form:input type="number" path="nummberOfGuests" min="1" max="5" /></td>
				</tr>
				
				<tr>
					<td>Mobile Number</td>
					<td><form:input path="mobileNumber" /></td>
				</tr>


				<tr>
					<td>Check_in Date</td>
					<td><form:input type="date" path="checkInDate"  /></td>
				</tr>


				<tr>
					<td>Check_out Date</td>
					<td><form:input type="date" path="checkOutDate" /></td>
				</tr>


				<tr>
					<td>Room Type</td>
					<td><form:input path="roomType" /></td>
				</tr>
				
				
				<tr>
					
				<td><form:hidden path="totalBookingCost" /></td>
				</tr>

			</table>
			<br> <input type="submit" value="Book" />
		</center>
	</form:form>

<br><br><br><br><jsp:include page="footer.jsp"></jsp:include>
</body>
</html>