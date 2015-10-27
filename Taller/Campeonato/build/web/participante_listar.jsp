<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Participante</title>
        <style>
            table {
                border-collapse: collapse;
            }
            table,th,td {
                border: 1px solid black;
            }
            th,td{
                padding: 5px;
            }
        </style>
        
    </head>
    <body>
        <%@include file="opciones.jsp" %>
        <h2>Listar Participantes</h2>
        <form action="<c:url value="/ListaParticipanteServlet"/>" method="get">
            Seleccione una Raza:
            <select name="idRaza">
                <option value="">(Todas)</option>
                <c:forEach var="r" items="${lstRazas}">
                    <option value="${r.id}" ${r.id == param.idRaza ? 'Selected' : ''}>
                        <
                        <c:out value="${r.nombre}"/> 
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Buscar"/>
        </form>
            <br/>
            <c:out value="${mensaje}"/>
            <br/>
            <table>
                <tr>
                    <th>Nombre</th>
                    <th>Raza</th>
                    <th>Id Reg.</th>
                    <th>Fecha Registro</th>
                    <th>Acción</th>
                </tr>
                <c:forEach var="p" items="${lstParticipantes}">
                    <tr>
                        <td><c:out value="${p.participante.nombre}"/></td>
                        <td><c:out value="${p.raza.nombre}"/></td>
                        <td><c:out value="${p.participante.idRegistro}"/></td>
                        <td><fmt:formatDate value="${p.participante.fechaRegistro}" pattern="dd/MM/yyyy HH:mm" /></td>
                        <td>
                            <c:url var="urlEliminar" value="/ListaParticipanteServlet">
                                <c:param name="idRaza" value="${param.idRaza}"/>
                            </c:url>
                            <form action="${urlEliminar}" method="post">
                                <input type="hidden" name="idParticipante" value="${p.participante.id}"/>
                                <input type="submit" value="Eliminar"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            
        
    </body>
</html>
