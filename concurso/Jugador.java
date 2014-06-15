
/**
 * Write a description of class Jugador here.
 * 
 * Y.V
 * 19/05/2014
 */
public class Jugador
{
    //atributos
    private String rut, nombre, equipoActual;
    private int edad;
    private boolean disponible;

    //constructores
    public Jugador(){
        rut = "";
        nombre = "";
        equipoActual = "";
        edad = 0;
        disponible = false;
    }

    public Jugador(String rut, String nombre, String equipoActual, int edad, boolean disponible){
        setRut(rut);
        setNombre(nombre);
        setEquipoActual(equipoActual);
        setEdad(edad);
        setDisponible(disponible);
    }

    //accesadores
    public String getRut(){
        return rut;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEquipoActual(){
        return equipoActual;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getDisponible(){
        return disponible;
    }

    //mutadores
    public void setRut(String rut){
        if(rut.length() >=8){
            this.rut = rut;
        } else{
            System.out.println("El rut debe tener mínimo 8 caracteres");
        }
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEquipoActual(String equipoActual){
        this.equipoActual = equipoActual;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void setEdad(int edad){
        if(edad >=18 & edad <=45){
            this.edad = edad;
        } else{
            System.out.println("La edad debe ser un número entre 18 y 45");
        }
    }

    //impresión
    public void printJugador(){
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Equipo Actual: " + equipoActual);
        System.out.println("Edad: " + edad);
        System.out.println("¿Disponible? " + disponible);
    }

}
