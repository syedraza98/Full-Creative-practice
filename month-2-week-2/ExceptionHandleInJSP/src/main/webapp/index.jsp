<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="purple">
	<form action="add" method="get">
		<p>Enter the first value:<input type="number" name="num1"></p>
		<p>Enter the second value:<input type="number" name="num2"></p>
		<input type="submit">
	</form>
	<%
	//int num1=Integer.parseInt(request.getParameter("num1"));
    //int num2=Integer.parseInt(request.getParameter("num2"));
    int num1=1;
    int num2=0;
	
	try{
		int divide=num1/num2;
		out.println("Ans is :" +divide);
		
	}catch(Exception e){
		out.print("error is occured" +e.getMessage());
	}
  %>
      
</body>
</html>