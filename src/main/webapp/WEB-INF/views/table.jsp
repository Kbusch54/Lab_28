<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>
	<form action="show-w">
		<h1>Weather</h1>
		<table class="table">
			<tr>
				<th>Temperature</th>
				<th>Weather</th>
				<th>Text</th>

			</tr>
			
		<tr>
			<td><c:forEach var="c" items="${test}">${c }<br></c:forEach></td>
			<td>${weather }</td>
			<td>${text }</td>
		</tr>


 
			

		</table>
	</form>
</body>
</html>