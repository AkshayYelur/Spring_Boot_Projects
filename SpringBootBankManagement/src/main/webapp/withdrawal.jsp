<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="withdrawalmoney">

<label>AccountNo</label>
<input type="number" name="accno" value="${data.accno}">
<br>
<br>

<label>Balance</label>
<input type="number" name="balance" >
<br>
<br>



<input type="submit" value="save">



</form>
</body>
</html>