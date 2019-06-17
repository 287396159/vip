<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>VIP用户录入页</title>
</head>
<body>
	<header>
	<h1>录入VIP客户</h1>
	</header>
	<main>
	<p>
		<strong>${message}</strong>
	<p>
	<form action="/vip/add.do" method="post">
		<p>
			<label>*手机号:<input name="phone" value="${param.phone}"
				placeholder="将作为VIP编号"></label>
		</p>
		<p>
			<label>*姓名:<input name="name" value="${param.name}"></label>
		</p>
		<p>
			<label>*性别:</label> <label> <input name="sex" type="radio"
				value="1" checked>男
			</label> <label> <input name="sex" type="radio" value="0"
				${param.sex=='0'?'checked':''}>女
			</label>
		</p>
		<p>
			<label>年龄:<input type="number" value="${param.age}"
				name="age"></label>
		</p>
		<p>
			<label>QQ:<input name="qq" value="${param.qq}"></label>
		</p>
		<p>
			<label>Email:<input name="email" value="${param.email}"></label>
		</p>
		<p>
			<label>邮编:<input name="zip" value="${param.zip}"></label>
		</p>
		<p>
			<label>邮寄地址:<input name="address" value="${param.address}"></label>
		</p>
		<p>
			<label>备注:<textarea name="remark">${param.remark}</textarea></label>
		</p>
		<p>
			<button type="submit">确定</button>
			<a href="<%=basePath%>/welcome.do">返回</a>
		</p>
	</form>
	</main>
</body>
</html>