<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Cancellation</title>
<c:url value="/resources/images" var="img1"></c:url>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br>
	<br><br><br><br><br><br>


<form:form method="post" action="cancelBookedRoom" modelAttribute="booking">
		<center>
			<table>
				<caption>Booking Cancellation</caption>
				
				<tr>
					
					<td><form:hidden path="bookingId" /></td>
				</tr>
				<tr>
					<td><form:hidden path="customerName" /></td>
				</tr>
	
				<tr>
					
					<td><form:hidden  path="nummberOfGuests"/></td>
				</tr>
				
				<tr>
					
					<td><form:hidden path="mobileNumber" /></td>
				</tr>


				<tr>
					<td><form:hidden path="checkInDate"  /></td>
				</tr>


				<tr>
					<td><form:hidden path="checkOutDate" /></td>
				</tr>


				<tr>
					<td><form:hidden path="roomType" /></td>
				</tr>
				
				
				<tr>	
				<td><form:hidden path="totalBookingCost" /></td>
				</tr>
				
				<tr>	
				<td><form:hidden path="bookingStatus" /></td>
				</tr>
				
				<tr>
					<td>Cancelled Reason</td>
					<td><form:input path="cancelledReason" /></td>
				</tr>

			</table>
			<br> <input type="submit" value="Submit" />
		</center>
	</form:form>
		

<br><br><br><br><br><br><br><jsp:include page="footer.jsp"></jsp:include>
</body>
</html>