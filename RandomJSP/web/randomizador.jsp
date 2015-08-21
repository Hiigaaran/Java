<%-- 
    Document   : randomizador
    Created on : 20-ago-2015, 25:07:08
    Author     : simon
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Imagenes Aleatorias</title>
        <link rel="stylesheet" type="text/css" href="css/designIndex.css">
    </head>
    <body>
    <center>
        <div>
            <h2>Su Imagen Aleatoria del F5</h2><br/>
            <%-- El elegido :O --%>
            <% Random aleatorio = new Random(); %>
            <% int numero = aleatorio.nextInt((10 - 1) + 1) + 1; %>
            <center>
                <img src="<%=request.getContextPath()%>/media/img/<%= numero %>.jpg" alt="Te estas perdiendo algo bueno :D">
            </center>
        </div>
    </center>
    </body>
</html>
