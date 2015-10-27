package cl.servicio;

import cl.dominio.Participante;
import cl.dominio.Raza;
import cl.dto.ParticipanteRazaDTO;
import cl.persistencia.ConsultaDAO;
import cl.persistencia.ParticipanteDAO;
import cl.persistencia.RazaDAO;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author profe Hernán
 * @version 13-10-2015
 */
public class CampeonatoService {

    private ParticipanteDAO participanteDAO;
    private RazaDAO razaDAO;
    private ConsultaDAO consultaDAO;

    public CampeonatoService(Connection cnx) {

        participanteDAO = new ParticipanteDAO(cnx);
        razaDAO = new RazaDAO(cnx);
        consultaDAO = new ConsultaDAO(cnx);

    }

    public void agregarParticipante(Participante p) throws ServicioException {

        Participante bd = participanteDAO.buscarPorIdregistro(p.getIdRegistro());
        if (bd != null) {

            throw new ServicioException("Ya existe Participante con el registro: " + p.getIdRegistro());
        }
        p.setFechaRegistro(new Timestamp(System.currentTimeMillis()));
        participanteDAO.agregar(p);

    }

    public void eliminarParticipante(long idParticipante) {
        participanteDAO.eliminar(idParticipante);
    }

    public List<Raza> buscarTodasLasRazas() {
        return razaDAO.buscarTodos();
    }

    public List<ParticipanteRazaDTO> buscarParticipanteRaza() {
        return consultaDAO.buscarParticipanteRaza();
    }

    public List<ParticipanteRazaDTO> buscarParticipanteRaza(long idRaza) {
        return consultaDAO.buscarParticipanteRaza(idRaza);
    }

}
