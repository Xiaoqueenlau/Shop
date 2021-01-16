<%--
  Created by IntelliJ IDEA.
  User: admi
  Date: 2021/1/15
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试</a>
<form acction="account/saveAccount" method="post">
    姓名：<input type="text" name="name">
    金额：<input type="text" name="money">
    <input type="submit" value="Save">
</form>
</body>
</html>
