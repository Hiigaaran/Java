/**
 * Clase Estimador_Pesos del projecto bote.
 * 
 * @author Simon Morales    
 * @version 03.04.2014
 */
public class Estimador_Pesos
{
    //Primero los atributos de la clase con su respectivo "private".
    private int i, j, k, h, z;
    //Luego creamos el método constructor sin parámetros.
    public Estimador_Pesos(){
        i = 0;
        j = 0;
        k = 0;
        h = 0;
        z = 0;
    }
    //Ahora creamos un método mutador para obtener el peso total con el que vamos a trabajar.
    public void setPeso_Total(int i){
        this.i = i;
    }
    //Y, ahora para calcular la cantidad de sacos que puede tener un bote con el peso ingresado
    //Creamos un método customer.
    public void Estimador(){
        while (i>=50){
            if (i>=50){
                this.i = i - 50;
                this.k = k + 1;
            }
        }
        while (i>=25){
            if (i>=25){
                this.i = i - 25;
                this.z = z + 1;
            }
        }
        while (i>=10){
            if (i>=10){
                this.i = i - 1;
                this.h = h + 1;
            }
        }
    }
    //Por si a caso, un método accesador para ver si el dato que ingresamos esta correcto.
    public int getPeso_Total(){
        return i;
    }
    //Y por ultimo un método de impresión para mostrar los resultados en pantalla.
    public void imprimir_Resultados(){
        System.out.print("Los sacos de 50 kg que puede cargar el bote son: "+k);
        System.out.print("Los sacos de 25 kg que puede cargar el bote son: "+z);
        System.out.print("Los sacos de 10 kg que puede cargar el bote son: "+h);
    }
}