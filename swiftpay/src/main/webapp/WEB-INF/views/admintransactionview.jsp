<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transactions</title>
</head>
<body>
	<h1>Payments By Customer</h1>
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
		<c:forEach items="${transactions}" var="transactionss">
			<tr>
				<td>${transactionss.transactionid}</td>
				<td>${transactionss.transaction_date}</td>
				<td>${transactionss.userFrom.first_name}</td>
				<td>${transactionss.userTo.first_name}</td>
				<td>${transactionss.transaction_amount}</td>
		</c:forEach>
	</table>
</body>
</html>
