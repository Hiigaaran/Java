/**
 * Super Calculadora
 * 
 * @author Simon Morales 
 * @version 15/04/2014
 */
public class Calculadora
{
    public static void main(String[] args){
        Calculadora calcula1;
    }
        private int a,b,c;
        private double d;
        //Constructor.
        public Calculadora()
        {
            a = 0;
            b = 0;
            c = 0;
            d = 0;
        }
        //Métodos operacionales.
        //Suma.
        public void suma(int a,int b){
            c = a + b;
            System.out.print("El resultado de la suma es: "+c);
        }
        //Resta.
        public void resta(int a,int b){
            c = a - b;
            System.out.print("El resultado de la resta es: "+c);
        }
        //Multiplicación.
        public void multi(int a, int b){
            c = a * b;
            System.out.print("El resultado de la multiplicación: "+c);
        }
        //División.
        public void divid(double i, double j){
            if (j == 0)
            {
                System.out.print("Error matemático.");
            }
            else
            {
                d = i / j;
                System.out.print("El resultado de la división es: "+d);
            }
        }
}
