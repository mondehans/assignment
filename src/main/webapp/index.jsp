<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projects List</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<ul>
		<li><a class="active" href="/assignment1/index.jsp">Home</a></li>
		<li><a href="/assignment1/api/v1/projects/">List projects</a></li>
		<li><a href="/assignment1/api/v1/loginpage">login</a></li>
	</ul>
	<div id="container">
		<div id="innercontent">
			<!-- Default panel contents -->
			<div>
				<span><h3>Home page</h3> </span>
			</div>
		</div>
		</div>
</body>
</html>