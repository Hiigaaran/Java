
/**
 * Clase encargada de sostener el arreglo con los datos del juego.
 * 
 * @author Felipe Flores
 * @author Simón Morales
 * @author Grace Nuñez
 * @version 14-06-2014
 */
public class Bote
{
   //Atributos principales de la clase bote.
    private int[] array;
    //Método Constructor de la clase.
    public Bote(){
        array = new int[7];
        //Uso del array, posición [0], misioneros en el lado izquierdo, posición [1], caníbales en el lado izquierdo,
        //posición [2], misioneros en el lado derecho, posición [3], caníbales en el lado derecho, posición [4],
        //misioneros en el bote, posición [5], caníbales en el bote, posición [6], posición del bote.

        array[0] = 3;array[1] = 0;array[2] = 0;array[3] = 3;array[4] = 0;array[5] = 0;array[6] = 1;
        //El array se inicializa por defecto con los siguientes valores array[3,0,0,3,0,0,1], por obvias razones las
        //mismas posiciones deben estar debidamente validadas, por ejemlo la posicion array[6], que guarda la posición
        //del bote solo puede ser 1 o 2 (derecha o izquierda respectivamente).
    }
    
    //Accesador del arreglo.
    public int getArray(int pos){
        return array[pos];
    }
    
    //Mutador del arreglo.
    public void setArray(int pos,int change){
        //Validación seccionada del arreglo, patentada por Simón Morales. 
        
        //Hay que tener en consideración de que el método "setArray", no estará a disposición del usuario
        //por lo que no hace falta tener validaciones internas.
        switch (pos) {
            case 0:
                //setArray[0]
                array[0] = array[0] + change;
                break;
            case 1:
                //setArray[1]
                array[1] = array[1] + change;
                break;
            case 2:
                //setArray[2]
                array[2] = array[2] + change;
                break;
            case 3:
                //setArray[3]
                array[3] = array[3] + change;
                break;
            case 4:
                //setArray[4]: Cantidad de misioneros en el bote.
                array[4] = array[4] + change;
                break;
            case 5:
                //setArray[5]: Cantidad de caníbales en el bote.
                array[5] = array[5] + change;
                break;
            case 6:
                //setArray[6]: Posición del bote.
                if (array[6] == 1){
                    array[6] = 2;
                }else{
                    array[6] = 1;
                }
                break;
            default:
                System.out.println("Bug Detected - in: "+pos);
                      
        }
    }
}
