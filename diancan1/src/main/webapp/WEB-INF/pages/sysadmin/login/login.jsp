<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="${ctx }/staticfile/skin/default/css/login.css"/>
	<title>欢迎您登陆</title>
	
</head>
<body>
	<h1>     欢迎登陆Order-Online</h1>
	<form action="login.action" method="post">
		<table>
			<tr>
				<td class="tdx">     用户名：</td>
				<td><input type="text" id="username" name="username" value=""/>
				</td>
			</tr>
			<tr>
				<td class="tdx">     密&nbsp;&nbsp; 码：</td>
				<td><input type="password" name="password"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				         用户类型:
					 <input type="radio" name="usertype" value="0"/>管理员
					<input type="radio" name="usertype" value="1"/>收银员
				</td>
			</tr>
			<tr>
				<td colspan="6" >
					<input type="submit" value="登陆"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<span style="color:red">${msg}</span>
				</td>
			</tr>
		</table>
	</form>		
</body>
</html>

  