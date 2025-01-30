<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">


<th>Account Number</th>
<th>Name</th>
<th>Age</th>
<th>Email</th>
<th>Contact</th>
<th>Address</th>
<th>Balance</th>
<th>UserName</th>
<th>Password</th>
</tr>

<c:forEach items="${data}" var="a" >
<tr>
<td>${a.accno}</td>
<td>${a.name}</td>
<td>${a.age}</td>
<td>${a.email}</td>
<td>${a.contact}</td>
<td>${a.address}</td>
<td>${a.balance}</td>
<td>${a.username}</td>
<td>${a.password}</td>
</tr>
</c:forEach>




</table>
</body>
</html>