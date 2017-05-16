<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body style="text-align: center;">

<div style="margin:0 auto;">
<h2>注&nbsp;&nbsp;册</h2>
<form action="<%=request.getContextPath()%>/common/register" method="post">
	用户名：<input type="text" name="username"></br>
	密&nbsp;&nbsp;码：<input type="password" name="password"></br>
	<input type="submit" value="注册">
</form>

</body>
</html>