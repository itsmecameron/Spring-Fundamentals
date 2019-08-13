<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome User!</h1>
	<h1><c:out value="${counter}"/></h1>
	<h3><a href="/two">Add two?</a></h3>
	<h3><a href="/clear">Clear?</a></h3>
	<h3><a href="/counter">Go Back</a></h3>
</body>
</html>