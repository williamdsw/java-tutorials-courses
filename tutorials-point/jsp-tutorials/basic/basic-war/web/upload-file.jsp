<%-- 
    Document   : upload-file
    Created on : Jul 19, 2020, 1:30:50 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Upload File</title>
    </head>
    <body>
        <!-- form needs to be a 'POST' with 'multipart/form-data' -->

        <main>
            <article>
                <header>
                    <h1> Upload a new File... </h1>
                </header>

                <div>
                    <form action="UploadFileServlet" method="POST" enctype="multipart/form-data">
                        <div class="upload-file-field">
                            <input type="file" name="file" multiple="true" required="required"/>
                        </div>
                        <div class="upload-file-field">
                            <button type="submit"> Upload </button>
                        </div>
                    </form>
                </div>
            </article>

            <hr>

            <section>
                <header>
                    <h2> Uploaded Files Info: </h2>
                </header>

                ${uploadedFiles}
            </section>
        </main>
    </body>
</html>
