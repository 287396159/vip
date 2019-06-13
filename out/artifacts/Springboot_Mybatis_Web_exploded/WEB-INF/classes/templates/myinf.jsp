<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人资料信息</title>
</head>
<body>

<h1>个人资料查看</h1>
<b>${sessionScope.currentUser.name}</b>
<p>id：${sessionScope.currentUser.id}</p>
<p>账号：${sessionScope.currentUser.account}</p>
<p>名称：${sessionScope.currentUser.name}</p>
<p>密码：${sessionScope.currentUser.password}</p>
</body>
</html>