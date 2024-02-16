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
			<li><a href="/home">Home</a></li>
			<li><a href="/paymentHistory">Payments</a></li>
			<li><a href="/profile">Profile</a></li>
			<li><a href="/logout">Logout</a></li>
			<li><a href="/deleteAccount">Delete Account</a></li>
		</ul>
	</nav>
	<div class="content">
	<h2>User Dashboard</h2>
	<p>
		Welcome, ${name}
		<%-- Add user's name here --%>
		!
	</p>
	<p>
		Your wallet balance:  ${balance}
		<%-- Add user's wallet balance here --%>
	</p>
	<div>
		<ul>
			<li><a href="/editprofile">Edit Profile</a></li>
			<li><a href="/starttransaction">Start Transaction</a></li>
			<li><a href="/raiseSupportRequest">Customer Support</a></li>
		</ul>
	</div>
	</div>
</body>
</html>
