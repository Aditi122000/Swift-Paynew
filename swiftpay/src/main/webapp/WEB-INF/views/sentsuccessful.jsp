<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
 

<html>

<head>

   <meta charset="UTF-8">  

   <title>Transfer Successful</title>
   <link rel="stylesheet" href="<c:url value='/resources/css/sentmoneysucess.css'/>">   

</head>



<body>

    <div class="success-container">

<h2>Money Transfer Completed</h2>



  <p>Funds transferred successfully!</p>



  <form action="moneysent">    

    <input type="submit" value="Go to Dashboard"/>  

  </form>

</div>

</body>

</html>

