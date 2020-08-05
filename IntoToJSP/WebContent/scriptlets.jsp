<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("Your IP address is " + request.getRemoteAddr());
	%>
	<br />
	<%!public String printStars() {
		String ans = "";
		for (int i = 0; i < 10; i++) {
			ans += "*********<br/>";
		}
		return ans;
	}%>

	<%=printStars()%>
	
	<% String test;
			/* if(){
				out.println("<span class='text-error'>"++"</span>");
			}	 */		
		%>
</body>
</html>