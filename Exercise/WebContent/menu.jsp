<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<title>운동 기록 프로그램</title>
</head>
<body>
<form action="record.jsp" method="post">
	<%
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
	%>
	<b><%=year %>년 <%=month %>월 <%=day %>일</b><br><br>
	<select name="ex">
		<option>풀업</option>
		<option>물구나무 푸시업</option>
		<option>푸시업</option>
		<option>삼두 푸시업</option>
		<option>딥스</option>
		<option>이두</option>
		<option>친업</option>
	</select><br><br>
	<input type="text" name="num">회<br><br>
	<input type="submit" value="저장">
	<input type="reset" value="초기화">
</form>
</body>
</html>