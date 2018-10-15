<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/base-min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/tables-min.css" />" rel="stylesheet">
    <title>Shop Store</title>
</head>
<body>
Language : <a href="?lang=en">EN</a> | <a href="?lang=ua">UA</a>
<h1><tag:message code="store.label" text="Not Found" /></h1>
<c:choose>
<c:when test="${not empty products}">
    <table class="pure-table">
        <thead>
            <tr>
                <th>Product</th>
                <th>Price</th>
                <th>Currency</th>
                <th>Unit</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}" varStatus="loopStatus">
            <tr class="${loopStatus.index % 2 == 0 ? '' : 'pure-table-odd'}">
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.currency.name}</td>
                <td>${product.unitMeasure.name}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:when>
<c:otherwise>
    <label>There are no products</label>
</c:otherwise>
</c:choose>

</body>
</html>
