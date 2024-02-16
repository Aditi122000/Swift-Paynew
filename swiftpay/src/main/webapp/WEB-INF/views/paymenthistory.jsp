<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Payments</title>


</head>
<body>
	<div class="container">
		<h1>Payments</h1>

		<table class="table">
		<thead>
			<tr>
				<th>Transaction Id</th>
				<th>Transaction Date</th>
				<th>Transferred From</th>
				<th>Transferred To</th>
				<th>Transaction Amount</th>
				<th></th>
			</tr>
			</thead>
		
		<tbody>
			<c:forEach items="${transactions}" var="trans">
				<tr>
					<td>${trans.transactionid}</td>
					<td>${trans.transaction_date}</td>
					<td>${trans.userFrom.first_name}</td>
					<td>${trans.userTo.first_name}</td>
					<td>${trans.transaction_amount}</td>
					<td><a href="customer-support" class="btn btn-warning" > Raise Request</a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>


</body>
</html>
