<%-- 
    Document   : jstl-format-demo
    Created on : 21/07/2020, 11:07:17
    Author     : William
--%>

<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Standard Tag Library</title>
    </head>
    <body>
        <main>
            <header>
                <h1> JSTL Format Tags: </h1>
            </header>

            <hr/>

            <section>
                <header>
                    <h4> Number: </h4>
                </header>

                <c:set var="salary" value="1500.99"/>
        
                <p> Salary: ${salary} </p>
                
                <table class="table-format">
                    <thead>
                        <td> Currency </td>
                        <td> Number: Max Integer Digits </td>
                        <td> Number: Max Fraction Digits </td>
                        <td> Number: Grouping Used </td>
                        <td> Percent: Max Integer Digits </td>
                        <td> Percent: Max Fraction Digits </td>
                        <td> Number: Pattern </td>
                    </thead>
                    <tbody>
                        <tr>
                            <td> <fmt:formatNumber type="currency" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="number" maxIntegerDigits="3" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="number" maxFractionDigits="3" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="number" groupingUsed="false" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="percent" maxIntegerDigits="3" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="percent" maxFractionDigits="10" value="${salary}"/> </td>
                            <td> <fmt:formatNumber type="number" pattern="###.###E0" value="${salary}"/> </td>
                        </tr>
                    </tbody>
                </table>
                        
                <p> 
                    Currency in US:
                    <fmt:setLocale value="en_US"/>
                    <fmt:formatNumber type="currency" value="${salary}"/>
                </p>
            </section>

            <hr>

            <section>
                <header>
                    <h4> Date: </h4>
                </header>

                <c:set var="now" value="<%= new Date () %>"/>
                <p> Today: ${now} </p>
                
                <table class="table-format">
                    <thead>
                        <td> Time </td>
                        <td> Date </td>
                        <td> Both </td>
                        <td> Both Short </td>
                        <td> Both Medium </td>
                        <td> Both Long </td>
                        <td> Pattern </td>
                    </thead>
                    <tbody>
                        <tr>
                            <td> <fmt:formatDate type="time" value="${now}"/> </td>
                            <td> <fmt:formatDate type="date" value="${now}"/> </td>
                            <td> <fmt:formatDate type="both" value="${now}"/> </td>
                            <td> <fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now}"/> </td>
                            <td> <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${now}"/> </td>
                            <td> <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${now}"/> </td>
                            <td> <fmt:formatDate pattern="yyyy-MM-dd" value="${now}"/> </td>
                        </tr>
                    </tbody>
                </table>
            </section>

            <hr/>

            <section>
                <header>
                    <h4> Timezone: </h4>
                </header>

                <c:forEach var="zone" items="<%= TimeZone.getAvailableIDs () %>">
                    <div class="time-zone-info">
                        <p> Zone: ${zone} </p>
                        <p> 
                            Timezone: 
                            <fmt:timeZone value="${zone}">
                                <fmt:formatDate type="both" timeZone="${zn}" value="${now}"/>
                            </fmt:timeZone>
                        </p>
                    </div>
                </c:forEach>
            </section>
        </main>
    </body>
</html>