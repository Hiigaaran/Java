
/**
 * Pruebas de clase string.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        //toString()
        String cadena1,cadena2;
        cadena1 = "hola";
        cadena2 = cadena1.toString();
        System.out.println("Cadena2 es: "+ cadena2);
        
        //concat(String s)
        String cadena3,cadena4;
        cadena3 = "abc";
        cadena4 = "def";
        cadena3 = cadena3.concat(cadena4);
        System.out.println("Cadena3 es:"+ cadena3);
        
        //length()
        String cadena5;
        int largo;
        cadena5 = "Hola Mundo";
        largo = cadena5.length();
        System.out.println("Largo de la cadena 5 es:"+ largo);
        
        //toLowerCase() & toUpperCase()
        String cadena6,cadena7;
        cadena6 = "HOLA que tal";
        cadena7 = cadena6.toLowerCase();
        cadena6 = cadena6.toUpperCase();
        System.out.println("cadena6 minusculas :"+ cadena7);
        System.out.println("cadena6 mayusculas :"+ cadena6);
        
        //trim();
        String cadena8;
        cadena8 = "           Hola Mundo              ";
        System.out.println(cadena8);
        cadena8 = cadena8.trim();
        System.out.println(cadena8);
        
        //substring(int incio, int fin);
        
    }
}
