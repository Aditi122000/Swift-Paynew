<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
</head>

<body>

<nav>
  <a href="transactioner">Transactions</a>
  <a href="supporter">Support</a>
  <a href="serviceofferings">Service Offering</a>
</nav>

<h2>Dashboard</h2>

<div class="transactions">
  <!-- existing transaction table -->
</div>

<div class="support">
  <!-- existing support requests table -->  
</div>

<div class="service-offering">
  <h3>Service Offering</h3>
  
  <form>
    <select name="users">
      <!-- options to select a user --> 
    </select>
    
    <button>Stop Service</button>
  </form>
  
</div>

</body>
</html>
