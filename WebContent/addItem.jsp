<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Item page</title>
</head>
<%@ include file="html/header.html"%>
<form action="CartExerciseServlet" method="post">
	<label for="name">Name: </label> <input type="text" name="name" /> <label
		for="desc">Desc: </label> <input type="text" name="desc" /> <label
		for="price">Price: </label> <input type="text" name="price" /> <label
		for="qty">Quantity: </label> <input type="text" name="qty" /> <input
		type="submit" value="Submit">
</form>
<%@ include file="html/footer.html"%>
</html>