<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body class="jumbotron">
	<div class="container">
		<form action="CheckPassword" method="POST" class="form">
			<h4>LOGIN</h4>
			<span class="text-danger"></span>
			<div class="form-group">
				<label for="username">UserName</label> <input type="text"
					class="form-control" name="username" required="required"
					id="username" />
			</div>
			<div class="form-group">
				<label for="residence">Password</label> <input type="password"
					class="form-control" name="password" required="required"
					id="password" />
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-warning">Clear</button>
			</div>
		</form>
	</div>



</body>
</html>