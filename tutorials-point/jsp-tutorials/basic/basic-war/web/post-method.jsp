<%-- 
    Document   : post-method
    Created on : Jul 18, 2020, 4:43:27 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post Method</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Post Method </h1>
                </header>

                <form action="post-method.jsp" method="POST" target="_blank">
                    
                    <!-- first name -->
                    <div>
                        <label> First Name: </label>
                        <input type="text" name="firstName" value="" />
                    </div>
                    
                    <!-- last name -->
                    <div>
                        <label> Last Name: </label>
                        <input type="text" name="lastName" value="" />
                    </div>
                    
                    <!-- consoles -->
                    <div>
                        <input type="checkbox" name="pc" checked="checked" /> PC
                        <input type="checkbox" name="playstation" /> PlayStation 5
                        <input type="checkbox" name="xbox" /> Xbox Series
                    </div>
                    
                    <!-- genre -->
                    <div>
                        <input type="radio" name="genre" value="male"> Male
                        <input type="radio" name="genre" value="female"> Female
                    </div>
                    
                    <div>
                        <button type="submit"> Submit </button>
                    </div>
                </form>
            </article>
        
            <hr/>

            <section>
                <header>
                    <h2> Output </h2>
                </header>

                <%
                    String firstName = request.getParameter("firstName");
                    String lastName = request.getParameter("lastName");
                    String pc = request.getParameter("pc");
                    String playstation = request.getParameter("playstation");
                    String xbox = request.getParameter("xbox");
                    String genre = request.getParameter("genre");
                %>
                
                <h3> Reading query params from POST url... </h3>
                
                <p> First Name: <%= firstName %> </p>
                <p> Last Name: <%= lastName %> </p>
                <p> PC: <%= pc %> </p>
                <p> PlayStation 5: <%= playstation %> </p>
                <p> Xbox: <%= xbox %> </p>
                <p> Genre: <%= genre %> </p>
            </section>
        </main>
    </body>
</html>
