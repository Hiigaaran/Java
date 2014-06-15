/**
 * Ordenador de secuencias numericas usando método burbuja.
 * 
 * @author Simon Morales
 * @version 15/04/2014
 */

import java.util.Scanner;
public class Ordenador
{
    public static void main(String[] args){
        Ordenador ordenado1;
    }
    private int[] A;
    private int z;
    private Scanner a;
    public void orden(){
        a = new Scanner(System.in);
        A = new int[6];
        for (int i = 0;i < 6;i++)
        {
            z = 0;
            System.out.println("Ingrese un numero a la secuencia: ");
            z = a.nextInt();
            A[i] = z;
        }
        System.out.println("Orden de la secuencia ingresada: ");
        for (int i = 0;i < 6;i++)
        {
            System.out.println(""+A[i]);
        }
        int yolo;
        for (int i = 1;i < 6;i++)
        {
            for (int j = 0;j < 5;j++)
            {
                if (A[j] > A[j + 1])
                {
                    yolo = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = yolo;
                }
            }
        }

        System.out.println("Secuencia ordenada: ");
        for (int i = 0;i < 6;i++)
        {
            System.out.println(""+A[i]);
        }
    }
}
