<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculate your mortgage here</title>
</head>
<body>
<form action="MortgageServlet" method="post">
		<h1>Mortgage Calculator</h1>

			<label for="principal">What is the principal?</label> 
			<input id="principal" name="principal" value="${param.principal}">
    <br/>
			<label for="rate">What is the rate?</label> 
			<input id="rate" name="rate" value="${param.rate}">
				
	<br/>	
	<label for="term">How many years you would pay?</label> 
			<input id="term" name="term" value="${param.term}">
				
	<br/>	
			<input type="submit" value="Calculate">
			<br>
			<span>${message}</span> 
	</form>
</body>
</html>