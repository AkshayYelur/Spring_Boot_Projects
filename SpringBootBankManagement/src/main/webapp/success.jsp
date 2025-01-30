<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function withdrawal() {
	document.fn.action="withdrawal";
	document.fn.submit();
}
function deposite() {
	document.fn.action="deposite";
	document.fn.submit();
}

function update() {
	document.fn.action="update";
	document.fn.submit();
}

function deletea() {
	document.fn.action="delete";
	document.fn.submit();
}



</script>

</head>

<body>

<form name="fn">

<label>AccountNo</label>
<input type="number" name="accno" value="${data.accno}">
<br>
<br>
<label>name</label>
<input type="text" name="name" value="${data.name}">
<br>
<br>
<label>Balance</label>
<input type="number" name="balance" value="${data.balance}">
<br>
<br>

<table>
<tr>
<td>
<button type="button" onclick="withdrawal()" >Withdrawal</button>
</td>

<td>
<button type="button" onclick="deposite()" >Deposite</button>
</td>

<td>
<button type="button" onclick="update()" >Update</button>
</td>

<td>
<button type="button" onclick="deletea()" >Delete</button>
</td>

</tr>
</table>
</form>
</body>
</html>