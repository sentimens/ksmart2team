<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertCost" method="post">
		<table>
			<tr>
				<td>cost_code :</td>
				<td><input type = "text" name="cost_code"></td>
			</tr>
			<tr>
				<td>goods_barcode :</td>
				<td><input type = "text" name="goods_barcode"></td>
			</tr>
			<tr>
				<td>user_id :</td>
				<td><input type = "text" name="user_id"></td>
			</tr>
			<tr>
				<td>cost_unitcost :</td>
				<td><input type = "text" name="cost_unitcost"></td>
			</tr>
			<tr>
				<td>cost_expprice :</td>
				<td><input type = "text" name="cost_expprice"></td>
			</tr>
			<tr>
				<td>cost_saleprice :</td>
				<td><input type = "text" name="cost_saleprice"></td>
			</tr>
			<tr>
				<td>cost_salerate :</td>
				<td><input type = "text" name="cost_salerate"></td>
			</tr>
			<tr>
				<td>cost_realprice :</td>
				<td><input type = "text" name="cost_realprice"></td>
			</tr>
			<tr>
				<td>cost_note :</td>
				<td><input type = "text" name="cost_note"></td>
			</tr>
		</table>
		<input type="submit" value= "제출하기">
	</form>
</body>
</html>