<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Campeonato: Servlet / JSP</h1>
<p>
    Opciones:
    <a href="<c:url value="/AgregarParticipanteController" />">Agregar Participante</a>
    |
    <a href="<c:url value="/ListaParticipanteServlet" />">Listarr Participante</a>
</p>

