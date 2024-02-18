<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="<c:url value='/resources/css/coustomerprofile.css'/>">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

</head>
<body>
<div id="container">
	 <div class="card">

        <h1>User Profile <i class="fas fa-user"></i></h1>

        <label>First Name:</label>
        <span>${userdetail[0].first_name}</span><br><br>
        
        <label>Last Name:</label>
        <span>${userdetail[0].last_name}</span><br><br>

        <label>Email:</label>
        <span>${userdetail[0].email}</span><br><br>

        <label>Address:</label>
        <span>${userdetail[0].address}</span><br><br>

        <label>Bank Account No:</label>
        <span>${userdetail[0].bank_acc_no}</span><br><br>

        <label>Bank Branch:</label>
        <span>${userdetail[0].bank_branch}</span><br><br>

        <label>Bank Name:</label>
        <span>${userdetail[0].bank_name}</span><br><br>

        <label>City:</label>
        <span>${userdetail[0].city}</span><br><br>

        <label>State:</label>
        <span>${userdetail[0].ustate}</span><br><br>

        <label>Contact No:</label>
        <span>${userdetail[0].contact_no}</span><br><br>

        <label>Date of Birth:</label>
        <span>${userdetail[0].date_of_birth}</span><br><br>

        <label>Gender:</label>
        <span>${userdetail[0].gender}</span><br><br>
        
        <label>Wallet Balance:</label>
        <span>${userdetail[0].wallet_balance}</span>

        <a href="/backhome">Back to Home</a>
	</div>
	<img id="background-image" src="/resources/images/profile.png"alt="Background Image">
	

</div>
</body>
</html>