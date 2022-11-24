<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Digital Library</title>
</head>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: montserrat;
	background: linear-gradient(120deg, #2980b9, #8e44ad);
	height: 100vh;
	overflow: hidden;
}

.bc {
	position: relative;
	top: 8%;
	
}
.B_S{
position: relative;
top: 10%;
}

.bc button {
	font-size: 18px;
	font-weight: bold;
	margin: 0 0;
	padding: 2.5px 2.5px;
	width: 15%;
	border: 0;
	background-color: yellow;
	border-radius: 5px;
	cursor: pointer;
}
.B_S button {
	font-size: 18px;
	font-weight: bold;
	margin: 0 0;
	padding: 2.5px 2.5px;
	width: 15%;
	border: 0;
	background-color: yellow;
	border-radius: 5px;
	cursor: pointer;
}
.search-f{
height:20px;
padding:5px;
border: none;
width:25%;
border-radius:10px;
outline:none;
}
.s_btn{
height: 30px;
width: 5%;
background: #ffeb3b;
border: none;
color: #000;
border-radius: 10px;
}
.s_btn:hover{
background:#ffc107;
cursor:pointer;}
.bc button:hover{background:#ffc107;
}
.B_S button:hover{background:#ffc107;
}
</style>
<body>
	<h1>Login Successful</h1>
	<h2>Welcome</h2>
	<div class="bc">
		<form action="Display" method="post">
			<button>
				<font >Select from</font>
			</button>
		</form>
	</div>
	<div class="cc">
		<form action="Search" method="post">
			<div class="search">
				 <input type="text" class="search-f" name="txtBook">
				 <button class="s_btn" type="submit">Search</button>
			</div>
		</form>
	</div>
	<div class="B_S">
	<form action="BookSelection.jsp" method="post">
			<button>
				<font>Select Book</font>
			</button>
		</form>
	</div>
</body>
</html>