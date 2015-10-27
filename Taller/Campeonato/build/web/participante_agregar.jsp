<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar participante</title>
    </head>
    <body>
        <%@include file="opciones.jsp" %>
        <h2>Agregar Participante</h2>
        <form action="<c:url value="/AgregarParticipanteController"/>" method="post">
            Nombre: 
            <input type="text" name="nombre" value="<c:out value="${participante.nombre}"/>" autofocus="true"/>
            <c:out value="${mapMensajes['nombre']}"/>
            <br/>
            Raza:
            <select name="idRaza">
                <option value="">(Seleccione)</option>
                <c:forEach var="r" items="${lstRaza}">
                    <option value="${r.id}" ${r.id == participante.idRaza ? 'Selected' : ''}>
                        <c:out value="${r.nombre}"/>
                    </option>
                </c:forEach>

            </select>
            <c:out value="${mapMensajes['IdRaza']}"/>
            <br/>

            Id Registro:
            <input type="text" name="idRegistro" value="<c:out value="${participante.idRegistro}"/>"/>
            <c:out value="${mapMensajes['idRegistro']}"/>
            <br/>
            <br/>

            <input type="submit" value="Registrar"/>
            <br/>
            <c:out value="${mensaje}"/>
        </form>
    </body>
</html>
