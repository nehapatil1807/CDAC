<%@page import="com.cdac.pojos.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>From the 1st page ....</h2>
	<%
	out.flush();//commit the response immediately !
	//encapsulate product details in Product POJO
	Product product = new Product(Integer.parseInt(request.getParameter("pid")), request.getParameter("name"),
			Integer.parseInt(request.getParameter("price")));
	//forward the clnt in the same request to the next page
	request.setAttribute("productdtls", product);
	%>
	<jsp:include page="test8.jsp">
		<jsp:param value="Food" name="product_category" />
	</jsp:include>
</body>
</html>