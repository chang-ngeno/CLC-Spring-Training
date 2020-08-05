<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body>
	<%
		String lastName = request.getParameter("lastName");
		String residence = request.getParameter("residence");
	%>

	<div>
		Welcome
		<%=lastName%>, now I know your come from
		<%=residence%>.
	</div>

</body>
</html>