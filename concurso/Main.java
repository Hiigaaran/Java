
/**
 * Write a description of class Main here.
 * 
 * Y.V
 * 26/05/2014
 */
public class Main
{
    public static void main(String[] args){
        Jugador jugador1;
        Equipo equipo1;

        jugador1 = new Jugador("12123564-8", "alexis sánchez", "barcelona", 26, true);
        equipo1 = new Equipo(1, "chile", 'A', jugador1);

        equipo1.setGrupo('B');
        System.out.println("El nuevo grupo es:" + equipo1.getGrupo());
        
        System.out.println(equipo1.aumentarEdad()); 
        equipo1.printEquipo();
    }
}
