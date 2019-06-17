<%@page pageEncoding="utf-8"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<base href="<%=request.getContextPath()%>/">
<title>vip消费查询页</title>
</head>
<body>
	
	<header>
		<strong>${message}</strong>
		<form action="/vip/xiaofei.do" method="post">
			<p>
				<label>
					VIP:
					<input name="code"  autofocus>
				</label>
				<button type="submit">查询</button>
			</p>
		</form>
	</header>
	<main>
	<!-- 模糊查询判断 ，放入一个code值，判断是初次还是查询过后-->
		<c:if test="${v!=null}">
		<article>
			<p>
				<span>
					编号:
					<b>${v.code}</b>
				</span>
				<span>
					VIP等级:
					<b>${v.rank}</b>
				</span>
				<span>
					目前消费总金额:
					<b>￥${v.amount}元</b>
				</span>
			</p>
			
			<p>
				<span>
					姓名:
					<b>${v.name}</b>
				</span>
				<span>
					年龄:
					<b>${v.age}</b>
				</span>
			</p>
			<p>
				<span>
					QQ:
					<b>${v.qq}</b>
				</span>
				<span>
					Email:
					<b>${v.email}</b>
				</span>
				<span>
					邮寄地址/邮编:
					
					<b>${v.address}(${v.zip})</b>
				</span>
			</p>
			<p>
				${v.remark}
			<p>
		</article>
		</c:if>
		
	</main>
	
</body>
</html>