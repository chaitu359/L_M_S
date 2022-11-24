<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select the book</title>
</head>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: montserrat;
	
	background-color: black;	
	height: 100vh;
	overflow: hidden;
}

.b-s {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 400px;
}

.b-s h1 {
	font-size: 40px;
	color:yellow;
	text-align: center;
	margin: 40px 0;
}

.b-s p {
	font-size: 20px;
	color:yellow;
	margin: 10px 0;
}

.b-s input {
	font-size: 16px;
	padding: 15px 10px;
	width: 100%;
	border: 0;
	border-radius: 5px;
	outline: none;
}
.b-s button{
font-size: 18px;
font-weight: bold;
margin: 40px 0;
padding: 10px 15px;
width:50%;
border:0;
background-color:yellow;
border-radius: 5px;
cursor:pointer;
}
.b-s button:hover{background:#ffc107;
}</style>
<body>
	<div class="b-s">
		<h1>Book Details</h1>
		<form action="BookSelection" method="post">
			<p>Book Name</p>
			<input type="text" name="Book">
			<p>Quantity</p>
			<input type="number" name="Quantity">
			<p>From date</p>
			<input type="date" name="fromdate">
			<p>To date</p>
			<input type="date" name="todate">
			<button type=submit>submit</button>
		</form>
	</div>
</body>
</html>