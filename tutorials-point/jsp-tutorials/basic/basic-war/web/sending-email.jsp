<%-- 
    Document   : sending-email
    Created on : 20/07/2020, 21:18:45
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Sending Email</title>
    </head>
    <body>
        <main>
            <article>
                <div class="sending-email-form-container">
                    <header>
                        <h2 class="sending-email-header"> Sending Email: </h2>
                    </header>
                    
                    <form action="SendingEmailServlet" method="POST" enctype="multipart/form-data">
                        <div class="form-field">
                            <label> * To: </label>
                            <input type="email" name="to" value="" placeholder="to@email.com" required="required"/>
                        </div>
                        <div class="form-field">
                            <label> * From: </label>
                            <input type="email" name="from" value="" placeholder="from@email.com" required="required"/>
                        </div>
                        <div class="form-field">
                            <label> * Subject: </label>
                            <input type="text" name="subject" value="" placeholder="Subject..." required="required" />
                        </div>
                        <div class="form-field">
                            <label> * Text: </label>
                            <textarea name="text" rows="10" cols="50" required="required"></textarea>
                        </div>
                        <div class="form-field">
                            <label> Attachments: </label>
                            <input type="file" name="files" multiple="true"/>
                        </div>
                        
                        <div class="form-field">
                            <button type="reset"> Reset </button>
                            <button type="submit"> Submit </button>
                        </div>
                    </form>
                </div>
            </article>
        
            <hr>

            <section>
                <div class="sending-email-form-container">
                    <header>
                        <h2 class="sending-email-header"> ${result} </h2>
                    </header>
                </div>
            </section>
        </main>
    </body>
</html>
