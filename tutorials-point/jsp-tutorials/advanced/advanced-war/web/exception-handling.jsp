<%-- 
    Document   : exception-handling
    Created on : 21/07/2020, 19:30:54
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="show-error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exception Handling</title>
    </head>
    <body>
        <%
            int x = 1;
            if (x == 1) {
                throw new RuntimeException ("Some forced error!!!");
            }
        %>
    </body>
</html>
