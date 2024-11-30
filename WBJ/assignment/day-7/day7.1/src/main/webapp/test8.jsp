<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>From the next page....</h2>
	<h2>Product Details - ${requestScope.productdtls}</h2>
	<h2>Category - ${param.product_category}</h2>
	<h2>parameter - ${param}</h2>
</body>
</html>