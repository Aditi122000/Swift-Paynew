<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Send Money</title>
</head>
<body>
    <h1>Send Money from Your Digital Wallet</h1>
    <form action="sendMoneyServlet" method="post">
        <p>Current Balance: $<%= request.getAttribute("currentBalance") %></p>
        <p>Recipient's Email: <input type="text" name="recipientEmail"></p>
        <p>Amount to Send: <input type="text" name="amount"></p>
        <input type="submit" value="Send">
    </form>
</body>
</html>
