<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer booking history</title>
</head>
<body>
<jsp:include page="header.jsp" ></jsp:include><br><br><br>
 
 <%
	String customerEmailId=(String)session.getAttribute("customer"); 
	String managerEmailId=(String)session.getAttribute("manager");
	%>
 
<center>
<h1>Booking Done By Customers</h1>
</center>


	<table border="1" align="center" bordercolor="darkblue" cellspacing="0">

		<tr>
			<th>Booking Id</th>
			<th>Customer Name</th>
			<th>Number of guests</th>
			<th>Check in date</th>
			<th>Check out date</th>
			<th>Room Type</th>
			<th>Booking cost</th>
			<th>Status</th>
			<%if (customerEmailId != null && managerEmailId == null) {%>
			<th>Cancelled Reason</th>
			<%}%>
			
			<%if (customerEmailId == null && managerEmailId != null) {%>
			<th>Cancel Booking</th>
			<%}%>

		</tr>
		 <!-- mobileNumber bookingStatus cancelledReason -->
		<c:forEach var="bookinghistory" items="${BookingHistory}">
		
			<tr>
				<td>${bookinghistory.bookingId}</td>
				<td>${bookinghistory.customerName}</td>
				<td>${bookinghistory.nummberOfGuests}</td>
				<td>${bookinghistory.checkInDate}</td>
				<td>${bookinghistory.checkOutDate}</td>
				<td>${bookinghistory.roomType}</td>
				<td>${bookinghistory.totalBookingCost}</td>
				<td>${bookinghistory.bookingStatus}</td>
				<%if (customerEmailId != null && managerEmailId == null) {%>
				<td>${bookinghistory.cancelledReason}</td>
				<%}%>
				
				<%if (customerEmailId == null && managerEmailId != null) {%>
				<td><a href="bookingcancellation?bookingId=${bookinghistory.bookingId}">cancel</a></td>
				<%}%>
			</tr>
			
		</c:forEach>

	</table>
<br><br><br><br><br><br><jsp:include page="footer.jsp" ></jsp:include>
</body>
</html>