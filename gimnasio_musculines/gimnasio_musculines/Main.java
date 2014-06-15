
/**
 * Clase main de la base de datos del gimnasio
 * 
 * @author Sergio Matamala
 * @author Simon Morales
 * 
 * @version 12-04-2014
 */
public class Main
{
    public static void main(String[] args){
        Musculines musculin1;
        Musculines musculin2;
        
        //Cliente 1 sin parámetros.
        musculin1 = new Musculines();
        //Cliente 2 con parámetros.
        musculin2 = new Musculines("17.819.265-5","Simon","Morales",'H',22,7,15000,true);
    }
}
