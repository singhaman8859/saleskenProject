<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Student Reporting System</title>
</head>
<body style="background-color: #eee8ec">
	<div class="container mt-3 text-center" border-radius="50px">
		<h1 style="font-size: 60px">Welcome To Student Reporting System</h1>
		<br> <br>
		<div class="list-group">
				<a href="./homeapp.jsp" class="list-group-item list-group-item-action"><h3>Home</h3></a> 
				<a href="./AddStudentInTheSystem.jsp" class="list-group-item list-group-item-action"><h3>Add New Student</h3></a>
				<a href="./addMarks.jsp" class="list-group-item list-group-item-action"><h3>Edit Student Marks</h3></a> 
				<a href="./GetAvgMarksInASubject.jsp" class="list-group-item list-group-item-action"><h3>Get Avg Mraks In A Subject</h3></a>
				<a href="./GetWholeSemesterAvgMarksBySemesterId.jsp" class="list-group-item list-group-item-action"><h3>Get Whole semester avg marks by semester id</h3></a>  
				<a href="./GetTop2Student.jsp" class="list-group-item list-group-item-action"><h3>get top 2 student details</h3></a> 
				<a href="./GetReportByEmail.jsp" class="list-group-item list-group-item-action"><h3>Get Report By Email</h3></a>
		</div>
	</div>
</body>
</html>
