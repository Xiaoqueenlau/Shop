<%--
  Created by IntelliJ IDEA.
  User: admi
  Date: 2021/1/15
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>success</h1>
    <c:forEach items="${list}" var="account">
        ${account.name}<br/>
        ${account.money}
    </c:forEach>
</body>
</html>
