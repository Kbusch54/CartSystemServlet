<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>My JSP Demo</title>
</head>

<%@ include file="html/header.html" %>
<br/>
<c:out value="Yippee!!!!!"></c:out> 
<H1>
Welcome ${ username } <br />
It is ${ loggedIn } that you have logged in.
</H1>
<table>
<tr><th>USERNAME</th><th>PASSWORD</th></tr>
<c:forEach var="creds" items="${credList}" >
<tr><td> <c:out value="${ creds.username }"></c:out> </td> 
<td><c:out value="${ creds.password }"></c:out></td></tr>
</c:forEach>
</table>

<%@ include file="html/footer.html" %>

</html>