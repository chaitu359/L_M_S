<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Login.css">
<meta charset="UTF-8">
<title>welcome</title>
</head>
<style>
body{
margin:0;
padding:0;
font-family:montserrat;
background:linear-gradient(120deg,#2980b9,#8e44ad);
height: 100vh;
overflow:hidden;
}
.center{
position: absolute;
top: 50%;
left:50%;
transform: translate(-50%,-50%);
width:400px;
background: white;
border-radius:10px;
}
.center h2{
padding: 0 0 20px 0;
border-bottom:1px solid silver;
}

.center form{
padding: 0 40px;
box-sizing:border-box;
}
form .text-field{
position: relative;
border-bottom: 2px solid #adadad;
margin: 30px 0;
}
.text-field input{
width: 100%;
padding: 0 5px ;
height: 40px;
font-size:16px;
border: none;
outline: none;
}
.login input {
width:100%;
heigt:70px;
border: 1px solid;
background: #2691d9;
border-radius: 25px;
font-size: 18px;
color: #e9f4fb;
font-weight: 500;
cursor: pointer;
outline: none;
}
.login input :hover{
border-color:#2691d9;
transition:.5s;
}
.admin{
margin: 30px 0;
text-align: center;
font-size: 16px;
color:#666666;
}
.admin a{
color: #2661d9;
text-decorat: none;
}
.admin a:hover{
text-decoration: italics;
}
.signup_link{
margin: 30px 0;
text-align: center;
font-size: 16px;
color:#666666;
}
.signup_link a{
color: #2661d9;
text-decorat: none;
}
.signup_link a:hover{
text-decoration: italics;
}
</style>
<body>
	<img src="C:\Users\Chait\Downloads\library1.jpg" id=logo />
	<div align=center>
		<h1>Welcome to Library</h1>
	</div>
	<div class="center">
		<h2>Login</h2>
		<form action="LoginServlet" method=post>
				<div class="text-field">
					<input type=text placeholder=username name=txtName
						autocomplete=nope>
				</div>
				<div class="text-field">
					<input type="password" placeholder="password" name=txtPwd>
				</div>
				<div class="login">
				<input type="submit" value="Login"></div>
				<div class="signup_link">
					New user?<a href="Signup.jsp">Signup</a>
				</div>
				<div class="admin">
				Admin?<a href="AdminSignup.jsp">here</a></div>
		</form>
	</div>	
</body>
</html>