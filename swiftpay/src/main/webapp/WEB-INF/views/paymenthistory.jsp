<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payments</title>
</head>
<body>
	<h1>Payments</h1>
	<form action="/payment" method="post">
		<select id="sortOption" name="sort">
			<option value="transaction_date">Sort by Date</option>
		</select> <input type="submit" value="Sort">
	</form>
	<table>
		<tr>
			<th>Transaction Id</th>
			<th>Transaction Date</th>
			<th>Transferred From</th>
			<th>Transferred To</th>
			<th>Transaction Amount</th>
		</tr>
	</table>
	<table>
		<c:forEach items="${transactions}" var="trans">
			<tr>
				<td>${trans.transactionid}</td>
				<td>${trans.transaction_date}</td>
				<td>${trans.userFrom.first_name}</td>
				<td>${trans.userTo.first_name}</td>
				<td>${trans.transaction_amount}</td>
		</c:forEach>
	</table>
</body>
</html>
