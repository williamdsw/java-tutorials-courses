<%-- 
    Document   : jstl-sql-demo
    Created on : 21/07/2020, 13:09:15
    Author     : William
--%>

<%@page import="java.sql.Timestamp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>JSTL SQL Tags</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> SQL Tags </h1>
                </header>

                <!-- sets a sql datasource -->
                <c:set var="driver" value="com.mysql.cj.jdbc.Driver"/>
                <c:set var="url" value="jdbc:mysql://localhost/jsp_test?useTimezone=true&serverTimezone=UTC"/>
                <c:set var="user" value="root"/>
                <c:set var="password" value=""/>
                
                <sql:setDataSource var="snapshot" driver="${driver}" url="${url}" user="${user}" password="${password}"/>
                
                <!-- executes an INSERT, UPDATE, or DELETE -->
                <sql:update var="myInsert" dataSource="${snapshot}">
                    INSERT INTO band  (name, genres, year)
                    VALUES ('Metallica', 'Thrash Metal, Heavy Metal, Hard Rock', 1981);
                </sql:update>
                    
                <!-- using update with param -->
                <c:set var="bandId" value="3"/>
                <sql:update var="myDelete" dataSource="${snapshot}">
                    DELETE FROM band WHERE id = ?
                    <sql:param value="${bandId}"/>
                </sql:update>
                    
                <!-- using update with date param -->
                <c:set var="lastUpdated" value="<%= Timestamp.valueOf ("2020-07-10 13:00:00") %>"/>
                <c:set var="otherBandId" value="1"/>
                <sql:update var="myUpdate" dataSource="${snapshot}">
                    UPDATE band SET last_updated = ? WHERE id = ?
                    <sql:dateParam type="timestamp" value="${lastUpdated}"/>
                    <sql:param value="${otherBandId}"/>
                </sql:update>
                    
                <!-- transaction with multiples updates -->
                <sql:transaction dataSource="${snapshot}">
                    <sql:update var="myTransaction">
                        INSERT INTO band  (name, genres, year)
                        VALUES ('Motorhead', 'Heavy Metal', 1975);
                    </sql:update>
                        
                    <sql:update var="myTransaction">
                        UPDATE band SET genres = 'Metal' WHERE id = 2;
                    </sql:update>
                        
                    <sql:update var="myTransaction">
                        DELETE FROM band WHERE name like '%Metallica%';
                    </sql:update>
                </sql:transaction>
                    
                <!-- query example -->
                <sql:query var="result" dataSource="${snapshot}">
                    SELECT * FROM band;
                </sql:query>
                    
                <p> Insert result: ${myInsert} </p>
                <p> Delete result: ${myDelete} </p>
                <p> Update result: ${myUpdate} </p>
                <p> Transaction result: ${myTransaction} </p>
                    
                <table class="table-sql">
                    <thead>
                        <th> Id </th>
                        <th> Name </th>
                        <th> Genres </th>
                        <th> Year </th>
                        <th> Last Updated </th>
                    </thead>
                    <tbody>
                        
                    <!-- fetching sql data -->
                    <c:forEach var="row" items="${result.rows}">
                        <tr>
                            <td> ${row.id} </td>
                            <td> ${row.name} </td>
                            <td> ${row.genres} </td>
                            <td> ${row.year} </td>
                            <td> ${row.last_updated} </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </article>
        </main>
    </body>
</html>
