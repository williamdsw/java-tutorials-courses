<%-- 
    Document   : internationalization
    Created on : 21/07/2020, 19:52:06
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/global.css"/>
        <title>Internationalization</title>
    </head>
    <body>
        <main>
            <article>
                <header>
                    <h1> Internationalization data: </h1>            
                </header>

                <p> Language: ${language} </p>
                <p> Display Language: ${displayLanguage} </p>
                <p> Country: ${country} </p>
                <p> Display Country: ${displayCountry} </p>
                <p> ISO3 Country: ${ISO3Country} </p>
                <p> ISO3 Language: ${ISO3Language} </p>
                <p> Local Date: ${localDate} </p>
                <p> Price: ${formattedPrice} </p>
                <p> Percent: ${formattedPercent} </p>
            </article>
        </main>
    </body>
</html>
