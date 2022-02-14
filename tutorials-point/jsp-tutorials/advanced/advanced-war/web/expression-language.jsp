<%-- 
    Document   : expression-language
    Created on : 21/07/2020, 16:56:17
    Author     : William
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Expression Language</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Expression Language </h1>            
                </header>

                <c:set var="username" value="Batman"/>
        
                <p> Username: ${username} </p>
                <p> User Agent: ${header["user-agent"]} </p>
                <p> Query String: ${pageContext.request.queryString} </p>
            </article>
        </main>
    </body>
</html>
