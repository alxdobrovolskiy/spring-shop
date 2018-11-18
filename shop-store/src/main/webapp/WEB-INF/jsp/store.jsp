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
Language : <a href="/store?lang=en">EN</a> | <a href="/store?lang=ua">UA</a>
<h1><tag:message code="store.label" text="Not Found" /></h1>
<h2><tag:message code="store.listProducts" text="Not Found" /></h2>
<c:choose>
<c:when test="${not empty products}">
    <table class="pure-table">
        <thead>
            <tr>
                <th>Product</th>
                <th>Price</th>
                <th>Amount</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}" varStatus="loopStatus">
            <tr class="${loopStatus.index % 2 == 0 ? '' : 'pure-table-odd'}">
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.amount}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:when>
<c:otherwise>
    <label>There are no products</label>
</c:otherwise>
</c:choose>
<h2><tag:message code="store.newProduct" text="Not Found" /></h2>
<form:form modelAttribute="product" action="/store/processSubmit" method="post">
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
            <td>Amount</td>
            <td><form:input path="amount"/></td>
            <td style="color: red; font-size: small;"><form:errors path="price" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save Changes" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
