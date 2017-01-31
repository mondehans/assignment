<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
			<li><a class="active" href="<c:url value='/index.jsp' />">Home</a></li>
			<li><a href="<c:url value='/logout' />"> Log out</a></li>
		</ul>
	
	<div id="container">
		<div id="innercontent">
			<h3>${errorMsg}</h3>
		</div>
	</div>
</body>
</html>