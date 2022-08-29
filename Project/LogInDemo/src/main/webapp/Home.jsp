<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body style="background-color:cyan">
	<h1>welcome to home page</h1>
<%  
  String email=(String)session.getAttribute("email");
	if(email==null){
		response.sendRedirect("error.html");
	}
	
	

%>
<h2>Your mail is <%=email %></h2>
<a href="Activities.jsp"><button>Activities</button></a>

<form action="logout">
 <input type="submit" value="logout">
</form>

</body>
</html>