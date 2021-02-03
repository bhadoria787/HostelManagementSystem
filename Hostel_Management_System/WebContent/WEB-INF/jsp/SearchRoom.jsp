<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH ROOM</title>
<c:url value="/resources/images" var="img1"></c:url>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br><br><br><br>

<form action="searchroom" method="post">
<center>
<c:if test="${searchfail!=null}">
  <img align="middle" src="${img1}/fail3.png" alt="image"  width="170" height="125" /><br>
  <h3>${searchfail}</h3><br />
</c:if><br><br><caption ><h2>Search Available Room</h2></caption></center>

<table align="center">

			
			<tr>
				<th>Search for Date</th>
				<td><input type="date" name="Date"/></td>
			</tr>
				
      
</table><br><br>
<center><input type="submit" value="search"></center>
</form>

<br><br><jsp:include page="footer.jsp"></jsp:include>
</body>
</html>