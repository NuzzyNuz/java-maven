<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/appone/carapi/cars" method="post">
		<label>Enter Model</label>
		<br>
		<input type="text" name="model">
		<br><br>
		<label>Enter Brand</label>
		<br>
		<input type="text" name="brand">
		<br><br>
		<label>Enter Year</label>
		<br>
		<input type="text" name="year">
		<br><br>
		<label>Enter Color</label>
		<br>
		<input type="text" name="color">
		<br><br>
		<label>Enter Type</label>
		<br>
		<input type="text" name="type">
		<br><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>