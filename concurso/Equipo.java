
/**
 * Write a description of class Equipo here.
 * 
 * Y.V
 * 19/05/2014
 */
public class Equipo
{
    //atributos 
    private int numero;
    private String pais;
    private char grupo;
    private Jugador jugadorx;

    //constructores
    public Equipo(){
        numero = 0;
        pais = "";
        grupo = 'A';
        jugadorx = new Jugador();        
    }

    public Equipo(int numero, String pais, char grupo, Jugador jugadorx){
        setNumero(numero);
        setPais(pais);
        setGrupo(grupo);
        setJugadorx(jugadorx);
    }

    //accesadores
    public int getNumero(){
        return numero;
    }

    public String getPais(){
        return pais;
    }

    public char getGrupo(){
        return grupo;
    }

    public Jugador getJugadorx(){
        return jugadorx;
    }

    //mutadores
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setGrupo(char grupo){
        if(grupo == 'A' | grupo == 'B' | grupo == 'C' | grupo == 'D' | grupo == 'E' | grupo == 'F' | grupo == 'G' | grupo == 'H'){
            this.grupo = grupo;
        } else{
            System.out.println("El grupo puede ser ser A, B, C, D, E, F, G o H");
        }
    }

    public void setJugadorx(Jugador jugadorx){
        this.jugadorx = jugadorx;
    }

    //impresión
    public void printEquipo(){
        System.out.println("Número:" + numero);
        System.out.println("País:" + pais);
        System.out.println("Grupo:" + grupo);

        //         System.out.println("Rut:" + jugadorx.getRut());
        //         System.out.println("Nombre:" + jugadorx.getNombre());
        //         System.out.println("Equipo Actual:" + jugadorx.getEquipoActual());
        //         System.out.println("Edad:" + jugadorx.getEdad());
        //         System.out.println("¿disponible?:" + jugadorx.getDisponible());

        jugadorx.printJugador();
    }

    //customer: listar
    public void listarDatos(){
        String disponible;
        if(jugadorx.getDisponible()==true) {
            disponible = "Disponible";
        } else{
            disponible = "No Disponible";
        }
        System.out.println("          LISTA DE EQUIPOS          ");
        System.out.println("-------------------------------------");
        System.out.println(pais + " GRUPO " + grupo + " " + jugadorx.getNombre() + " " + disponible);
        System.out.println("-------------------------------------");
    }

    //customer:habilitar jugador
    public void habilitarJugador(){
        if(jugadorx.getDisponible() == false){
            jugadorx.setDisponible(true);
        }
    }

    //customer: autentificar
    public boolean autentificar(String nuevoRut, String nuevoPais){
        boolean valor;
        if(jugadorx.getRut().equals(nuevoRut) & pais.equals(nuevoPais)){
            valor = true;
        } else{
            valor = false;
        }
        return valor;
    }

    //customer:aumentar edad
    public String aumentarEdad(){
        int nuevaEdad;
        String msg;

        nuevaEdad = jugadorx.getEdad() + 1;
        jugadorx.setEdad(nuevaEdad);
        if(nuevaEdad > 40){
            msg = "SE RECOMIENDA SU RETIRO"; 
        }else{
            msg = "SIGA JUGANDO"; 
        }
        return msg;        
    }

}
