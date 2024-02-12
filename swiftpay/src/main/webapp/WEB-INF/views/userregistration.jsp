<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post" >
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>

        <label for="userName">Username:</label>
        <input type="text" id="userName" name="userName" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="bankAccNo">Bank Account Number:</label>
        <input type="text" id="bankAccNo" name="bankAccNo" required><br>

        <label for="bankBranch">Bank Branch:</label>
        <input type="text" id="bankBranch" name="bankBranch" required><br>

        <label for="bankName">Bank Name:</label>
        <input type="text" id="bankName" name="bankName" required><br>

        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br>

        <label for="contactNo">Contact Number:</label>
        <input type="text" id="contactNo" name="contactNo" required><br>

        <label for="dateOfBirth">Date of Birth:</label>
        <input type="date" id="dateOfBirth" name="dateOfBirth" required><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label><br>

        <label for="state">State:</label>
        <input type="text" id="state" name="state" required><br>

        <input type="submit" value="Register">
        
    </form>
</body>
</html>
