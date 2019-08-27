<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" 
crossorigin="anonymous">
</head>
<body>

<h3>Enter in location via </h3>
<form action="show-w">
Enter Longitude:<input type="text" name="longitude">
Enter latitude:<input type="text" name="latitude">
<input type="submit" value="submit">
</form>
</body>
</html>