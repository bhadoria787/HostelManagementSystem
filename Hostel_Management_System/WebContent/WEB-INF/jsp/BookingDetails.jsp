<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer booking details</title>
</head>
<body>
<jsp:include page="header.jsp" ></jsp:include><br><br><br><br><br>
 
<center>
<h2>${bookinghist .customerName} your booking for ${bookinghist .roomType} room is done.</h2><br>
<h2>It cost ${bookinghist .totalBookingCost} for  ${bookinghist .nummberOfGuests} person.</h2><br>
<h2>Enjoy your Stay!!! </h2>
</center>


<br><br><br><br><br><br><br><br><jsp:include page="footer.jsp" ></jsp:include>
</body>
</html>