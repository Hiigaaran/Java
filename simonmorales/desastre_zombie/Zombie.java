
/**
 * Clase Zombie para el juego "Zombies vs Pac-Man"
 * 
 * @author Simón Morales 
 * @version 21/04/2014
 */
public class Zombie
{
    //Definición de los atributos de la clase Zombie.
    private String tipozombie;
    private char aggro;
    private int rapidez, hambre, vida, victimas;
    private boolean state;
    //Método constructor sin parámetros.
    public Zombie(){
        tipozombie = " ";
        aggro = 'A';
        rapidez = 0;
        hambre = 0;
        vida = 20;
        victimas = 0;
        state = false;
    }
    //Método constructor con parámetros.
    public Zombie(String tipozombie,char aggro,int rapidez,int hambre,int vida,int victimas,boolean state){
        this.tipozombie = tipozombie;
        this.aggro = aggro;
        this.rapidez = rapidez;
        this.hambre = hambre;
        this.vida = vida;
        this.victimas = victimas;
        this.state = state;
    }
    //Métodos accesadores de la clase Zombie.
    public String getTipozombie(){
        return tipozombie;
    }

    public char getAggro(){
        return aggro;
    }

    public int getRapidez(){
        return rapidez;
    }

    public int getHambre(){
        return hambre;
    }

    public int getVida(){
        return vida;
    }

    public int getVictimas(){
        return victimas;
    }

    public boolean getState(){
        return state;
    }
    //Métodos mutadores de la clase Zombie.
    public void setTipozombie(String tipozombie){
        this.tipozombie = tipozombie;
    }

    public void setAggro(char aggro){
        this.aggro = aggro;
    }

    public void setRapidez(int rapidez){
        this.rapidez = rapidez;
    }

    public void setHambre(int hambre){
        this.hambre = hambre;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void setVictimas(int victimas){
        this.victimas = victimas;
    }

    public void setState(boolean state){
        this.state = state;
    }
    //Método de impresión para la clase Zombie.
    public void printZombie(){
        System.out.println("Tipo de zombie: "+tipozombie);
        System.out.println("Nivel de agresividad: "+aggro);
        System.out.println("Rapidez: "+rapidez+" KM/h");
        System.out.println("Nivel del hambre: "+hambre);
        System.out.println("Nivel de vida: "+vida);
        System.out.println("Estado de ataque: "+state);
        System.out.println("Cantidad de victimas: "+victimas);
    }
    //Métodos customer para la clase Zombie.
    public void aumentar_rapidez(){
        rapidez =(int) (rapidez+(rapidez*0.15));
    }
    
    public String obtener_infozombie(){
        String info;
        info = (String)(tipozombie +" "+rapidez+" "+state);
        return info;
    }
    
    public void matar_lentozombie(int rebaja){
        aggro = 'B';
        rapidez = (int)(rapidez - (rebaja));
        vida = (int)(vida - (vida*0.90));
    }
}

