<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2020/12/25
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加账户信息表单</h1>
<form name="accountFrom" action="${pageContext.request.contextPath}/account/save" method="post">
    账户名称：<input type="text" name="name"><br>
    账户金额：<input type="text" name="money"><br>
    <input type="submit" value="保存"><br>
    <a href="${pageContext.request.contextPath}/account/findAll">查看全部</a>
</form>
</body>
</html>
