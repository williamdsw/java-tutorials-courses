<%-- 
    Document   : session-servlet.jsp
    Created on : Jul 19, 2020, 1:16:59 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Servlet Test!</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Session Servlet Test! </h1>
                </header>

                <hr>

                <header>
                    <h3> Info about User's Session: </h3>
                </header>
                <div> ${sessionInfo} </div>
            </article>
        </main>
    </body>
</html>
