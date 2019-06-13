<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>错误页面</title>
<script src="<%=path%>/static/test/js/jquery-3.2.1.min.js"></script>
<script src="<%=path%>/static/test/js/popper.min.js"></script>
<script src="<%=path%>/static/test/js/bootstrap.min.js"></script>
<script src="<%=path%>/static/test/js/main.js"></script>
<script src="<%=path%>/static/test/js/plugins/pace.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 主样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/static/test/css/main.css">
<!-- 动态变化控制，很重要 -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
  <body class="app sidebar-mini rtl">
      <div class="page-error tile">
        <h1><i class="fa fa-exclamation-circle"></i> Error 404: 页面找不到了哟！</h1>
        <p>找不到您请求的页面。.</p>
        <p><a class="btn btn-primary" href="welcome.do">返回</a></p>
      </div>
 
    <!-- Page specific javascripts-->
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
  </body>
</html>