<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
hi there may be some books blow<br>
<ul>
<c:forEach items="${books}" var="books">
    <li>${books.name}</li>
</c:forEach>
</ul>
</body>
</html>