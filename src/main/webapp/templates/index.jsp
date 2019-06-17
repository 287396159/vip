<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>vip消费系统首页</title>
<script src="<%=path%>/static/test/js/jquery-3.2.1.min.js"></script>
<script src="<%=path%>/static/test/js/popper.min.js"></script>
<script src="<%=path%>/static/test/js/bootstrap.min.js"></script>
<script src="<%=path%>/static/test/js/main.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 主样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/static/test/css/main.css">
<!-- 动态变化控制，很重要 -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.mainFrame {
	height: 100%;
	width: 100%;
	border: 0;
	display: block;
}
</style>
<body class="app sidebar-mini rtl">
	<!--导航栏-->
	<header class="app-header"> <a class="app-header__logo"
		href="<%=path%>/index.do">Zoutao</a>
	<!-- 侧边栏切换按钮--> <a
		class="app-sidebar__toggle" href="#" data-toggle="sidebar"
		aria-label="Hide Sidebar"></a>
	<!-- 导航栏右键菜单-->
	<ul class="app-nav">
	<!-- 搜索栏 -->
		<!-- <li class="app-search"><input class="app-search__input"
			type="search" placeholder="Search">
			<button class="app-search__button">
				<i class="fa fa-search"></i>
			</button></li> -->
		<li class="app-search"><b>欢迎您:${sessionScope.currentUser.account}</b></li>

		<!-- 用户菜单-->
        <li class="dropdown">
            <a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-i用户菜单tem" href="/page-user.html">
                <i class="fa fa-cog fa-lg"></i> 设置</a></li>
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-user fa-lg"></i>个人资料</a></li>
            <li><a class="dropdown-item" href="page-login.html"><i class="fa fa-sign-out fa-lg"></i>退出</a>
            </li>
          </ul>
        </li>
      </ul>
    </header>
	<!-- 侧边菜单-->
	<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
	<aside class="app-sidebar">
	<div class="app-sidebar__user">
		<img class="app-sidebar__user-avatar"
			src="<%=path%>/static/images/头像.png"
			alt="User Image">
		<div>
			<p class="app-sidebar__user-name">邹涛</p>
			<p class="app-sidebar__user-designation">前端开发工程师</p>
		</div>
	</div>
	<ul class="app-menu">
		<li><a class="app-menu__item active" href="welcome.do"
			target="mainFrame"> <i class="app-menu__icon fa fa-dashboard"></i>
				<span class="app-menu__label">主菜单</span>
		</a></li>
		<li class="treeview"><a class="app-menu__item" href="#"
			data-toggle="treeview"><i class="app-menu__icon fa fa-laptop"></i><span
				class="app-menu__label">VIP客户查询</span><i
				class="treeview-indicator fa fa-angle-right"></i></a>
			<ul class="treeview-menu">
			<!-- target=使得页面在主区显示，而不是打开新窗口 -->
				<li><a class="treeview-item" href="<%=path%>/vip/qry.do" target="mainFrame"><i
						class="icon fa fa-circle-o"></i>客户查询</a></li>
				<li><a class="treeview-item" href="#"><i
						class="icon fa fa-circle-o"></i> 测试页面</a></li>
			</ul></li>

		<li class="treeview"><a class="app-menu__item" href="#"
			data-toggle="treeview"><i class="app-menu__icon fa fa-edit"></i><span
				class="app-menu__label">VIP客户录入</span><i
				class="treeview-indicator fa fa-angle-right"></i></a>
			<ul class="treeview-menu">
				<li><a class="treeview-item" href="<%=path%>/vip/add.do" target="mainFrame"><i
						class="icon fa fa-circle-o"></i> 客户录入</a></li>
				<li><a class="treeview-item" href="#"><i
						class="icon fa fa-circle-o"></i> 二级菜单</a></li>
			</ul></li>
		<li class="treeview"><a class="app-menu__item" href="#"
			data-toggle="treeview"><i class="app-menu__icon fa fa-th-list"></i><span
				class="app-menu__label">VIP消费记录</span><i
				class="treeview-indicator fa fa-angle-right"></i></a>
			<ul class="treeview-menu">
				<li><a class="treeview-item" href="<%=path%>/vip/xiaofei.do" target="mainFrame"><i
						class="icon fa fa-circle-o"></i>基本消费 </a></li>
				<li><a class="treeview-item" href="table-data-table.html" target="mainFrame"><i
						class="icon fa fa-circle-o"></i> 数据表</a></li>
			</ul></li>
		<li class="treeview"><a class="app-menu__item" href="#" target="mainFrame"
			data-toggle="treeview"><i class="app-menu__icon fa fa-file-text" ></i><span
				class="app-menu__label">消费记录管理</span><i
				class="treeview-indicator fa fa-angle-right"></i></a>
			<ul class="treeview-menu">
				<li><a class="treeview-item"  href="<%=path%>/error.do" target="mainFrame"><i
						class="icon fa fa-circle-o"></i> 错误页</a></li>
			</ul>
		</li>
		<li><a class="app-menu__item" href="<%=path%>/myinf.do" target="mainFrame"><i
				class="app-menu__icon fa fa-pie-chart"></i><span
				class="app-menu__label">个人信息</span></a>
		</li>
		<li><a class="app-menu__item" href="<%=path%>/updatepassword.do" target="mainFrame"><i
				class="app-menu__icon fa fa-pie-chart"></i><span
				class="app-menu__label">修改密码</span></a>
		</li>

		<!-- 预留位置 -->
		<li><a class="app-menu__item" href="<%=path%>/logout.do" target="mainFrame"><i
				class="app-menu__icon fa fa-pie-chart"></i><span
				class="app-menu__label">退出登录</span></a>
		</li>

	</ul>
	</aside>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-dashboard"></i> vip消费查询系统
			</h1>
			<p>这个是一个vip消费查询系统</p>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">仪表盘</a></li>
		</ul>
	</div>
	<!-- 显示主区域 -->
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<div class="tile-body">
					<div id="sampleTable_wrapper"
						class="dataTables_wrapper container-fluid dt-bootstrap4 no-footer">
						<div class="row">
							<div class="col-sm-12 col-md-6">
								<div class="dataTables_length" id="sampleTable_length">
									<!-- 主区。默认先显示welcome页面 -->
									<iframe name="mainFrame" src="welcome.do"
									style="width: 1200px;height: 800px;border-style: none;"></iframe>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<!-- 用于应用程序的基本java代码-->
	<script src="<%=path%>/static/test/js/jquery-3.2.1.min.js"></script>
	<script src="<%=path%>/static/test/js/popper.min.js"></script>
	<script src="<%=path%>/static/test/js/bootstrap.min.js"></script>
	<script src="<%=path%>/static/test/js/main.js"></script>

	<!-- 在顶部显示页面加载的javascript插件-->
	<script src="<%=path%>/static/test/js/plugins/pace.min.js"></script>
	<!-- 具体页面的javascript-->
	<script type="text/javascript"
		src="<%=path%>/static/test/js/plugins/chart.js">
	</script>

</body>
</html>