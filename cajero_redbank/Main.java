
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner key;
        int newpin;
        key = new Scanner(System.in);
        
        Tarjeta tarjeta1 = new Tarjeta(9425,"28/05/2020",true);
        Banco redbank = new Banco("17.819.265-5",17819265,200000,tarjeta1);
        
        System.out.println("ingrese el nuevo pin: ");
        newpin = key.nextInt();
        
        tarjeta1.setPin(newpin);
        
        System.out.println(tarjeta1.getPin());
        
        System.out.println("Ingrese el deposito a la cuenta: ");
        newpin = key.nextInt();
        redbank.depositarDinero(newpin);
        
        redbank.printBanco();
    }
}
