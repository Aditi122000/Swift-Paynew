<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Money</title>
</head>
<body>
    <h1>Add Money to Your Digital Wallet</h1>
    <form action="addMoneyToWallet" method="post">
        <p>Current Balance: $<%= request.getAttribute("currentBalance") %></p>
        <p>Amount to Add: <input type="text" name="amount"></p>
        <input type="submit" value="Add">
    </form>
</body>
</html>
