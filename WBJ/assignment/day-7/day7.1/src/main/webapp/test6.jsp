<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>From the included page....</h2>
	<h3>
		Private instance variable -
		<%= mesg1 %></h3>
	<h3>
		Local variable -
		<%= mesg2 %></h3>
	<h3>Page scoped attribute - ${pageScope.nm}</h3>

</body>
</html>