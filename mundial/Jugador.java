
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    private String rut, nombre, equipoactual;
    private int edad;
    private boolean disponibilidad;
    
    //Métodos constructores.
    public Jugador(){
        rut = "";
        nombre = "";
        equipoactual = "";
        edad = 0;
        disponibilidad = false;
    }
    public Jugador(String rut,String nombre,String equipoactual, int edad, boolean disponibilidad){
        this.rut = rut;
        this.nombre = nombre;
        this.equipoactual = equipoactual;
        this.edad = edad;
        this.disponibilidad = disponibilidad;
    }
    
    //Accesadores
    public String getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEquipoactual(){
        return equipoactual;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    
    //Mutadores
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEquipoactual(String equipoactual){
        this.equipoactual = equipoactual;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    
    //Impresor
    public void printJugador(){
        System.out.println("Rut: "+rut);
        System.out.println("Nombre: "+nombre);
        System.out.println("Equipo Actual: "+equipoactual);
        System.out.println("Edad: "+edad);
        System.out.println("Disponibilidad: "+disponibilidad);
    }
}
