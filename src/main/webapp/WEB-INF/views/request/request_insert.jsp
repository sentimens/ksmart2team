<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertRequest" method="post">
		<table>
			<tr>
				<td>code :</td>
				<td><input type = "text" name="request_code"></td>
			</tr>
			<tr>
				<td>id :</td>
				<td><input type = "text" name="user_id"></td>
			</tr>
			<tr>
				<td>cate :</td>
				<td><input type = "text" name="request_cate"></td>
			</tr>
			<tr>
				<td>content :</td>
				<td><input type = "text" name="request_content"></td>
			</tr>
			<tr>
				<td>status :</td>
				<td><input type = "text" name="request_status"></td>
			</tr>
		</table>
		<input type="submit" value= "제출하기">
	</form>
</body>
</html>