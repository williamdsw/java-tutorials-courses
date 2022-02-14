<%-- 
    Document   : jstl-functions-demo
    Created on : 21/07/2020, 15:32:31
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>JSTL Functions</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h2> JSTL Functions </h2>
                </header>

                <c:set var="phrase" value="Highway to the <i> DANGER </i> Zone!"/>
                <c:set var="split" value="${fn:split (phrase, ' ')}"/>
                <c:set var="join" value="${fn:join (split, ';')}"/>
                <c:set var="trim" value="${fn:trim (phrase)}"/>
                
                <p><b> Phrase: </b> ${phrase} </p>
                
                <c:if test="${fn:contains (phrase, 'DANGER')}">
                    <p> Contains <b> DANGER </b></p>
                </c:if>
                
                <c:if test="${fn:containsIgnoreCase (phrase, 'Danger')}">
                    <p> Contains <b> Danger </b> ignoring case </p>
                </c:if>
                
                <c:if test="${fn:startsWith (phrase, 'H')}">
                    <p> Starts with <b> H! </b></p>
                </c:if>
                
                <c:if test="${fn:endsWith (phrase, 'Zone!')}">
                    <p> Ends with <b> Zone! </b></p>
                </c:if>
                    
                <p> With escape xml: ${fn:escapeXml (phrase)} </p>
                <p> Index Of 'the': ${fn:indexOf (phrase, "the")} </p>
                <p> Split on phrase: <c:forEach var="word" items="${split}"> ${word} </c:forEach> </p>
                <p> Join on split: ${join} </p>
                <p> Length of phrase: ${fn:length (phrase)} </p>
                <p> Replace 'Highway' with 'Subway': ${fn:replace (phrase, 'Highway', 'Subway')} </p>
                <p> Substring (5, 15): ${fn:substring (phrase, 5, 15)} </p>
                <p> Substring after 'the': ${fn:substringAfter (phrase, 'the')} </p>
                <p> Substring before 'the': ${fn:substringBefore (phrase, 'the')} </p>
                <p> Lower case: ${fn:toLowerCase (phrase)} </p>
                <p> Upper case: ${fn:toUpperCase (phrase)} </p>
                <p> Trim: ${trim} </p>
            </article>
        </main>
    </body>
</html>
