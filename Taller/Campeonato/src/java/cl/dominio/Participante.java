package cl.dominio;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author profe Hernán
 * @version 9-10-2015
 */
public class Participante implements Serializable{
    
    public long id;
    public String nombre;
    public int idRegistro;
    public Timestamp fechaRegistro;
    public long idRaza;

    public Participante() {
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idRegistro
     */
    public int getIdRegistro() {
        return idRegistro;
    }

    /**
     * @param idRegistro the idRegistro to set
     */
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    /**
     * @return the fechaRegistro
     */
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the idRaza
     */
    public long getIdRaza() {
        return idRaza;
    }

    /**
     * @param idRaza the idRaza to set
     */
    public void setIdRaza(long idRaza) {
        this.idRaza = idRaza;
    }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + ", nombre=" + nombre + ", idRegistro=" + idRegistro + ", fechaRegistro=" + fechaRegistro + ", idRaza=" + idRaza + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + (int) (this.idRaza ^ (this.idRaza >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participante other = (Participante) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idRaza != other.idRaza) {
            return false;
        }
        return true;
    }

  
    
    
}
