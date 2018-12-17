<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/17
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>mainPage</title>
</head>
<body>

<h1>Hi, there!</h1>
<c:forEach items="${category}" var="category">
    <li>
        <a href="#">${category.name}</a>
    </li>
</c:forEach>

</body>
</html>
