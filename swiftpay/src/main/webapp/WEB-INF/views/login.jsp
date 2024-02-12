<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet" href="<c:url value='/resources/css/register.css'/>">

</head>
<body>
	<h2>User Login</h2>
	<form action="login" method="post">
		<label for="email">Email:</label> <input type="email" id="email"
			name="email" required><br> <label for="password">Password:</label>
		<input type="password" id="password" name="password" required><br>

		<input type="submit" value="Login">
	</form>
	<a href="/forgot">Forgot Password?</a>
	<br>
	<a href="/signup">Not registered? Sign up</a>
</body>
</html>
