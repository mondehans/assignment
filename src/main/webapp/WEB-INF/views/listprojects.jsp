<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Projects List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
	<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script>
$(document).ready(function() {
    
    $('#projectList').DataTable( {
    	"lengthChange": false,
    	"dom": '<"top"i>rt<"bottom"flp><"clear">'
    } );
});
</script>
</head>

<body>
 <ul>
  <li><a class="active" href="<c:url value='/index.jsp' />">Home</a></li>
  <li><a href="<c:url value='/logout' />"> Log out</a></li>
</ul>
	<div id="container">
	
		<div id="innercontent">
			  <!-- Default panel contents -->
		  	<div ><span><h3>List of Projects</h3> </span></div>
			<table id="projectList">
	    		<thead>
		      		<tr>
				        <th>Id</th>
				        <th>Title</th>
				        <th>Description</th>
				        
					</tr>
		    	</thead>
	    		<tbody>
		<c:forEach items="${projects}" var="project">
					<tr>
						<td><a href="/assignment1/api/v1/projects/${project.id}">${project.id}</a></td>
						<td>${project.title}</td>
						<td>${project.description}</td>
					</tr> 
				</c:forEach> 
	    		</tbody>
	    	</table>
		</div>
   	</div>
</body>
</html>