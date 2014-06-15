
/**
 * La clase guardian, concevida para monitorizar el juego
 * 
 * @author Felipe Flores
 * @author Simón Morales
 * @author Grace Nuñez
 * @version 14-06-2014
 */
public class Guardian
{
   private int counter;
    Opciones opcion1;
    public Guardian(){
        counter = 1;
        opcion1 = new Opciones();
    }
    
    public int ejecuccion_leyes_supremas(){
        if ((opcion1.bote1.getArray(0) != 0 & opcion1.bote1.getArray(1) > opcion1.bote1.getArray(0)) | (opcion1.bote1.getArray(2) != 0 & opcion1.bote1.getArray(3) > opcion1.bote1.getArray(2))){
            //Si se ejecuta este "if", entonces el juego se pierde.
            counter = 2;
        }
        if (opcion1.bote1.getArray(2) == 3){
            //El juego se gana
            counter = 3;
        }
        return counter;
    }
}
