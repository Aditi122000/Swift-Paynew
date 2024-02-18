<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Logout</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/logout.css'/>">
</head>
<body>
    <img id="background-image" src="/resources/images/logout.png" alt="Background Image">
   
    <div class="pos">
        <h2>Logout</h2>
        <p>You have been successfully logged out.</p>
        <!-- Include the JavaScript redirect script -->
        <script>
    window.onload = function() {
        if (window.history.replaceState) {
            window.history.replaceState(null, null, window.location.href);
        }
        history.pushState(null, null, location.href);
        window.onpopstate = function () {
            history.go(1);
        };
    }
</script>
        <a href="/login">Return to Login</a>
    </div>
</body>
</html>
