<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Introduction to JSP</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles.css" />
</head>
<body>

	<!-- BEGIN JAVA IN HTML -->
	<%
		out.println("Hello World! <br/> Welcome to JSP! <br/>");
	%>
	<%
         out.println("Your IP address is " + request.getRemoteAddr());
    %>
	<%--
	<%!public String printStars() {
		String ans = "";
		for (int i = 0; i < 10; i++) {
			ans += "*********<br/>";
		}
		return ans;
	}%>

	<%=printStars()%> --%>

	<!-- END JAVA IN HTML -->

	<!-- FORMS IN JSP -->
	<div style="margin-top: 15px;">
		<form action="display.jsp" method="post" class="form-horizontal">
			<div class="form-input">
				<label for="lastName">Last name</label> <input type="text"
					name="lastName" />
			</div>
			<div>
				<label for="residence">Residence</label> <input type="text"
					name="residence" />
			</div>
			<div style="margin-top: 15px;">
				<input type="submit" role="button" value="Submit"
					class="btn btn-primary" /> <input type="reset" role="button"
					value="Clear" class="btn btn-warning" />
			</div>
		</form>
	</div>
	<!-- END FORMS IN JSP -->

</body>
</html>