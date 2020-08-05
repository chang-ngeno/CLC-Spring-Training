<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>
<%
	String ItemBought = request.getParameter("");
%>
	<form action="Checkout" method="post">
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<span class="input-group-text" id="fullname">Full Name</span>
			</div>
			<input type="text" class="form-control" 
				aria-label="fullname" aria-describedby="fullname">
		</div>
		<div>
		<input class="form-control" type="text" placeholder=<%=request.getParameter("ItemBought") %> readonly>
		</div>
	</form>
</body>
</html>