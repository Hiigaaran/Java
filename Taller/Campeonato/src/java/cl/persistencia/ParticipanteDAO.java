
package cl.persistencia;

import cl.dominio.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author profe Hernán
 * @version 9-10-2015
 */
public class ParticipanteDAO {
    
    private Connection cnx;

    public ParticipanteDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void agregar(Participante p){
        
        String sql="insert into participante"
                + " (nombre_participante,id_registro,fecha_registro,id_raza) "
                + "values(?,?,?,?)";
        try (PreparedStatement stmt = cnx.prepareStatement(sql)){
            stmt.setString(1, p.getNombre());
            stmt.setInt(2, p.getIdRegistro());
            stmt.setTimestamp(3, p.getFechaRegistro());
            stmt.setLong(4, p.getIdRaza());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException("Error al Agregar Participante",e);
        }
        
    }
    
    public void eliminar(long id){
        
        String sql="delete from participante where id_participante=?";
        
        try (PreparedStatement stmt = cnx.prepareStatement(sql)){
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            
            throw new RuntimeException("Error al eliminar Participante ",e);
            
        }
    }
    
    public Participante buscarPorIdregistro(int idRegistro){
        
        String sql="select * from participante where id_registro=?";
        
        Participante p = null;
        try (PreparedStatement stmt = cnx.prepareStatement(sql)){
            
            stmt.setInt(1, idRegistro);
            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()) {
                    p = new Participante();
                    p.setId(rs.getLong("id_participante"));
                    p.setNombre(rs.getString("nombre_participante"));
                    p.setIdRegistro(rs.getInt("id_registro"));
                    p.setFechaRegistro(rs.getTimestamp("fecha_registro"));
                    p.setIdRaza(rs.getLong("id_raza"));
                } 
            }
        } catch (SQLException e) {
             throw new RuntimeException("Error al buscar por registro ",e);
        }
        return p;
    }
    
}
