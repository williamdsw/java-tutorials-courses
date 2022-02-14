<%-- 
    Document   : products
    Created on : 21/07/2020, 21:52:49
    Author     : William
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Products</title>
    </head>
    <body>
        <c:set var="listProducts" value="${products}" />

        <main>
            <article>
                <header>
                    <h1> Products </h1>
                </header>

                <table class="table-products">
                    <thead>
                        <td> Id </td>
                        <td> Name </td>
                        <td> Description </td>
                        <td> Price </td>
                        <td> Manufactured at </td>
                        <td> Expires at </td>
                        <td> Created at </td>
                        <td> Updated at </td>
                    </thead>
                    <tbody>
                    <c:forEach var="product" items="${products}">
                        <tr>
                            <td> ${product.id} </td>
                            <td> ${product.name} </td>
                            <td> ${product.description} </td>
                            <td> <fmt:formatNumber type="currency" value="${product.price}"/> </td>
                            <td> <fmt:formatDate type="date" value="${product.manufacturedDate}"/> </td>
                            <td> <fmt:formatDate type="date" value="${product.expirationDate}"/> </td>
                            <td> 
                                <fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${product.createdAt}"/> 
                            </td>
                            <td> 
                                <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${product.updatedAt}"/> 
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </article>
        </main>
    </body>
</html>
