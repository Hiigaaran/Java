/**
 * Secuenciador Fibonacci.
 * 
 * @author Simon Morales 
 * @version 15/04/2014
 */
import java.util.Scanner;
public class Secuenciador
{
    public static void main(String[] args){
        Secuenciador secuencia1;
    }
    private int i,j,k,yolo,q;
    private Scanner a;
    public void secuenciador(){
        i = 0;
        j = 1;
        k = 0;
        a = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros de la secuencia Fibonacci que desea ver: ");
        k = a.nextInt();
        System.out.println("Secuencia Fibonacci llamada: ");
        if (k >= 1)
        {
            System.out.print(""+i);
        }
        if (k >= 2)
        {
            System.out.print("-"+j);
        }
        if (k > 2)
        {
            while (yolo <= (k - 3))
            {
                q = i + j;
                System.out.print("-"+q);
                i = j;
                j = q;
                yolo++;
            }
        }
    }
}
