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
	<div class="waviy">
   <span style="--i:1">S</span>
   <span style="--i:2">W</span>
   <span style="--i:3">I</span>
   <span style="--i:4">F</span>
   <span style="--i:5">T</span>
   <span style="--i:6">&nbsp;</span>
   <span style="--i:7">P</span>
   <span style="--i:8">A</span>
   <span style="--i:9">Y</span>
   <span style="--i:10">.</span>
   <span style="--i:11">.</span>
   <span style="--i:12">.</span>
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
	<a href="/signup">Not registered? Sign up</a>
	</div>
</body>
</html>
