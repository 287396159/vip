<%@page pageEncoding="utf-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增vip页面</title>
</head>
<body>
		<header>
			<p>
				<a>新增</a>
			</p>
			<p>
				<form action="../add.do" method="post">
					<input name="key"><button type="button">添加</button>
				</form>
			</p>
		</header>
		<main>
			<table>
				<thead>
					<tr>
						<th>序号</th>
						<th>操作</th>
						<th>编号(手机号)</th>
						<th>姓名</th>
						<th>VIP等级</th>
						<th>目前共消费金额</th>
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>1</td>
						<td><a href="#">查看/修改</a></td>
						<td>编号(手机号)</td>
						<td>姓名</td>
						<td>VIP等级</td>
						<td>目前共消费金额</td>
					</tr>
				</tbody>
			</table>
			
			<p>
				<span>
				共<b>100</b>条记录 
				每页<b>100</b>条
				共<b>10</b>页
				</span>
				<span>
					<a>上一页</a>
					<b>1</b>
					<a>下一页</a>
				</span>
			</p>
		</main>
</body>
</html>