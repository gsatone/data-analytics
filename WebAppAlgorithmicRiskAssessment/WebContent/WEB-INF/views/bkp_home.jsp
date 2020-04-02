<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>RGF</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/src/main/webapp/resources/style.css" />">
</head>
<body>
	<h1>Welcome to Spittr</h1>
	<a href="<c:url value="/spittles" />">RGF</a> |
	<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>