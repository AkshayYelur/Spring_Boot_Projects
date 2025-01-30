<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<center><h1>All Information</h1></center>

<script type="text/javascript">


function adduser() {
	document.fn.action="register.jsp";
	document.fn.submit();
}


</script>
</head>
<body>


<form action="fn">
<table border="1" align="center">
<th>Id</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>Mobile</th>
<th>age</th>
<tr>
<c:forEach items="${data}" var="user">
<br>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.mobile}</td>
<td>${user.age}</td>


</tr>
</c:forEach>






</table>





</form>
</body>
</html>