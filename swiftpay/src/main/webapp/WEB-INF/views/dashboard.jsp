<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>

<style>
/* Add your CSS styles here */
</style>
</head>
<body>
	<nav>
		<ul>
			<li><a href="/home">Home</a></li>
			<li><a href="/payment">Payments</a></li>
			<li><a href="/profile">Profile</a></li>
			<li><a href="/logout">Logout</a></li>
			<li><a href="/deleteAccount">Delete Account</a></li>
		</ul>
	</nav>
	<h2>User Dashboard</h2>
	<p>
		Welcome,
		<%-- Add user's name here --%>
		!
	</p>
	<p>
		Your wallet balance:
		<%-- Add user's wallet balance here --%>
	</p>
	<div>
		<ul>
			<li><a href="/editprofile">Edit Profile</a></li>
			<li><a href="/starttransaction">Start Transaction</a></li>
			<li><a href="/raiseSupportRequest">Customer Support</a></li>
		</ul>
	</div>
</body>
</html>
