<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body class="jumbotron">
	<div class="container">
		<h3>Our Products</h3>
		<ul>
			<li><a href="shop?item=shirt">Shirts</a></li>
			<li><a href="shop?item=shirt">Trousers</a></li>
			<li><a href="shop?item=shirt">Shoes</a></li>
		</ul>
		<form action="Shop" method="POST"></form>
	</div>

</body>
</html>