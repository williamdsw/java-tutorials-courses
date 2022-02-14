<%-- 
    Document   : server-response
    Created on : Jul 18, 2020, 4:17:36 PM
    Author     : william
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Server Response</title>
    </head>
    <body>
        <%
            response.setIntHeader("Refresh", 10);
            
            String fullTime = "%1s:%2s:%3s.%4s %5s";
            
            Calendar calendar = new GregorianCalendar();
            int millisecond = calendar.get(Calendar.MILLISECOND);
            int second = calendar.get(Calendar.SECOND);
            int minute = calendar.get(Calendar.MINUTE);
            int hour = calendar.get(Calendar.HOUR);
            
            String clockSystem = (calendar.get(Calendar.AM) == 0 ? "AM" : "PM");
            fullTime = String.format(fullTime, hour, minute, second, millisecond, clockSystem);
            out.println(fullTime);
        %>
        
        <main>
            <article>
                <header>
                    <h1> Server Response </h1>
                </header>
        
                <p> Refreshing in 10 seconds... </p>
            </article>
        </main>
    </body>
</html>
