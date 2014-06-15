
/**
 * Write a description of class Rector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Rector {
    //Clase encargada de verificar si el juego se puede continuar, si se har perdido o si se ha ganado.
    int cont;
    Lienzo lienzo1 = new Lienzo();
    
    public void Rector(){
        //Constructor de la clase rector.
        cont = 0;
    }
    
    public void menu(){
        //Comienzo del programa Misioneros y Caníbales.
        
        //Se inicializan las variables para la interfaz del juego.
        int menu = 1;
        Scanner keyboard;
        int into;
        
        //Se inicializa el rector del juego, y conjuntamente se crea el canvas del juego llamado
        //"canvas1". Por lo que para futuras referencias se usará canvas1.metodo();.
        
        //Se inicializa el buffer de entrada.
        keyboard = new Scanner(System.in);
        
        System.out.println("Bienvenido a Misioneros y Caníbales");
        System.out.println("");
        System.out.println("Espere... se estan creando las variables");
        System.out.println("");
        System.out.println("");
        System.out.println("Tenemos a 3 misioneros que necesitamos rescatar de las fauces"
                    + "de unos caníbales, y solo disponemos de un bote para 2 personas para"
                    + "cruzar el rio, pero ten cuidado, si en una orilla hay más caníbales"
                    + " que misioneros, esos pobres moriran.");
        System.out.println("");
        while (menu != 0){
            //Menu encargado de la presentación de los métodos para interactuar con el juego.
            System.out.println("Que comience el juego...");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            lienzo1.espaciado();
            try{
                System.out.println("Tienes "+lienzo1.array[0]+" misioneros y "+lienzo1.array[1]+" caníbales en la orilla izquierda");
            }catch(NullPointerException e){
                
            }
            System.out.println("");
            System.out.println("Puedes: "
                    + "1. Mover el bote de orilla."
                    + "2. Subir gente al bote."
                    + "3. Bajar gente del bote.");
            into = keyboard.nextInt();
            switch (into){
                case 1:
                    lienzo1.mover_bote();
                    break;
                case 2:
                    lienzo1.subir_al_bote();
                    leyes_supremas();
                    break;
                case 3:
                    lienzo1.bajar_del_bote();
                    leyes_supremas();
                    break;
                default:
                    System.out.println("El valor ingresado no es válido.");
            }
            
            if (cont == 1){
                menu = 1;
            }
            if (cont == 2){
                System.out.println("Ohhhhhhhhhhhh!!!! has perdido");
                menu = 0;
            }
            if (cont == 3){
                System.out.println("Muy bien!!!!! has Ganado :D");
                menu = 0;
            }
        }
    }
    
    public void leyes_supremas(){
        //Método definitivo que verifica el arreglo del juego.
        if (lienzo1.array[0] >= lienzo1.array[1] & lienzo1.array[2] >= lienzo1.array[3]  & lienzo1.array[2] != 3){
            //El juego puede seguir continuando.
            cont = 1;
        }
        if (lienzo1.array[1] > lienzo1.array[0] | lienzo1.array[3] > lienzo1.array[2]){
            //El juego se pierde.
            cont = 2;
        }
        if (lienzo1.array[2] == 3){
            //El juego se gana.
            cont = 3;
        }
    }
}