<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>
	<h1>Profile</h1>

	<div>
		<label>First Name:</label> <span>${userdetail.first_name}</span>
	</div>
	<div>
		<label>Last Name:</label> <span>${userdetail.last_name}</span>
	</div>
	<div>
		<label>Email:</label> <span>${userdetail.email}</span>
	</div>
	<div>
		<label>Password:</label> <span>${userdetail.password}</span>
	</div>
	<%-- <div>
		<label>Address:</label> <span>${userdetail.Address}</span>
	</div> --%>
	<div>
		<label>Bank Account No:</label> <span>${userdetail.bank_acc_no}</span>
	</div>
	<div>
		<label>Bank Branch:</label> <span>${userdetail.bank_branch}</span>
	</div>
	<div>
		<label>Bank Name:</label> <span>${userdetail.bank_name}</span>
	</div>
	<div>
		<label>City:</label> <span>${userdetail.city}</span>
	</div>
	<div>
		<label>State:</label> <span>${userdetail.ustate}</span>
	</div>
	<div>
		<label>Contact No:</label> <span>${userdetail.contact_no}</span>
	</div>
	<div>
		<label>Date of Birth:</label> <span>${userdetail.date_of_birth}</span>
	</div>
	<div>
		<label>Gender:</label> <span>${userdetail.gender}</span>
	</div>
	<a href="/">Back to Home</a>

</body>
</html>