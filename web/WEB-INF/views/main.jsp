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

<h2>The path is available</h2>
<h2>Here is the information of category, including id, name and description.</h2>

<ur>

<c:forEach items="${category}" var="category">
    <li >
        <a href="#" >${category.id}</a>
        <a href="#" >${category.name}</a>
        <a href="#" >${category.description}</a>


    </li>

</c:forEach>
</ur>
</body>
</html>
