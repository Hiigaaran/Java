package cl.persistencia;

import cl.dominio.Raza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * author profe Hernán
 *
 * @version 13-10-2015
 */
public class RazaDAO {

    private Connection cnx;

    public RazaDAO(Connection cnx) {
        this.cnx = cnx;
    }

    public void agregar(Raza raza) {

        String sql = "insert into raza (nombre_raza)  values (?)";

        try (PreparedStatement stmt = cnx.prepareStatement(sql)) {

            stmt.setString(1, raza.getNombre());
            int filasAfectadas = stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al Agregar raza ", e);

        }
    }

    public void actualizar(Raza raza) {

        String sql = "update raza set nombre_raza = ? where id_raza=?";

        try (PreparedStatement stmt = cnx.prepareStatement(sql)) {

            stmt.setString(1, raza.getNombre());
            stmt.setLong(2, raza.getId());
            int filasAfectadas = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al Actualizar raza ", e);
        }

    }

    public void eliminar(Raza raza) {

        String sql = "delete from raza where id_raza =?";

        try (PreparedStatement stmt = cnx.prepareStatement(sql)) {
            stmt.setLong(1, raza.getId());
            int filasAfectadas = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al Eliminar raza ", e);
        }

    }
    
    public Raza buscar(long id){
        
        Raza raza = null;
        String sql = "select * from raza where id_raza=?";
        try (PreparedStatement stmt = cnx.prepareStatement(sql)){
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()) {
                    raza = new Raza();
                    raza.setId(rs.getLong("id_raza"));
                    raza.setNombre(rs.getString("nombre_raza"));
                }
            }
        } catch (SQLException e) {
             throw new RuntimeException("Error al buscar raza ", e);
        }
        return raza;
    }
    
    public List<Raza> buscarTodos(){
        
        List<Raza> lista = new ArrayList<>();
        String sql = "select * from raza order by nombre_raza";
        try (PreparedStatement stmt = cnx.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Raza raza = new Raza();
                raza.setId(rs.getLong("id_raza"));
                raza.setNombre(rs.getString("nombre_raza"));
                lista.add(raza);
            }
            
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar todas las razas ", e);
        }
        return lista;
    }

}
