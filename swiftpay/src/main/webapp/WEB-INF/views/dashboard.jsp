<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <style>
        /* Add your CSS styles here */
    </style>
</head>
<body>
    <nav>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="transactions.jsp">Transactions</a></li>
            <li><a href="payment.jsp">Payment</a></li>
            <li><a href="profile.jsp">Profile</a></li>
            <li><a href="logout.jsp">Logout</a></li>
            <li><a href="deleteAccount.jsp">Delete Account</a></li>
        </ul>
    </nav>
    <h2>User Dashboard</h2>
    <p>Welcome, <%-- Add user's name here --%>!</p>
    <p>Your wallet balance: <%-- Add user's wallet balance here --%></p>
    <div>
        <h3>Perform Operations</h3>
        <ul>
            <li><a href="addMoney.jsp">Add Money</a></li>
            <li><a href="sendMoney.jsp">Send Money</a></li>
            <li><a href="editProfile.jsp">Edit Profile</a></li>
            <li><a href="raiseSupportRequest.jsp">Raise Support Request</a></li>
        </ul>
    </div>
</body>
</html>
