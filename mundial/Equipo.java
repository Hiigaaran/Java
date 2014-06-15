
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    //Atributos
    private int numero;
    private String pais;
    private char grupo;
    private Jugador jugador1;

    //Comstructores
    public Equipo(){
        numero = 0;
        pais = "";
        grupo = 'A';
        jugador1 = new Jugador();
    }

    public Equipo(int numero,String pais,char grupo,Jugador jugador1){
        this.numero = numero;
        this.pais = pais;
        this.grupo = grupo;
        this.jugador1 = jugador1;
    }

    public int getNumero(){
        return numero;
    }

    public String getPais(){
        return pais;
    }

    public char getGrupo(){
        return grupo;
    }

    public Jugador getJugador1(){
        return jugador1;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setGrupo(char grupo){
        this.grupo = grupo;
    }

    public void setJugador1(Jugador jugador1){
        this.jugador1 = jugador1;
    }

    public void printEquipo(){
        System.out.println("Numero: "+numero);
        System.out.println("Pais: "+pais);
        System.out.println("Grupo: "+grupo);
        jugador1.printJugador();
    }
    
    public void listarDatos(){
        String disp;
        if(jugador1.getDisponibilidad()){
            disp = "Disponible";
        }else{
            disp = "No Disponible";
        }
        System.out.println("           Lista de Equipos           ");
        System.out.println("--------------------------------------");
        System.out.println(pais + " Grupo " + grupo + " " + jugador1.getNombre() + " " + disp);
        System.out.println("--------------------------------------");
    }
}
