<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
	
	<form action="save.do" method="post">
		<table align="center" width="500">
			<tr>
				<td>제목:</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>작성자:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea name="content" rows="5" cols="50"></textarea></td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="작성 완료" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>