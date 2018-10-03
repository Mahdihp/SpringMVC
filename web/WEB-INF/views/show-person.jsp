<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mahdi
  Date: 10/3/18
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form:form modelAttribute="person" method="post" action="/app/persons/add-person">

    <form:input path="fullName"/>
    <input type="submit"/>
</form:form>
</body>
</html>
