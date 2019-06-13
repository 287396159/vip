<%@ page pageEncoding="utf-8"%>
<%
String path = request.getContextPath();

%>
<html>
<head>
<meta charset="utf-8">
<title>欢迎登录消费系统--原页面--删除即可</title>
</head>
<!-- 保证当前窗口最前 -->
<script>
    if(window.top!==window){
    	window.top.location.href=window.location.href;
    }
</script>
<body>
	<!-- 返回出信息 -->
	<strong>${message}</strong>
	<form action="login.do" method="post">
		<p>
			<label>Account:<input name="account"></label>
		</p>
		<p>
			<label>Password:<input name="password" type="password"></label>
		</p>
		<p>
			<button type="submit">Login</button>
		</p>
		
		<a href="<%=path %>/index.do">点击前往</a>
		
	</form>
	<!-- 提示过了以后删除提示语句 -->
	 <%session.removeAttribute("message"); %>
</body>
</html>

