<%@ page import="com.maktab.model.Person" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mahdi
  Date: 10/3/18
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (request.getAttribute("person") != null) {
        Object person = request.getAttribute("person");
        System.out.println(person);
        List<Person> list = (List) person;
        for (Person p : list) {
            out.println(p);
        }
    }
%>
</body>
</html>
