<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Money</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/addmoney.css'/>">
    
</head>
<body>
    <div class="card">
    <h1>Add Money to Your Digital Wallet</h1>
    <form action="addMoneyToWallet" method="post">
        <p>Current Balance: $<%= request.getAttribute("currentBalance")%></p>
        <p>Amount to Add: <input type="text" name="amount" required></p>
        <input type="submit" value="Add">
    </form>
    </div>
</body>
</html>
