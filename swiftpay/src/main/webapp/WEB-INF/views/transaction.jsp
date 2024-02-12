<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payments</title>
    <script>
        function searchPayments() {
            // Add logic to perform search
        }

        function sortPayments() {
            var sortOption = document.getElementById("sortOption").value;
            // Add logic to perform sorting based on sortOption
        }
    </script>
</head>
<body>
    <h1>Payments</h1>
    <form>
        <input type="text" name="search" placeholder="Search...">
        <button type="button" onclick="searchPayments()">Search</button>
        <select id="sortOption" name="sort">
            <option value="date">Sort by Date</option>
            <option value="nameAsc">Sort by Name (A to Z)</option>
            <option value="nameDesc">Sort by Name (Z to A)</option>
            <option value="amountAsc">Sort by Amount (Low to High)</option>
            <option value="amountDesc">Sort by Amount (High to Low)</option>
        </select>
        <button type="button" onclick="sortPayments()">Sort</button>
    </form>
    <table>
        <tr>
            <th>Date</th>
            <th>Recipient</th>
            <th>Amount</th>
        </tr>
        <%-- Add logic to iterate through payments and display them --%>
    </table>
</body>
</html>
