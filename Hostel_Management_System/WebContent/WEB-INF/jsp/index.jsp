<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hostel Management System</title>

<c:url value="/resources/css/templatemo_style.css" var="cssUrl"></c:url>
<link rel="stylesheet" href="${cssUrl}"></link>
<c:url value="/resources/images" var="img1"></c:url>

<meta name="keywords" content="" />
<meta name="description" content="" />
</head>
<body>
<jsp:include page="header.jsp" ></jsp:include><br/>


<% 
String customerEmailId=(String)session.getAttribute("customer"); 
String managerEmailId=(String)session.getAttribute("manager");  
%>
<center>
<h3>${loginsuc}</h3>
<h3>${regissuc}</h3>
<h3>${status}</h3>
<h3>${detailupdate}</h3>
</center>
    
    <div id="templatemo_top_dishes">

    	<h1>Types of Rooms</h1>
    	
        <div class="top_dishes_box">
       	  <img src="${img1}/standard.jpg" alt="image" width="205" height="150"/>
          <h2>Standard Room</h2>
            
      </div>
        
        <div class="top_dishes_box">
       	  <img src="${img1}/Deluxe.jpg" alt="image" width="205" height="150"/>
            <h2>Duplex Room</h2>
         
        </div>
        
        <div class="top_dishes_box">
       	  <img src="${img1}/luxury.jpg" alt="image" width="205" height="150"/>
            <h2>Luxury Room</h2>
          
      </div>
        
        <div class="top_dishes_box">
       	  <img src="${img1}/vip.jpg" alt="image" width="205" height="150"/>
            <h2>VIP Room</h2>
            
         
        </div>
        
        <div class="cleaner">&nbsp;</div>
    
    </div> <!-- end of top dishes -->
    
    <div id="templatemo_content">
    	<span class="top"></span>
        <div id="templatemo_innter_content">
            
                <div id="templatemo_content_left">
                    <h1>Welcome to our website</h1>
                <img src="${img1}/Lounge.jpg" alt="image" width="315" height="210" />
                    
                    
                        
                    <div class="cleaner_with_height">&nbsp;</div>
                
                </div> <!-- end of content left -->
                
                <div id="templatemo_content_right">
                    
                    
                
                </div> <!-- end of content right -->
        		<div class="cleaner">&nbsp;</div>
        </div>   
        <div class="cleaner" style="background: #fff;">&nbsp;</div> 	
    </div>


<jsp:include page="footer.jsp" ></jsp:include>
</body>
</html>
