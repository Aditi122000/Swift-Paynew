<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet" href="<c:url value='/resources/css/login.css'/>">

</head>
<body>

	<img id="background-image" src="/resources/images/login.png"
		alt="Background Image">
	<div class="container">
		<div class="typewriter">SWIFT PAY</div>
	</div>
	
	<div>
	<h2>Login</h2>
	<form action="login" method="post">
		<label for="email">Email:</label> <input type="email" id="email"
			name="email" required><br> <label for="password">Password:</label>
		<input type="password" id="password" name="password" required><br>

		<input type="submit" value="Login">
	</form>
	<br>
	<a href="/forgot">Forgot Password?</a>
	<a href="/signup">Not registered? Sign up</a>
	</div>
</body>
</html>
