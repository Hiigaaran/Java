
/**
 * Clase Tarjeta 
 * 
 * @author Simon Morales 
 * @version 01/06/2014
 */
public class Tarjeta
{
    //Atributos principales de la clase tarjeta.
    private int numTarjeta;
    private int pin;
    private String vencimiento;
    private boolean estado;

    public Tarjeta(){
        //Constructor sin parámetros de la clase Tarjeta.
        numTarjeta = 0;
        pin = 0;
        vencimiento = "";
        estado = false;
    }
    //Constructor de la Clase Tarjeta con parámetros
    public Tarjeta(int numTarjeta,int pin,String vencimiento,boolean estado){
        setnumTarjeta(numTarjeta);
        setPin(pin);
        setVencimiento(vencimiento);
        setEstado(estado);
    }
    //Método Constructor alternativo.
    public Tarjeta(int pin, String vencimiento, boolean estado){
        numTarjeta = (int)(Math.random()*10000000);
        setPin(pin);
        setVencimiento(vencimiento);
        setEstado(estado);
    }
    //Métodos mutadores.
    public void setnumTarjeta(int numTarjeta){
        this.numTarjeta = numTarjeta;
    }
    public void setPin(int pin){
        if ((pin>=1000)&(pin<=9999)){
            this.pin = pin;
        }
        else{
            System.out.println("El pin ingresado no es válido");
        }
    }
    public void setVencimiento(String vencimiento){
        this.vencimiento = vencimiento;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    //Métodos accesadores.
    public int getnumTarjeta(){
        return numTarjeta;
    }
    public int getPin(){
        return pin;
    }
    public String getVencimiento(){
        return vencimiento;
    }
    public boolean getEstado(){
        return estado;
    }
    //Método de impresión.
    public void printTarjeta(){
        System.out.println("Numero de Tarjeta: "+numTarjeta);
        System.out.println("Pin: "+pin);
        System.out.println("Fecha de Expiración: "+vencimiento);
        System.out.println("Estado de la Tarjeta: "+estado);
    }
}
