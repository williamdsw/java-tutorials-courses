<%-- 
    Document   : today-date
    Created on : Jul 18, 2020, 3:29:35 PM
    Author     : william
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Today Date</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Today Date! </h1>
                </header>

                <hr>

                <p><b> Today: </b> <%= new Date ().toString() %></p>
            </article>
        </main>
    </body>
</html>