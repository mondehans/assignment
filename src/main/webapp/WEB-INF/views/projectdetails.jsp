<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Projects List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
<ul>
  
  <li><a class="active" href="<c:url value='/index.jsp' />">Home</a></li>
  <li><a href="<c:url value='/api/v1/projects/' />">List projects</a></li>
  <li><a href="<c:url value='/logout' />"> Log out</a></li>
  
</ul>
	<div id="container">
	
		<div id="innercontent">
			  <!-- Default panel contents -->
		  	<div ><span> <h3>Project Details</h3> </span></div>
			<table>
	    		
	    		<tbody>
	    			<tr>
						<td>ID</td>
						<td>${project.id}</td>
					</tr>
					<tr>
						<td>Title</td>
						<td>${project.title}</td>
					</tr> 
		
					<tr>
						<td>Description</td>
						<td>${project.description}</td>
					</tr> 
	
					<tr>
						<td>Start date</td>
						<td>${project.startDate}</td>
					</tr> 
					<tr>
						<td>End date</td>
						<td>${project.endDate}</td>
					</tr> 
					<tr>
						<td>Billable</td>
						<td>${project.billable}</td>
					</tr> 
					<tr>
						<td>Active</td>
						<td>${project.active}</td>
					</tr> 
		 
				</tbody>
	    	</table>
	
	    	<div ><span> <h3>Task Details</h3> </span></div>
	    		<table>
	    		<thead>
		      		<tr>
				        <th>Id</th>
				        <th>Title</th>
				        <th>Due date</th>
				        <th>Estimated hours</th>
				        
					</tr>
		    	</thead>
	    		<tbody>
		<c:forEach items="${project.tasks}" var="task">
					<tr>
						<td>${task.id}</td>
						<td>${task.title}</td>
						<td>${task.dueDate}</td>
						<td>${task.estimatedHours}</td>
					</tr> 
				</c:forEach> 
	    		</tbody>
	    	</table>
		</div>
	
			<div ><span> <h3>Resource Details</h3> </span></div>
	    		<table>
	    		<thead>
		      		<tr>
				        <th>Id</th>
				        <th>User</th>
				        <th>Start date</th>
				        <th>End date</th>
				        <th>Rate</th>
				        <th>Agreed hours per month</th>
				        <th>Date created</th>
				        <th>Date updated</th>
					</tr>
		    	</thead>
	    		<tbody>
		<c:forEach items="${project.resources}" var="resource">
					<tr>
						<td>${resource.id}</td>
						<td>${resource.user}</td>
						<td>${resource.startDate}</td>
						<td>${resource.endDate}</td>
						<td>${resource.agreedHoursPerMonth}</td>
						<td>${resource.updated}</td>
					</tr> 
				</c:forEach> 
	    		</tbody>
	    	</table>
		</div>
   	</div>
</body>
</html>