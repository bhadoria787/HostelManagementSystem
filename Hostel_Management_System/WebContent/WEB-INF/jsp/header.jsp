<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>

<c:url value="/resources/css/templatemo_style.css" var="cssUrl"></c:url>
<link rel="stylesheet" href="${cssUrl}"></link>
<c:url value="/resources/images" var="img1"></c:url>

</head>
<body>
	<%
	String customerEmailId=(String)session.getAttribute("customer");
	String customer_name = (String) session.getAttribute("customer_name");

	String managerEmailId = (String) session.getAttribute("manager");
	String manager_name = (String) session.getAttribute("manager_name");
	%>
	<div id="templatemo_container">
		<div id="templatemo_header">
			<div id="site_title"></div>
		</div>
		

		<div id="templatemo_menu">
			<ul>

				<%if (customerEmailId == null && managerEmailId == null) {%>
				<li class="current"><a href="home"><b>Home</b></a></li>
				<li><a href="avaliableRoomlist"><b>Rooms Available</b></a></li>
				<li><a href="customerform"><b>Sign Up</b></a></li>
				<li><a href="loginform"><b>Login</b></a></li>
				<%}%>

				<%if (customerEmailId != null && managerEmailId == null) {%>
				
				<li class="current"><a><b>Customer:-<%=customer_name%></b></a></li>
				<li><a href="avaliableRoomlist"><b>Rooms Available</b></a></li>
				<li><a href="Searchroomform"><b>Search Room</b></a></li>
				<li><a href="custbookingreport"><b>Booking Report</b></a></li>
				<li><a href="logout"><b>Logout</b></a></li>
				<%}%>

				<%if (customerEmailId == null && managerEmailId != null) {%>
				<li ><a><b>Manager:-<%=manager_name%></b></a></li>
				<li><a href="showRoomlist"><b>List of Rooms </b></a></li>
				<li><a href="showRoomForm"><b>Add Room</b></a></li>
				<li><a href="bookinghistory"><b>Customer Bookings</b></a></li>
				<li><a href="logout"><b>Logout</b></a></li>
				<%}%>
			</ul>
		</div>
		
</body>
</html>