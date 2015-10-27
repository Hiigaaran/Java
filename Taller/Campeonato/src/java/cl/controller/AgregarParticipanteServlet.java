package cl.controller;

import cl.dominio.Participante;
import cl.servicio.CampeonatoService;
import cl.servicio.ServicioException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author USRVI-LC4
 */
@WebServlet(name = "AgregarParticipanteController", urlPatterns = {"/AgregarParticipanteController"})
public class AgregarParticipanteServlet extends HttpServlet {

    @Resource(mappedName = "jdbc/curso")
    private DataSource ds;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (Connection cnx = ds.getConnection()) {

            CampeonatoService service = new CampeonatoService(cnx);
            Participante participante = new Participante();

            request.setAttribute("participante", participante);
            request.setAttribute("lstRaza", service.buscarTodasLasRazas());

            request.getRequestDispatcher("/participante_agregar.jsp").forward(request, response);

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        try (Connection cnx = ds.getConnection()) {

            CampeonatoService service = new CampeonatoService(cnx);
            Participante participante = new Participante();

            Map<String, String> mapMensajes = new HashMap<>();
            String mensaje;

            //convertir y validar
            participante.setNombre(request.getParameter("nombre"));
            if (participante.getNombre().isEmpty()) {

                mapMensajes.put("nombre", " favor, ingrese un Nombre de participante");
            }

            String strIdRaza = request.getParameter("idRaza");
            if (strIdRaza.isEmpty()) {
                mapMensajes.put("IdRaza", "favor, seleccione una raza");
            } else {
                participante.setIdRaza(Long.parseLong(strIdRaza));
            }

            try {
                int idRegistro = Integer.parseInt(request.getParameter("idRegistro"));
                if (idRegistro <= 0) {
                    mapMensajes.put("idRegistro", "Favor , ingrese id reg positivo");
                } else {
                    participante.setIdRegistro(idRegistro);
                }

            } catch (NumberFormatException e) {

                mapMensajes.put("idRegistro", "Id Registro no es valido: " + request.getParameter("idRegistro"));
            }

            //delegar la logica de negocio
            if (mapMensajes.isEmpty()) {

                try {
                    service.agregarParticipante(participante);
                    mensaje = "participante agregado exitosamente";
                } catch (ServicioException e) {
                    mensaje = e.getMessage();
                }

            } else {

                mensaje = "favor , revise el formulario";
            }

            request.setAttribute("mapMensajes", mapMensajes);
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("participante", participante);
            request.setAttribute("lstRaza", service.buscarTodasLasRazas());
            request.getRequestDispatcher("/participante_agregar.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
