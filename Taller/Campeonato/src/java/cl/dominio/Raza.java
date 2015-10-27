package cl.dominio;

import java.io.Serializable;

/**
 *
 * @author profe Hernán
 * @version 9-10-2015
 */
public class Raza implements Serializable{
    
    private long id;
    private String nombre;

    public Raza() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Raza other = (Raza) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Raza{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
}
