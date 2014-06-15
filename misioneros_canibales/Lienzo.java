
/**
 * Workbench de la aplicación
 * 
 * @author Simón Morales
 * @version 09-06-14
 */
import java.util.Scanner;
public class Lienzo {
    int[] array;
    private Scanner teclado;
    int key;
    private int bote;
    //Constructor de Canvas para la inicialización del arreglo.
    public Lienzo(){
        array = new int[7];
        //Uso del array, posición [0], misioneros en el lado izquierdo, posición [1], caníbales en el lado izquierdo,
        //posición [2], misioneros en el lado derecho, posición [3], caníbales en el lado derecho, posición [4],
        //misioneros en el bote, posición [5], caníbales en el bote, posición [6], posición del bote.

        array[0] = 3;
        array[1] = 3;
        array[2] = 0;
        array[3] = 0;
        array[4] = 0;
        array[5] = 0;
        array[6] = 1;
        //El array se inicializa por defecto con los siguientes valores array[3,3,0,0,0,0,1], por obvias razones las
        //mismas posiciones deben estar debidamente validadas, por ejemlo la posicion array[6], que guarda la posición
        //del bote solo puede ser 1 o 2 (derecha o izquierda respectivamente).
        teclado = new Scanner(System.in);
        //Se inicializa el tipo dato Scanner de "teclado"
        //El receptor del buffer será "key".
    }

    public void mover_bote(){
        //Método que nos ayudará a movilizar el bote de posición ingresando un valor entero.
        if (array[6] == 1){
            System.out.println("La posición actual del bote es: orilla derecha");
        }else{
            System.out.println("La posición actual del bote es: orilla izquierda");
        }
        System.out.println("Desea mover el bote?? 1. Si 2. No");
        key = teclado.nextInt();
        if (key == 1){
            if (array[6] == 1){
                array[6] = 2;
            }else{
                array[6] = 1;
            }
        }
    }

    public void subir_al_bote(){
        //Método que nos va ayudar para movilizar a los misioneros y/o caníbales por igual, entre el bote y la orilla.

        //Validaciones para la coincidencia entre los individuos en las orillas y el bote.
        if (array[6] == 1 & array[2] != 0 | array[3] != 0){
            bote = array[4] + array[5];
            //Algoritmo para subir misioneros y/o canibales. Derecha
            System.out.println("En este momento hay "+bote+" persona(s) en el bote");
            System.out.println("");
            System.out.println("Ingrese 1 si quiere subir misioneros o 2 si quiere subir caníbales");
            key = teclado.nextInt();
            if (key == 1){
                //Subiendo a los misioneros.
                if (array[2] != 0){
                    if (bote == 0){
                        System.out.println("Puedes subir 2 misioneros");
                        System.out.println("");
                        System.out.println("Ingrese el numero de misioneros a subir: ");
                        key = teclado.nextInt();
                        if (key > 0 & key < 3){
                            array[4] = key;
                            array[2] = array[2] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 1){
                        System.out.println("Puedes subir a 1 misionero");
                        System.out.println("");
                        System.out.println("Ingrese el numero de misioneros a subir: ");
                        key = teclado.nextInt();
                        if (key == 1){
                            array[4] = key;
                            array[2] = array[2] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 2){
                        System.out.println("El bote ya está a capacidad máxima, descargue primero");
                    }
                }
            }
            if (key == 2){
                //Subiendo a los caníbales.
                if (array[3] != 0){
                    if (bote == 0){
                        System.out.println("Puedes subir 2 caníbales");
                        System.out.println("");
                        System.out.println("Ingrese el numero de caníbales a subir: ");
                        key = teclado.nextInt();
                        if (key > 0 & key < 3){
                            array[5] = key;
                            array[3] = array[3] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 1){
                        System.out.println("Puedes subir a 1 caníbal");
                        System.out.println("");
                        System.out.println("Ingrese el numero de caníbales a subir: ");
                        key = teclado.nextInt();
                        if (key == 1){
                            array[5] = key;
                            array[3] = array[3] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 2){
                        System.out.println("El bote ya está a capacidad máxima, descargue primero");
                    }
                }
            }
        }

        if (array[6] == 2 & array[0] != 0 & array[1] != 0){
            bote = array[4] + array[5];
            //Algoritmo para subir misioneros y/o canibales. Izquierda
            System.out.println("En este momento hay "+bote+" persona(s) en el bote");
            System.out.println("");
            System.out.println("Ingrese 1 si quiere subir misioneros o 2 si quiere subir caníbales");
            key = teclado.nextInt();
            if (key == 1){
                //Subiendo a los misioneros.
                if (array[0] != 0){
                    if (bote == 0){
                        System.out.println("Puedes subir 2 misioneros");
                        System.out.println("");
                        System.out.println("Ingrese el numero de misioneros a subir: ");
                        key = teclado.nextInt();
                        if (key > 0 & key < 3){
                            array[4] = key;
                            array[0] = array[0] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 1){
                        System.out.println("Puedes subir a 1 misionero");
                        System.out.println("");
                        System.out.println("Ingrese el numero de misioneros a subir: ");
                        key = teclado.nextInt();
                        if (key == 1){
                            array[4] = key;
                            array[0] = array[0] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 2){
                        System.out.println("El bote ya está a capacidad máxima, descargue primero");
                    }
                }
            }
            if (key == 2){
                //Subiendo a los caníbales.
                if (array[1] != 0){
                    if (bote == 0){
                        System.out.println("Puedes subir 2 caníbales");
                        System.out.println("");
                        System.out.println("Ingrese el numero de caníbales a subir: ");
                        key = teclado.nextInt();
                        if (key > 0 & key < 3){
                            array[5] = key;
                            array[1] = array[1] -key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 1){
                        System.out.println("Puedes subir a 1 caníbal");
                        System.out.println("");
                        System.out.println("Ingrese el numero de caníbales a subir: ");
                        key = teclado.nextInt();
                        if (key == 1){
                            array[5] = key;
                            array[1] = array[1] - key;
                        }else{
                            System.out.println("El valor ingresado no es válido");
                        }
                    }
                    if (bote == 2){
                        System.out.println("El bote ya está a capacidad máxima, descargue primero");
                    }
                }
            }
        }
    }

    public void bajar_del_bote(){
        //Método que nos va ayudar para movilizar a los misioneros y/o caníbales por igual, entre el bote y la orilla.

        //Revisión del estado del bote
        System.out.println("En el bote hay "+array[4]+" misioneros y "+array[5]+" caníbales");

        //Elección de opciones.
        if (array[4] != 0 & array[5] != 0){
            System.out.println("Si desea descargar misioneros ingrese 1, canibales 2, o descargar todo 3");
            key = teclado.nextInt();

            if (key == 1){
                if (array[6] == 1){
                    //Bote en la orilla derecha.
                    if (array[4] > 1){
                        System.out.println("Cuantos misioneros quiere descargar??: ");
                        key = teclado.nextInt();
                        if (key == 2){
                            array[2] = key;
                            array[4] = array[4] - key;
                        }
                        if (key == 1){
                            array[2] = key;
                            array[4] = array[4] - key;
                        }
                    }
                    if (array[4] == 1){
                        array[2] = array[4];
                        array[4] = array[4] - array[2];
                    }
                }
                if (array[6] == 2){
                    //Bote orilla izquierda.
                    if (array[4] > 1){
                        System.out.println("Cuantos misioneros quiere descargar??: ");
                        key = teclado.nextInt();
                        if (key == 2){
                            array[0] = key;
                            array[4] = array[4] - key;
                        }
                        if (key == 1){
                            array[0] = key;
                            array[4] = array[4] - key;
                        }
                    }
                    if (array[4] == 1){
                        array[0] = array[4];
                        array[4] = array[4] - array[0];
                    }
                }
            }
            if (key == 2){
                if (array[6] == 1){
                    //Bote en la orilla derecha.
                    if (array[5] > 1){
                        System.out.println("Cuantos caníbales quieres descargar??: ");
                        key = teclado.nextInt();
                        if (key == 2){
                            array[3] = key;
                            array[5] = array[5] - key;
                        }
                        if (key == 1){
                            array[3] = key;
                            array[5] = array[5] - key;
                        }
                    }
                    if (array[5] == 1){
                        array[3] = array[5];
                        array[5] = array[5] - array[3];
                    }
                }
                if (array[6] == 2){
                    //Bote en la orilla izquierda.
                    if (array[5] > 1){
                        System.out.println("Cuantos caníbales quieres descargar??: ");
                        key = teclado.nextInt();
                        if (key == 2){
                            array[1] = key;
                            array[5] = array[5] - key;
                        }
                        if (key == 1){
                            array[1] = key;
                            array[5] = array[5] - key;
                        }
                    }
                    if (array[5] == 1){
                        array[1] = array[5];
                        array[5] = array[5] - array[1];
                    }
                }
            }
            if (key == 3){
                if (array[6] == 1){
                    //Bote en la orilla derecha.
                    array[2] = array[4];
                    array[3] = array[5];
                    array[4] = 0;
                    array[5] = 0;
                }
                if (array[6] == 2){
                    //Bote en la orilla izquierda.
                    array[0] = array[4];
                    array[1] = array[5];
                    array[4] = 0;
                    array[5] = 0;
                }
            }
        }
    }

    public void espaciado(){
        for (int i = 0; i < 12;i++){
            System.out.println("");
        }
    }
}