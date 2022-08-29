<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:green">
<h1>It is a simple page and you need not to do any activities just simple logIN or LogOut</h1>
<form action="logout">
 <input type="submit" value="logout">
</form>
<%
   String email=(String)session.getAttribute("email");
   if(email==null){
	  response.sendRedirect("error.html");
   }

%>


</body>
</html>