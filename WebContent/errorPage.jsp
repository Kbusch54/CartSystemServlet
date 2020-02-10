<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>I am an ERROR Page</title>
</head>
<body>
<% response.setStatus(499); %>
You made a boo-boo. Nan nan na nah ha!

<form action="form.jsp" method="get">
		<input type="submit" name="submit" value="CLick here to continue">
	</form>
</body>
</html>