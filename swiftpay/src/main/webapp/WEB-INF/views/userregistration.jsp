<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/userreg.css'/>">
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post" modelAttribute="userreg" >
        <label for="firstName">First Name:<span class="required-star">*</span></label>
        <input type="text" id="firstName" name="first_name" required><br>

        <label for="lastName">Last Name:<span class="required-star">*</span></label>
        <input type="text" id="lastName" name="last_name" required><br>

        <label for="userName">Username:<span class="required-star">*</span></label>
        <input type="text" id="userName" name="user_name" required><br>
        
        <label for="email">Email:<span class="required-star">*</span></label>
        <input type="email" id="email" name="email" required><br>

        <label for="password">Password:<span class="required-star">*</span></label>
        <input type="password" id="password" name="password" required><br>

        <label for="address">Address:<span class="required-star">*</span></label>
        <input type="text" id="address" name="Address" required><br>

        <label for="bankAccNo">Bank Account Number:<span class="required-star">*</span></label>
        <input type="text" id="bankAccNo" name="bank_acc_no" required><br>

        <label for="bankBranch">Bank Branch:<span class="required-star">*</span></label>
        <input type="text" id="bankBranch" name="bank_branch" required><br>

        <label for="bankName">Bank Name:<span class="required-star">*</span></label>
        <input type="text" id="bankName" name="bank_name" required><br>

        <label for="city">City:<span class="required-star">*</span></label>
        <input type="text" id="city" name="city" required><br>
        
        <label for="state">State:<span class="required-star">*</span></label>
        <input type="text" id="state" name="ustate" required><br>

        <label for="contactNo">Contact Number:<span class="required-star">*</span></label>
        <input type="text" id="contactNo" name="contact_no" required><br>

        <label for="dateOfBirth">Date of Birth:<span class="required-star">*</span></label>
        <input type="date" id="dateOfBirth" name="date_of_birth" required><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="male">
        <br>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label><br>

        

        <input type="submit" value="Register">
        
    </form>
</body>
</html>
