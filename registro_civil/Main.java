
/**
 * Principal parte del programa
 * 
 * @author Kadesh
 * @version 06-06-14
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Certificado certificado1;
        Persona persona1;
        Scanner teclado;
        teclado = new Scanner(System.in);
        int receiver;
        persona1 = new Persona("17.819.265-5", 'M', 22, true);
        certificado1 = new Certificado(persona1, 123876, "nacimiento", "07-06-14", 25000);
        
        System.out.println("Ingrese nueva edad: ");
        receiver = teclado.nextInt();
        persona1.setEdad(receiver);
        System.out.println("La nueva edad es: "+persona1.getEdad());
        
        certificado1.descontador();
        
        certificado1.printCertificado();
    }
}
