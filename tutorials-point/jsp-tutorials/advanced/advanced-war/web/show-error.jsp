<%-- 
    Document   : show-error
    Created on : 21/07/2020, 19:33:24
    Author     : William
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Show Error</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Ops...! </h1>            
                </header>

                <table class="table-error">
                    <thead></thead>
                    <tbody>
                        <tr>
                            <td> Error: </td>
                            <td> ${pageContext.exception} </td>
                        </tr>
                        <tr>
                            <td> URI: </td>
                            <td> ${pageContext.errorData.requestURI} </td>
                        </tr>
                        <tr>
                            <td> Status Code: </td>
                            <td> ${pageContext.errorData.statusCode} </td>
                        </tr>
                        <tr>
                            <td> Stack Trace: </td>
                            <td>
                                <c:forEach var="trace" items="${pageContext.exception.stackTrace}">
                                    <pre> ${trace} </pre>
                                </c:forEach>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </article>
        </main>
    </body>
</html>
