<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Send Money</title>
  <link rel="stylesheet" href="<c:url value='/resources/css/sendmoney.css'/>">

</head>
<body>
<div class="card">
    <h1>Send Money from Your Digital Wallet</h1>
    <form action="sendMoneyToUser" method="post">
        <div id="errors">
            <c:if test="${not empty errors}">
                <c:forEach var="error" items="${errors}">
                    <p>
                        <c:out value="${error}" />
                    </p>
                </c:forEach>
            </c:if>
        </div>
        <p>Current Balance: $<%=request.getParameter("currentBalance")%></p>
        <p>
            <label for="recipientEmail">Recipient's Email:</label>
            <input type="email" name="recipientEmail" required pattern="^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$">
        </p>
        <p>
            <label for="amount">Amount to Send:</label>
            <input type="number" name="amount" min="1" required>
        </p>
        <input type="submit" value="Send">
    </form>
    </div>
</body>
</html>
