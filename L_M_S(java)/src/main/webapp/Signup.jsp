<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="./styles.css">
</head>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: montserrat;
	
	background-image:url("./library2.jpg");	
	height: 100vh;
	overflow: hidden;
}

.s-f {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 400px;
}

.s-f h1 {
	font-size: 40px;
	color:yellow;
	text-align: center;
	margin: 40px 0;
}

.s-f p {
	font-size: 20px;
	color:yellow;
	margin: 10px 0;
}

.s-f input {
	font-size: 16px;
	padding: 15px 10px;
	width: 100%;
	border: 0;
	border-radius: 5px;
	outline: none;
}
.s-f button{
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
</style>
<body>
	<div class="s-f">
		<h1>Sign Up</h1>
		<form action="SignupServlet" method=post>
			<p>USER NAME:</p>
			<input type="text" name="username" placeholder="username">
			<p>EMAIL:</p>
			<input type="text" name="email" placeholder="Email">
			<p>PHONE:</p>
			<input type="text" name="phone" placeholder="phone">
			<p>ADDRESS:</p>
			<input type="text" name="address" placeholder="address">
			<p>PASSWORD:</p>
			<input type="password" name="password" placeholder="password">
			<button type=submit value=Register>Register</button>
		</form>
	</div>
</body>
</html>