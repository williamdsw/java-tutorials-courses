<%-- 
    Document   : http-status-code.jsp
    Created on : Jul 18, 2020, 4:30:35 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Http Status Code</title>
    </head>
    <body>
        <%
            response.sendError (422, "Not found but some custom message here!");
        %>
    </body>
</html>
