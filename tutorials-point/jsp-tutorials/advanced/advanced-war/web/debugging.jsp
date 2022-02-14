<%-- 
    Document   : debugging
    Created on : 21/07/2020, 19:42:45
    Author     : William
--%>

<%@page import="java.util.logging.Logger"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Debugging</title>
    </head>
    <body>
        <% Logger logger = Logger.getLogger (this.getClass ().getName ()); %>
        
        <main>
            <article>
                <header>
                    <h1> Debugging </h1>
                </header>

                <c:forEach var="counter" begin="1" end="10" step="1">
                    <%
                        Integer counter = (Integer) pageContext.findAttribute ("counter");
                        String output = "Counter: " + counter;
                        logger.info (output);
                    %>
                    
                    <p> ${counter} </p>
                </c:forEach>
            </article>
        </main>
    </body>
</html>
