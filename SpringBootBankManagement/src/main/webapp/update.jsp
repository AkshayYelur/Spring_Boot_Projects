<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="updatetologin">

<label>AccountNo</label>
<input type="number" name="accno" value="${data.accno}">
<br>
<br>
<label>name</label>
<input type="text" name="name"  value="${data.name}">
<br>
<br>
<label>Age</label>
<input type="number" name="age"  value="${data.age}">
<br>
<br>
<label>Email</label>
<input type="text" name="email"  value="${data.email}">
<br>
<br>
<label>Contact</label>
<input type="number" name="contact"  value="${data.contact}">
<br>
<br>
<label>Address</label>
<input type="text" name="address"  value="${data.address}">
<br>
<br>
<label>Username</label>
<input type="text" name="username" value="${data.username}">
<br>
<br>
<label>Password</label>
<input type="text" name="password"  value="${data.password}">
<br>
<br>

<input type="submit" value="save">
<br>
<br>



</form>
</body>
</html>