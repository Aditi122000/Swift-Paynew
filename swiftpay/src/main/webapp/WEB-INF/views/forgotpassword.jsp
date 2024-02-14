<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/forgotpassword.css'/>">
</head>
<body>
<img id="background-image" src="/resources/images/lock.png" alt="Background Image">
<div>
    <h2>Forgot Password</h2>
    <p>Please enter your email to reset your password.</p>
    <form action="resetPassword" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <input type="submit" value="Reset Password">
    </form>
    </div>
</body>
</html>
