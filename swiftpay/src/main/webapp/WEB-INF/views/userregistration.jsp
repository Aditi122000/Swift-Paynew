<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post" modelAttribute="userreg" >
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="first_name" required><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="last_name" required><br>

        <label for="userName">Username:</label>
        <input type="text" id="userName" name="user_name" required><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="Address" required><br>

        <label for="bankAccNo">Bank Account Number:</label>
        <input type="text" id="bankAccNo" name="bank_acc_no" required><br>

        <label for="bankBranch">Bank Branch:</label>
        <input type="text" id="bankBranch" name="bank_branch" required><br>

        <label for="bankName">Bank Name:</label>
        <input type="text" id="bankName" name="bank_name" required><br>

        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br>

        <label for="contactNo">Contact Number:</label>
        <input type="text" id="contactNo" name="contact_no" required><br>

        <label for="dateOfBirth">Date of Birth:</label>
        <input type="date" id="dateOfBirth" name="date_of_birth" required><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label><br>

        <label for="state">State:</label>
        <input type="text" id="state" name="ustate" required><br>

        <input type="submit" value="Register">
        
    </form>
</body>
</html>
