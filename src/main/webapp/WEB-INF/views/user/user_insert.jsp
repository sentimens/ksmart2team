<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertUser" method="post">
		<table>
			<tr>
				<td>user_id :</td>
				<td><input type = "text" name="user_id"></td>
			</tr>
			<tr>
				<td>mall_code :</td>
				<td><input type = "text" name="mall_code"></td>
			</tr>
			<tr>
				<td>user_pw :</td>
				<td><input type = "text" name="user_pw"></td>
			</tr>
			<tr>
				<td>user_name :</td>
				<td><input type = "text" name="user_name"></td>
			</tr>
			<tr>
				<td>user_phone :</td>
				<td><input type = "text" name="user_phone"></td>
			</tr>
			<tr>
				<td>user_email :</td>
				<td><input type = "text" name="user_email"></td>
			</tr>
			<tr>
				<td>user_job :</td>
				<td><input type = "text" name="user_job"></td>
			</tr>
		</table>
		<input type="submit" value= "제출하기">
	</form>
</body>
</html>