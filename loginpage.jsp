<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
<link rel="stylesheet"  type="text/css" href="loginpage.css" >
</head>
<body>
	`

	<form action="Loginvalidation" method="post">
		<div class="container">
			<h1>TORNEIO</h1>
			<label for="loginid"><b>Login Id</b></label> <input type="text"
				placeholder="Enter ID" name="loginid" id="loginid" required>
				<br>
			<br> <label for="psw"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="psw" id="psw"
				required>
				<br>
				<br>
			<button type="submit" class="btn" style="color:white">Login</button>
			<a href="signup.jsp">signup</a>
			<a href="forgetpass.html">Forget passward</a>
		</div>
	</form>
</body>
</html>