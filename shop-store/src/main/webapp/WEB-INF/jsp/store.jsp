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
<c:when test="${not empty productEntities}">
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
        <c:forEach var="productEntity" items="${productEntities}" varStatus="loopStatus">
            <tr class="${loopStatus.index % 2 == 0 ? '' : 'pure-table-odd'}">
                <td>${productEntity.name}</td>
                <td>${productEntity.price}</td>
                <td>${productEntity.currencyEntity.name}</td>
                <td>${productEntity.unitMeasureEntity.name}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:when>
<c:otherwise>
    <label>There are no productEntities</label>
</c:otherwise>
</c:choose>

<form:form commandName="product">
    <table>
        <tr>
            <td>Product</td>
            <td><form:input path="name"/></td>
            <td style="color: red; font-size: small;"><form:errors path="name" /></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><form:input path="price"/></td>
            <td style="color: red; font-size: small;"><form:errors path="price" /></td>
        </tr>
        <tr>
            <td>Currency name</td>
            <td><form:input path="currency.name"/></td>
            <td style="color: red; font-size: small;"><form:errors path="currency.name" /></td>
        </tr>
        <tr>
            <td>Currency code</td>
            <td><form:input path="currency.code"/></td>
            <td style="color: red; font-size: small;"><form:errors path="currency.code" /></td>
        </tr>
        <tr>
            <td>Unit</td>
            <td><form:input path="unitMeasure.name"/></td>
            <td style="color: red; font-size: small;"><form:errors path="unitMeasure.name" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save Changes" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
