<%-- 
    Document   : cookies-handling
    Created on : Jul 19, 2020, 11:53:09 AM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="css/global.css"/>
        
        <title>Cookies Handling</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1 class="cookies-header">
                        Existing Cookies :
                    </h1>
                </header>

                <%
                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            System.out.println("for... cookie name: " + cookie.getName());
                            
                            String name = cookie.getName();
                            String value = cookie.getValue();
                            int maxAge = cookie.getMaxAge();
                            String comment = cookie.getComment();
                            String domain = cookie.getDomain();
                            boolean httpOnly = cookie.isHttpOnly();
                            boolean isSecure = cookie.getSecure();
                            int version = cookie.getVersion();
                            
                            out.println("<div class=\"single-cookie\">");
                            out.println("<p> Name: " + name + "</p>");
                            out.println("<p> Value: " + value + "</p>");
                            out.println("<p> Max Age: " + maxAge + "</p>");
                            out.println("<p> Comment: " + comment + "</p>");
                            out.println("<p> Domain: " + domain + "</p>");
                            out.println("<p> Http Only ? " + httpOnly + "</p>");
                            out.println("<p> Is Secure ? " + isSecure + "</p>");
                            out.println("<p> Version: " + version + "</p>");
                            out.println("</div>");
                        }
                    }
                    else {
                        out.println("<p> There is no cookies! </p>");
                    }
                %>
            </article>
        
            <hr/>

            <section>
                <header>
                    <h2 class="cookies-header"> 
                        Creating a new Cookie: 
                    </h2>
                </header>
                <div class="cookies-form-container">
                    <form action="CookiesHandlingServlet" method="POST">
                        <div class="form-field">
                            <label> * Name: </label>
                            <input type="text" name="name" value="" placeholder="myCookie" required="required"/>
                        </div>
                        <div class="form-field">
                            <label> * Value: </label>
                            <input type="text" name="value" value="" placeholder="myValue" required="required"/>
                        </div>
                        <div class="form-field">
                            <label> * Max Age (In Seconds): </label>
                            <input type="number" name="maxAge" value="" placeholder="60" required="required" />
                        </div>
                        <div class="form-field">
                            <label> Domain: </label>
                            <input type="text" name="domain" value="" placeholder="http://localhost" />
                        </div>
                        <div class="form-field">
                            <label> Path: </label>
                            <input type="text" name="path" value="" placeholder="http://localhost" />
                        </div>
                        <div class="form-field">
                            <label> Version: </label>
                            <input type="number" name="version" value="" placeholder="1" />
                        </div>
                        <div class="form-field">
                            <input type="checkbox" name="httpOnly" checked="false"/> Http Only?
                            <input type="checkbox" name="isSecure" checked="false"/> Is Secure (SSL Connections)?
                        </div>
                        <div class="form-field">
                            <label> Comments: </label>
                            <textarea name="comments" rows="10" cols="50"></textarea>
                        </div>
                        
                        <div class="form-field">
                            <button type="reset"> Reset </button>
                            <button type="submit"> Submit </button>
                        </div>
                    </form>
                </div>
            </section>
    </body>
</html>
