<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:cyan">
<%!
int instance=10;

%>
<%
int num1=10;
int num2=5;
int sum=num1+num2;


out.println("result is:" + sum);
%>
 <P>value of instance variable is<%= instance %></P>

</body>
</html>