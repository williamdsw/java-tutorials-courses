<!-- 
    Document   : client-request
    Created on : Jul 18, 2020, 3:48:38 PM
    Author     : william
-->

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Client Request</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1>
                        Client Request Data
                    </h1>
                </header>

                <table class="client-request">
                    <thead>
                        <th> Header's Name </th>
                        <th> Header's Value (s) </th>
                    </thead>
                    
                    <tbody>
                        <%
                            Enumeration headers = request.getHeaderNames();
                            while (headers.hasMoreElements()) {
                                String header = (String) headers.nextElement();
                                String value = request.getHeader(header);
                                
                                String tableRow = "<tr><td>%1s</td><td>%2s</td></tr>";
                                tableRow = String.format(tableRow, header, value);
                                
                                out.println(tableRow);
                            }
                        %>
                    </tbody>
                </table>
            </article>
        </main>
    </body>
</html>
