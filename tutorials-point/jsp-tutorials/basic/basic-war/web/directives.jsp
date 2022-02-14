<%-- 
    Document   : directives
    Created on : Jul 18, 2020, 3:18:16 PM
    Author     : william
--%>

<!-- page = defines properties -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<jsp:directive.page language="java"></jsp:directive.page>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Directives</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Using JSP and XML sintax... </h1>
                </header>
        
                <!-- include = includes another file -->
                <%@include file="outsider.jsp" %>
                <jsp:include page="outsider.jsp"></jsp:include>
            </article>
        </main>
    </body>
</html>
