<%@page pageEncoding="utf-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>录入VIP客户</title>
</head>
<body>
	<header>
		<h1>查看/修改VIP客户信息</h1>
	</header>
	<main>
		<p>
			<strong>${message}</strong>
		<p>
	 <form action="" method="post">
        <p>
            <label>*手机号:<input name="phone" placeholder="将作为VIP编号"></label>
        </p>
        <p>
            <label>*姓名:<input name="name"></label>
        </p>
        <p>
            <label>*性别:</label>
            <label>
            <input  name="sex" type="radio" value="1" checked>男
            </label>
            <label>
            <input  name="sex" type="radio" value="0">女
            </label>
        </p>
        <p>
            <label>年龄:<input type="number" name="age"></label>
        </p>
        <p>
            <label>QQ:<input name="qq"></label>
        </p>
        <p>
            <label>Email:<input name="email"></label>
        </p>
        <p>
            <label>邮编:<input name="zip"></label>
        </p>
        <p>
            <label>邮寄地址:<input name="address"></label>
        </p>
        <p>
            <label>备注:<textarea name="remark"></textarea></label>
        </p>
        <p>
            <button type="submit">确定</button>
            <a href="welcome.jsp">返回</a>	
        </p>
    </form>
    </main>
</body>
</html>