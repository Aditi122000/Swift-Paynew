<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wallet Operations</title>
</head>
<body>
    <h2>Wallet Operations</h2>
    
    <div>
        <h3>Add Money to Wallet</h3>
        <form action="addMoney" method="post">
            <label for="amount">Amount:</label>
            <input type="text" id="amount" name="amount" required><br>
            <input type="submit" value="Add Money">
        </form>
    </div>
    
    <div>
        <h3>Send Money to Another Wallet</h3>
        <form action="sendMoney" method="post">
            <label for="recipient">Recipient's Wallet ID:</label>
            <input type="text" id="recipient" name="recipient" required><br>
            <label for="sendAmount">Amount to Send:</label>
            <input type="text" id="sendAmount" name="sendAmount" required><br>
            <input type="submit" value="Send Money">
        </form>
    </div>
</body>
</html>
