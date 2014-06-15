
/**
 * La clase Opciones que guarda los métodos con los cuales se juega.
 * 
 * @author Felipe Flores
 * @author Simón Morales
 * @author Grace Nuñez
 * @version 14-06-2014
 */
import java.util.Scanner;
public class Opciones
{
   Bote bote1;
    private Scanner keyboard2;
    private int entry2;
    public Opciones(){
        keyboard2 = new Scanner(System.in);
        bote1 = new Bote();
    }
    public void mover_bote(){
        //Método que nos sirve para mover el bote entre las orillas.
        //Funciona a base de un parámetro "num", este puede ser 1 o 2.
        //El 1 es la orilla izquierda y 2 la orilla derecha.
        
        if (bote1.getArray(6) == 1){
            //Estos dos if nos sirven para poder informar de manera correcta la posición del bote 
            //y ofrecer las opciones de poder moverlo o no.
            System.out.println("El bote está en la orilla izquierda");
            System.out.println("");
            System.out.println("Desea mover el bote: 1. Si , 2. No");
            entry2 = keyboard2.nextInt();
            if (entry2 == 1){
                bote1.setArray(6, 0);
            }
            if (entry2 == 2){
                System.out.println("No se hace nada...");
            }
        }
        if (bote1.getArray(6) == 2){
            System.out.println("El bote está en la orilla derecha");
            System.out.println("");
            System.out.println("Desea mover el bote: 1. Si , 2. No");
            entry2 = keyboard2.nextInt();
            if (entry2 == 1){
                bote1.setArray(6, 0);
            }
            if (entry2 == 2){
                System.out.println("No se hace nada...");
            }
        }
    }
    
    public void subir_bote_misionero(){
        //Método que nos sirve para subir misioneros al bote.
        if (bote1.getArray(6) == 1){
            if (bote1.getArray(4) == 0 & bote1.getArray(5) == 0){
                System.out.println("Puedes Subir a dos misioneros al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(0)+" misioneros para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de misioneros a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(0)){
                    if (entry2 == 2){
                        if (bote1.getArray(0) == 1 | bote1.getArray(0) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(0, -2);
                        bote1.setArray(4, 2);
                    }
                    if (entry2 == 1){
                        if (bote1.getArray(0) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(0, -1);
                        bote1.setArray(4, 1);
                    }
                }
            }
            if (bote1.getArray(4) == 1 | bote1.getArray(5) == 1){
                System.out.println("Puedes subir 1 solo misionero al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(0)+" misioneros para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de misioneros a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(0)){
                    if (entry2 == 1){
                        bote1.setArray(0, -1);
                        bote1.setArray(4, 1);
                    }else{
                        System.out.println("La cantidad de misioneros ingresada no es válida");
                    }
                }
            }
            if ((bote1.getArray(4) == 1 & bote1.getArray(5) == 1) | (bote1.getArray(4) == 2) | (bote1.getArray(5) == 2)){
                System.out.println("No se puede subir más gente!!!");
            }
        }
        if (bote1.getArray(6) == 2){
            if (bote1.getArray(4) == 0 & bote1.getArray(5) == 0){
                System.out.println("Puedes Subir a dos misioneros al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(2)+" misioneros para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de misioneros a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(2)){
                    if (entry2 == 2){
                        if (bote1.getArray(2) == 1 | bote1.getArray(2) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(2, -2);
                        bote1.setArray(4, 2);
                    }
                    if (entry2 == 1){
                        if (bote1.getArray(2) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(2, -1);
                        bote1.setArray(4, 1);
                    }
                }
            }
            if (bote1.getArray(4) == 1 | bote1.getArray(5) == 1){
                System.out.println("Puedes subir 1 solo misionero al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(2)+" misioneros para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de misioneros a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(2)){
                    if (entry2 == 1){
                        bote1.setArray(2, -1);
                        bote1.setArray(4, 1);
                    }else{
                        System.out.println("La cantidad de misioneros ingresada no es válida");
                    }
                }
            }
            if ((bote1.getArray(4) == 1 & bote1.getArray(5) == 1) | (bote1.getArray(4) == 2) | (bote1.getArray(5) == 2)){
                System.out.println("No se puede subir más gente!!!");
            }
        }
    }
    
    public void subir_bote_canibal(){
        //Método que nos sirve para subir caníbales al bote.
        if (bote1.getArray(6) == 1){
            if (bote1.getArray(4) == 0 & bote1.getArray(5) == 0){
                System.out.println("Puedes Subir a dos caníbales al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(1)+" caníbales para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de caníbales a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(1)){
                    if (entry2 == 2){
                        if (bote1.getArray(1) == 1 | bote1.getArray(1) == 0){
                            System.out.println("La cantidad de caníbales a subir es inválida");
                        }
                        bote1.setArray(1, -2);
                        bote1.setArray(5, 2);
                    }
                    if (entry2 == 1){
                        if (bote1.getArray(0) == 0){
                            System.out.println("La cantidad de caníbales a subir es inválida");
                        }
                        bote1.setArray(1, -1);
                        bote1.setArray(5, 1);
                    }
                }
            }
            if (bote1.getArray(4) == 1 | bote1.getArray(5) == 1){
                System.out.println("Puedes subir 1 solo caníbal al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(1)+" caníbales para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de caníbales a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(1)){
                    if (entry2 == 1){
                        bote1.setArray(1, -1);
                        bote1.setArray(5, 1);
                    }else{
                        System.out.println("La cantidad de caníbales ingresada no es válida");
                    }
                }
            }
            if ((bote1.getArray(4) == 1 & bote1.getArray(5) == 1) | (bote1.getArray(4) == 2) | (bote1.getArray(5) == 2)){
                System.out.println("No se puede subir más gente!!!");
            }
        }
        if (bote1.getArray(6) == 2){
            if (bote1.getArray(4) == 0 & bote1.getArray(5) == 0){
                System.out.println("Puedes Subir a dos caníbales al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(3)+" caníbales para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de caníbales a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(3)){
                    if (entry2 == 2){
                        if (bote1.getArray(3) == 1 | bote1.getArray(3) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(3, -2);
                        bote1.setArray(5, 2);
                    }
                    if (entry2 == 1){
                        if (bote1.getArray(3) == 0){
                            System.out.println("La cantidad de misioneros a subir es inválida");
                        }
                        bote1.setArray(3, -1);
                        bote1.setArray(5, 1);
                    }
                }
            }
            if (bote1.getArray(4) == 1 | bote1.getArray(5) == 1){
                System.out.println("Puedes subir 1 solo caníbal al bote");
                System.out.println("");
                System.out.println("Tienes a "+bote1.getArray(3)+" caníbales para subir");
                System.out.println("");
                System.out.println("Ingrese la cantidad de caníbales a subir: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(3)){
                    if (entry2 == 1){
                        bote1.setArray(3, -1);
                        bote1.setArray(5, 1);
                    }else{
                        System.out.println("La cantidad de misioneros ingresada no es válida");
                    }
                }
            }
            if ((bote1.getArray(4) == 1 & bote1.getArray(5) == 1) | (bote1.getArray(4) == 2) | (bote1.getArray(5) == 2)){
                System.out.println("No se puede subir más gente!!!");
            }
        }
    }
    
    public void bajar_bote(int cont){
        //Método para bajar gente del bote.
        //El parámetro "cont", le indica al método que tiene q hacer.
        if (cont == 3){
            if (bote1.getArray(6) == 1){
                bote1.setArray(0, -(bote1.getArray(4)));
                bote1.setArray(1, -(bote1.getArray(5)));
                bote1.setArray(4, -(bote1.getArray(4)));
                bote1.setArray(5, -(bote1.getArray(5)));
            }
            if (bote1.getArray(6) == 2){
                bote1.setArray(2, -(bote1.getArray(4)));
                bote1.setArray(3, -(bote1.getArray(5)));
                bote1.setArray(4, -(bote1.getArray(4)));
                bote1.setArray(5, -(bote1.getArray(5)));
            }
        }
        if (cont == 1){
            if (bote1.getArray(6) == 1){
                System.out.print("Puedes bajar a "+bote1.getArray(4)+" misioneros del bote");
                System.out.println("Ingresa la cantidad a descargar: ");
                entry2 = keyboard2.nextInt();
                
                if (entry2 <= bote1.getArray(4)){
                    bote1.setArray(0, entry2);
                    bote1.setArray(4, -(entry2));
                }else{
                    System.out.println("La cantidad ingresada no es válida");
                }
            }
        }
        if (cont == 2){
            System.out.println("Puedes bajar a "+bote1.getArray(5)+" caníbales del bote");
            System.out.println("Ingresa la cantidad a descargar: ");
            entry2 = keyboard2.nextInt();
            
            if (entry2 <= bote1.getArray(5)){
                bote1.setArray(1, entry2);
                bote1.setArray(5, -(entry2));
            }else{
                System.out.println("La cantidad ingresada no es válida");
            }
        }
    }
}
