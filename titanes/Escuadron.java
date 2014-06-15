/**
 * @author Simón Morales
 * @version 21/04/2014
 */
import java.util.Scanner;
public class Escuadron
{
    private String[][] registro;
    private String[][] registro2;
    private String rango;
    private Scanner teclado;
    public void crear_lista(){
        registro = new String[5][7];
    }

    public void registrar_soldado(){
        teclado = new Scanner(System.in);
        for (int i = 0;i < 5;i++)
        {
            System.out.println("Ingrese los datos en este orden;nombre, edad, genero, ranking, rango, habilidad y estado. de la fila "+i);
            for (int j = 0;j < 7;j++)
            {
                rango = teclado.nextLine();
                registro[i][j] = rango;
            }
        }
    }

    public void printEscuadron(){
        for (int i = 0;i < 5;i++)
        {
            for (int j = 0;j < 6;j++)
            {
                System.out.print(" "+registro[i][j]);
            }
            System.out.println("");
        }
    }

    public void cambiar_estado(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del soldado para cambiar su estado:");
        rango = teclado.nextLine();
        for (int i = 0;i < 5;i++)
        {
            if (rango.equals(registro[i][0]))
            {
                System.out.println("Ingrese el nuevo estado: ");
                rango = teclado.nextLine();
                registro[i][6] = rango;
            }
        }
    }

    public void listar_bajas(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el rango de los soldados a listar: ");
        rango = teclado.nextLine();
        for (int i = 0;i < 5;i++)
        {
            if (rango.equals(registro[i][4]))
            {
                if (registro[i][6].equals("muerto"))
                {
                    for (int j = 0;j < 4;j++)
                    {
                        System.out.print(" "+registro[i][j]+" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public void promedio_edad(){
        int cont = 0;
        double prom = 0;
        double convert = 0;
        for (int i = 0;i < 5;i++)
        {
            if (registro[i][6].equals("muerto"))
            {
                cont++;
                convert = Double.parseDouble(registro[i][1]);
                prom = prom + convert;
            }
        }
        prom = (double)(prom / cont);
        System.out.println("La edad promedio de los caidos es de: "+prom);
    }

    public void actualizar_lista(){
        int cont = 0;
        int k = 0;
        for (int i = 0;i < 5;i++)
        {
            if (registro[i][6].equals("vivo"))
            {
                cont++;
            }
        }
        registro2 = new String[cont][7];
        for (int i = 0;i < 5;i++)
        {
            if (registro[i][6].equals("vivo"))
            {
                for (int j = 0;j < 7;j++)
                {
                    registro2[k][j] = registro[i][j];
                }
                k++;
            }
        }
        for (int i = 0;i < cont;i++)
        {
            for (int j = 0;j < 6;j++)
            {
                System.out.print(" "+registro2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
