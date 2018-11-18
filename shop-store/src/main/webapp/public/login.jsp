<%--
  Created by IntelliJ IDEA.
  User: ptc-hp-24
  Date: 10/18/2018
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Auth form</title>
</head>
<body>
    <c:url var="post_url"  value="/login" />
<form:form action="${post_url}" method="POST">
    Your Username:
    <input type="text" name="username">
    <br>

    Your Password:
    <input type="password" name="password">
    <br>

    <input type="submit" value="Try to Login">
    <input type="hidden" name="remember-me" value="yes">
</form:form>

</body>
</html>
