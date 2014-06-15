
/**
 * Menu interactivo del juego.
 * 
 * @author Felipe Flores
 * @author Simón Morales
 * @author Grace Nuñez
 * @version 14-06-2014
 */
import java.util.Scanner;
public class Menu
{
   public static void main(String[] args) {
        Guardian guard1 = new Guardian();
        Scanner keyboard;
        int entry;
        keyboard = new Scanner(System.in);
        int a = 1;
        System.out.println("Bienvenidos a Misioneros y Caníbales");
            System.out.println("************************************");
            System.out.println("");
            System.out.println("Tenemos a 3 misioneros en la orilla izquierda de un rio");
            System.out.println("y quieren llegar por un bote a la otra orilla. Sin embargo, en la");
            System.out.println("otra orilla hay 3 caníbales. Ten cuidado, si hay mas canibales que misioneros");
            System.out.println("en alguna orilla, los misioneros a merced de los caníbales serán comidos");
            System.out.println("y perderas el juego...");
            System.out.println("");
            System.out.println("Que comience el juego!!!!");
            System.out.println("");
        while (a != 0){
            System.out.println("Tienes a "+guard1.opcion1.bote1.getArray(0)+" misioneros y "+guard1.opcion1.bote1.getArray(1)+" caníbales en la orilla izquierda");
            System.out.println("");
            System.out.println("y, tienes "+guard1.opcion1.bote1.getArray(2)+" misioneros y "+guard1.opcion1.bote1.getArray(3)+" caníbales, en la orilla derecha");
            System.out.println("");
            System.out.println("Puedes: "
                    + "1. Mover el bote de orilla."
                    + "2. Subir gente al bote."
                    + "3. Bajar gente del bote."
                    + ": ");
            entry = keyboard.nextInt();
            
            switch (entry){
                case 1:
                    guard1.opcion1.mover_bote();
                    break;
                case 2:
                    System.out.println("Quieres subir: 1. Misioneros o 2. Canibales??: ");
                    entry = keyboard.nextInt();
                    if (entry == 1){
                        guard1.opcion1.subir_bote_misionero();
                    }
                    if (entry == 2){
                        guard1.opcion1.subir_bote_canibal();
                    }
                    break;
                case 3:
                    System.out.println("Quieres bajar a: 1. Misioneros, 2. Caníbales o 3. Todo");
                    entry = keyboard.nextInt();
                    guard1.opcion1.bajar_bote(entry);
                    break;
                default:
                    System.out.println("Opcion ingresada no válida");
            }
            if (guard1.ejecuccion_leyes_supremas() == 2){
                System.out.println("Ohhhhhhhh!!!! has perdido.");
                a = 0;
            }
            if (guard1.ejecuccion_leyes_supremas() == 3){
                System.out.println("Que bien!!!!!! has ganado");
                a = 0;
            }
        } 
    }
}
