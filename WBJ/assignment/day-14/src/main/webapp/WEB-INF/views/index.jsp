<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%-- import JSTL  supplied core tag library --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Welcome to Spring MVC !!!!!
	</h1>
	<h3>
		<c:url var="abc" value="/test/test1"/>
		<a href="${abc}">Adding Model Attributes using ModelAndView</a>
	</h3>  
	<h3>
		<c:url var="abc" value="/test/test2"/>
		<a href="${abc}">Test Model And View for adding Model Attributes via Model Map</a>
	</h3>     
</body>
</html>