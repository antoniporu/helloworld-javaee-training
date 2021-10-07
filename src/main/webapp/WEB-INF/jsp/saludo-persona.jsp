<%-- 
    Document   : saludo-persona
    Created on : 07-oct-2021, 9:04:40
    Author     : antoni.pont
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BonÀrea</title>
        <!-- Insertamos el archivo CSS compilado y comprimido -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Theme opcional -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    </head>
    <body>
        <div class="container">
            <header class="page-header">
                <ul class="nav nav-pills pull-right">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Sobre mi</a></li>
                    <li><a href="#">Experiencia</a></li>
                </ul>
                <img src="logo-caixa-guissona-agrupa.png" alt="BonÀrea" />
            </header>
            <div class="jumbotron">
                <h1>BonÀrea</h1>
                <h2>Nou Contacte</h2>
                <ul>
                    <li><p><b>ID: </b> ${id}
                        </p></li>
                    <li><p><b>Nom: </b> ${nombre}
                        </p></li>
                    <li><p><b>Cognoms:</b> ${apellidos}
                        </p></li>  
                    <li><p><b>DNI:</b>  ${dni}
                        </p></li>
                </ul>
                <div>
                    <p>&copy; 2021 BonÀrea</p>
                </div>
            </div>
            <!--Insertamos jQuery dependencia de Bootstrap-->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
            <!--Insertamos el archivo JS compilado y comprimido -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>