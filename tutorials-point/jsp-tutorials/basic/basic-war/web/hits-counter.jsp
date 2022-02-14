<%-- 
    Document   : hits-counter
    Created on : 20/07/2020, 21:09:31
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hits Counter</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Hits Counter </h1>
                </header>
            </article>

            <%
                Integer hitsCounter = (Integer) application.getAttribute ("hitsCounter");
                if (hitsCounter == null || hitsCounter == 0) {
                    out.println ("You're new huh? Be welcomed!");
                    hitsCounter = 1;
                }
                else {
                    out.println ("Welcome back, Jojo!");
                    hitsCounter++;
                }
                
                application.setAttribute ("hitsCounter", hitsCounter);
            %>
            
            <p> Total number of visits: <%= hitsCounter %></p>
        </main>
        
    </body>
</html>
