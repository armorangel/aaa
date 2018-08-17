<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<ul>
		<li><a href="fortune.do">오늘의 운세</a></li>
		<li><a href="weather.do">오늘의 날씨</a></li>
	</ul>
	
	<form method="post" action="sum.do">
		수1 <input type="text" name="num1">
		수2 <input type="text" name="num2">
		<input type="submit" value="두수합">
	</form>



</body>
</html>