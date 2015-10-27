package cl.persistencia;

import cl.dominio.Participante;
import cl.dominio.Raza;
import cl.dto.ParticipanteRazaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author profe Hernán
 * @version 13-10-2015
 */
public class ConsultaDAO {

    private Connection cnx;

    public ConsultaDAO(Connection cnx) {
        this.cnx = cnx;
    }

    public List<ParticipanteRazaDTO> buscarParticipanteRaza() {

        List<ParticipanteRazaDTO> lista = new ArrayList<>();

        String sql = "select * "
                + "from participante p "
                + "join raza r using(id_raza) "
                + "order by p.nombre_participante";

        try (PreparedStatement stmt = cnx.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Participante p = new Participante();
                p.setId(rs.getLong("id_participante"));
                p.setNombre(rs.getString("nombre_participante"));
                p.setIdRegistro(rs.getInt("id_registro"));
                p.setFechaRegistro(rs.getTimestamp("fecha_registro"));
                p.setIdRaza(rs.getLong("id_raza"));

                Raza g = new Raza();
                g.setId(rs.getLong("id_raza"));
                g.setNombre(rs.getString("nombre_raza"));

                lista.add(new ParticipanteRazaDTO(p, g));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar (todos) los participantes", e);
        }

        return lista;
    }

    public List<ParticipanteRazaDTO> buscarParticipanteRaza(long idRaza) {

        List<ParticipanteRazaDTO> lista = new ArrayList<>();

        String sql = "select * "
                + "from participante p "
                + "join raza r using(id_raza) "
                + "where p.id_raza = ?"
                + "order by p.nombre_participante";

        try (PreparedStatement stmt = cnx.prepareStatement(sql)) {
            stmt.setLong(1, idRaza);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Participante p = new Participante();
                    p.setId(rs.getLong("id_participante"));
                    p.setNombre(rs.getString("nombre_participante"));
                    p.setIdRegistro(rs.getInt("id_registro"));
                    p.setFechaRegistro(rs.getTimestamp("fecha_registro"));
                    p.setIdRaza(rs.getLong("id_raza"));

                    Raza g = new Raza();
                    g.setId(rs.getLong("id_raza"));
                    g.setNombre(rs.getString("nombre_raza"));

                    lista.add(new ParticipanteRazaDTO(p, g));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar los participantes por idRaza", e);
        }

        return lista;
    }
}
