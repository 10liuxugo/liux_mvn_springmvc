<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IT学习者</title>

<style type="text/css">
.foot_c {
    color: #969696;
    font-family: Arial,Helvetica,sans-serif;
    padding-left: 7px;
    padding-right: 10px;
}
.desc {
    color: #black;
    font-family: Arial,Helvetica,sans-serif;
    padding-left: 7px;
    padding-right: 10px;
}
</style>
</head>
<body>
<center>
<img alt="IT学习者" title="IT学习者" src="../images/logo.png"/>
<img alt="IT学习者" title="IT学习者" src="../images/banner.jpg"/><br/>

<br/>
<span style="color:red">${msg }</span>
<br/>

<form action="${pageContext.request.contextPath}/userInfo/logo">

<table height="400px" widht="730px">
	<tr>
		<td colspan="5"><img alt="IT学习者" src="../images/success.jpg" widht="450px" height="300px"></td>
	</tr>
	<tr>
		<td align="center">账号：</td><td align="center"><input id="userName" name="userName" type="text" value="itxxz" onblur="isCheck(this.value)"> </td>
		<td align="center">密码：</td><td align="center"><input name="password" type="password"></td>
		<td align="center"><input id="login" type="submit" value="登录" /> <input type="reset" value="取消" /></td>
	</tr>
</table>
</form>
<br />
<br />
<p class="foot_c">Copyright © 2014 IT学习者</p>
<font size="2">
如果对程序有疑惑，可到<a href="http://www.itxxz.com">IT学习者</a>社区查看详细说明文档<br/><br/>
<span style="color:green">初始账号和密码均为</span>：<span style="color:red">itxxz</span>

</font>
</center>
<script type="text/javascript">
	function isCheck(userName){
		if(userName == ""){
			document.getElementById("login").disabled="disabled";
		}else{
			document.getElementById("login").disabled="";
		}
	}
	
</script>
</body>
</html>