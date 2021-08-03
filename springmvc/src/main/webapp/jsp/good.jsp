<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hj
  Date: 2019/1/21
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${orders}" var="list">
    <tr>
        <td>${list.name}</td>
        <td>${list.id}</td>
        <td>${list.year}</td>

    </tr>
</c:forEach>
</body>
</html>
