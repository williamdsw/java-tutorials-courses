<%-- 
    Document   : jstl-core-demo
    Created on : 21/07/2020, 11:07:17
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Standard Tag Library</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> JSTL Core Tags: </h1>
                </header>

                <c:set var="phrase" scope="session" value="!Que carajo!"/>
                <c:out value="${phrase}"/>
                <c:remove var="phrase"/>
                <c:out value="${phrase}"/>
                
                <c:catch var="myException">
                    <% int x = 5 / 0; %>
                </c:catch>
                
                <c:if test="${myException != null}">
                    <p> Current Exception: ${myException} </p>
                    <p> Current Exception Message: ${myException.message} </p>
                </c:if>
                    
                <c:set var="salary" scope="session" value="1964"/>
                <p> Current salary: <c:out value="${salary}"/> </p>
                <c:choose>
                    <c:when test="${salary <= 0}">
                        Do you work for free???
                    </c:when>
                    <c:when test="${salary > 1000}">
                        That's ok... you can pay the bills
                    </c:when>
                    <c:otherwise>
                        Well...
                    </c:otherwise>
                </c:choose>
                        
                <c:import var="github" url="https://github.com/williamdsw"/>
                <%-- <pre>${github}</pre> --%>
                
                <br/><br/>
                
                <c:forEach var="index" begin="1" end="10">
                    Item: ${index}
                </c:forEach>
                    
                <br/><br/>
                
                <c:forTokens items="Megadeth, Metallica, Slayer, Anthrax" delims="," var="band">
                    ${band} 
                </c:forTokens>
                
                <c:url value="standard-tag-library.jsp" var="myUrl">
                    <c:param name="id" value="71623"/>
                    <c:param name="user" value="Daryl"/>
                </c:url>
                
                <p> Url: ${myUrl} </p>
                
                <%-- <c:redirect url="https://github.com/williamdsw"/> --%>
            </article>
        </main>
    </body>
</html>
