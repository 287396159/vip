<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页原页面--删除即可</title>
</head>
<style>
    	menu,h1,ul{
    		margin:0;
    	}
    	html,body{
    		margin:0;
    		height: 100%;
    		font-size: 14px;
    	}
    	body>header{
    		line-height: 80px;
    		text-align: center;
    		background: #999;
    		height: 80px;
    		
    	}
    	body>header>h1{
    		display: inline;
    		text-align: center;
    	
    	}
    	.body{
    		position: absolute;
    		top:80px;
    		bottom: 0;
    		width: 100%;
    	}
    	
    	.body>menu{
    		position:absolute;
    		left:0;
    		width:200px;
    		height:100%;
    		background: #eee;
    		box-sizing: border-box;
    	}
    	.body>main{
    		margin-left: 200px;
    		height: 100%;
    	}
    	main>iframe{
    		height:100%;
    		width: 100%;
    		border:0;
    		display: block;		
    	}
    </style>
<body>
<header>
    	<h1>VIP消费查询系统</h1>
    	<span>
    		<b>${sessionScope.currentUser.name}</b>
    		<!-- 退出登陆链接 -->
    		<a href="logout.do">退出登录</a>
    	</span>
    </header>
    <section class="body">
    	<menu>
    		<ul>
    		<li>
    			<a href="vip/qry.do" target="mainFrame">VIP客户查询</a>
    		</li>
    		<li>
    			<a href="vip/add.do" target="mainFrame">录入VIP客户</a>
    		</li>	
    		<li>
    			<a target="mainFrame">VIP客户管理</a>
    		</li>	
    		<li>
    			<a href="vip/xiaofei.do" target="mainFrame">VIP消费记录</a>
    		</li>	
    		<li>
    			<a  target="mainFrame">录入VIP消费记录</a>
    		</li>	
    		<li>
    			<a href="manage/list.do" target="mainFrame">VIP消费记录管理</a>
    		</li>	
    		<li>
    		<!-- targer表示在当前窗口中打开页面 -->
    			<a href="updatepassword.do" target="mainFrame">修改密码11111111111111</a>
    		</li>	
    		<li>
    		<!-- 个人完成--个人资料修改 -->
    			<a href="myinf.do" target="mainFrame" name="account">个人信息</a>
    		</li>
    		</ul>
    	</menu>
    	<main>
    	<!-- 主区。默认先显示welcome页面 -->
    		<iframe name="mainFrame" src="welcome.do"></iframe>
    	</main>
    </section>
</body>
</html>