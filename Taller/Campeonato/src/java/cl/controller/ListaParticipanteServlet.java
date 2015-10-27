
package cl.controller;

import cl.servicio.CampeonatoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
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
@WebServlet(name = "ListaParticipanteServlet", urlPatterns = {"/ListaParticipanteServlet"})
public class ListaParticipanteServlet extends HttpServlet {

  @Resource(mappedName = "jdbc/curso")
  private DataSource ds;
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (Connection cnx = ds.getConnection()){
            
            CampeonatoService service = new CampeonatoService(cnx);
            String strIdRaza = request.getParameter("idRaza");
            
            if (strIdRaza == null || strIdRaza.isEmpty()) {
                
                request.setAttribute("lstParticipantes", service.buscarParticipanteRaza());
            } else {
                request.setAttribute("lstParticipantes", service.buscarParticipanteRaza(Long.parseLong(strIdRaza)));
            }
            
            request.setAttribute("lstRazas",service.buscarTodasLasRazas());
            request.getRequestDispatcher("/participante_listar.jsp").forward(request, response);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (Connection cnx = ds.getConnection()){
            
            CampeonatoService service = new CampeonatoService(cnx);
            
            long idParticipante = Long.parseLong(request.getParameter("idParticipante"));
            
            service.eliminarParticipante(idParticipante);
            request.setAttribute("mensaje", "se ha eliminado el participante");
            
            // se repite codigo doGet
            String strIdRaza = request.getParameter("idRaza");
            
            
            if (strIdRaza == null || strIdRaza.isEmpty()) {
                
                request.setAttribute("lstParticipantes", service.buscarParticipanteRaza());
            } else {
                request.setAttribute("lstParticipantes", service.buscarParticipanteRaza(Long.parseLong(strIdRaza)));
            }
            
            request.setAttribute("lstRaza",service.buscarTodasLasRazas());
            request.getRequestDispatcher("/participante_listar.jsp").forward(request, response);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
    }


}
