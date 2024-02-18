<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Support Request</title>
</head>
<body>
    <h1>Customer Support Request</h1>
    <form action="submitSupportRequest" method="post">
        <p>Name: <input type="text" name="name"></p>
        <p>Email: <input type="text" name="email"></p>
        <p>Subject: <input type="text" name="subject"></p>
        <p>Message: <textarea name="message" rows="5" cols="40"></textarea></p>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
