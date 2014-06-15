
/**
 * Write a description of class Matemagico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matemagico
{
    //Atributos de la clase Matemagico.
    private int num, a, b, c, sum;
    //Método constructor con parámetros.
    public Matemagico(int num){
        this.num = num;
        sum = 0;
        a = 0;
        b = 0;
        c = 0;
    }
    public int getNum(){
        return num;
    }
    //Método customer para trabajar con num.
    public void Do_Matemagico(){
        a = num / 100;
        b = (num - (a*100)) / 10;
        c = num - ((a*100)+(b*10));
        
        sum = a + b + c;
    }
    public int getSum(){
        return sum;
    }
}
//Método accesador.
