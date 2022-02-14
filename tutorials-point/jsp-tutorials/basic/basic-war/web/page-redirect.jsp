<%-- 
    Document   : page-redirect
    Created on : 20/07/2020, 20:51:57
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Redirect</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Page Redirect </h1>
                </header>

                <form action="PageRedirectServlet" method="POST">
                    <button type="submit"> Redirect to my Github </button>
                </form>
            </article>
        </main>
    </body>
</html>
