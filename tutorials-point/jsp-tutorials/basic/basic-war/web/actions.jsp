<!-- 
    Document   : actions
    Created on : Jul 18, 2020, 3:30:59 PM
    Author     : william
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actions</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1>
                        Actions
                    </h1>
                </header>

                <hr>

                <jsp:include page="today-date.jsp" flush="true"></jsp:include>
        
                <!-- useBean = Uses and manipulate a java (model) class -->
                <jsp:useBean id="test" class="com.williamdsw.beans.TestBean"></jsp:useBean>
                <jsp:setProperty name="test" property="message" value="Biotech is Godzila!"></jsp:setProperty>
                
                <p> Message after setProperty: </p>
                <jsp:getProperty name="test" property="message"></jsp:getProperty>
                
                <%-- <jsp:forward page="index.html"></jsp:forward> --%>
            </article>
        </main>
    </body>
</html>
