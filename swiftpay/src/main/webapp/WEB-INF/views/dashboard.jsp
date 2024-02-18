<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
<link rel="stylesheet" href="<c:url value='/resources/css/dashboard.css'/>">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

</head>

<body>


<nav>
 <ul>
        <li><a class="profile-link" href="/profile" title="Profile"><i class="fas fa-user"></i></a></li>
        <li><a href="/home" title="Go to Home"><i class="fas fa-home"></i></a></li>
        <li><a href="/paymentHistory" title="View Payment History"><i class='fas fa-rupee-sign'></i></a></li>
        <li style="float: right;"><a href="/logout" title="Logout"><i class= "fas fa-sign-out-alt"></i></a></li>
        <li style="float: right;"><a href="/deleteAccount" title="Delete Account"><i class="fas fa-trash"></i></a></li>
    </ul>
    </nav>

<div id="container">
 <div class="card">
    <div class="card-title"><h2>User Details</h2></div>
    <div class="card-content">
        <p class="welcome-message">Welcome, <span class="user-name">${name}</span>!</p>
       <p class="balance-message">Your wallet balance: Rs. <span class="wallet-balance">${balance}</span></p>
        <a href="/starttransaction" class="button" >Start Transaction</a>
        
    </div>
</div>

<img id="background-image" src="/resources/images/dashboard.png"
		alt="Background Image">
		
		
 </div>
</body>
</html>
