<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath(); 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码页面</title>
<!-- 主样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/static/test/css/main.css">
<!-- 动态变化控制，很重要 -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>
<!-- 用于显示异常信息 -->
<strong>${message}</strong>
	 <form action="/updatepassword.do" method="post">
        <p><label class="col-md-6">旧密码:<input name="oldPassword"></label>
        </p>
        <p>
            <label>新密码:<input name="newPassword"></label>
        </p>
        <p>
            <label>确认密码:<input name="newPasswordConfirm"></label>
        </p>
        <p>
            <button type="submit" class="btn btn-success">确定</button>
            <a href="<%=path %>/welcome.do" class="btn btn-danger">返回</a>	
            
        </p>
    </form>
</body>
</html>