
/**
 * Clase Banco del Cajero Automático
 * 
 * @author Simon Morales
 * @version 01/06/2014
 */
public class Banco
{
    private String rutClient;
    private int numCuenta;
    private int Saldo;
    Tarjeta tarjeta1;

    //Método Constructor sin parámetros.
    public Banco(){
        rutClient = "";
        numCuenta = 0;
        Saldo = 0;
        tarjeta1 = new Tarjeta();
    }
    //Constructor con parámetros.
    public Banco(String rutClient, int numCuenta, int Saldo, Tarjeta tarjeta1){
        setRutClient(rutClient);
        setNumCuenta(numCuenta);
        setSaldo(Saldo);
        setTarjeta1(tarjeta1);
    }
    //Mutadores.
    public void setRutClient(String rutClient){
        if(rutClient.length()>=8){
            this.rutClient = rutClient;
        }
        else{
            System.out.println("El rut ingresado no es valido");
        }
    }
    public void setNumCuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }
    public void setSaldo(int Saldo){
        if(Saldo >=0){
            this.Saldo = Saldo;
        }else{
            System.out.println("El saldo ingresado no es valido");
        }
    }
    public void setTarjeta1(Tarjeta tarjeta1){
        this.tarjeta1 = tarjeta1;
    }
    //Accesadores.
    public String getRutClient(){
        return rutClient;
    }
    public int getNumCuenta(){
        return numCuenta;
    }
    public int getSaldo(){
        return Saldo;
    }
    public Tarjeta getTarjeta1(){
        return tarjeta1;
    }
    //Método de impresión.
    public void printBanco(){
        System.out.println("Rut del cliente: "+rutClient);
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Saldo de cuenta: "+Saldo);
        tarjeta1.printTarjeta();
    }
    //Métodos customers.
    public void imprimirDatos(){
        System.out.println(""+getRutClient()+"    "+getSaldo()+"    "+tarjeta1.getVencimiento());
    }
    public void desactivarTarjeta(){
        tarjeta1.setEstado(false);
    }
    public boolean autenticarTarjeta(String rut, int pin){
        boolean auth = false;
        if((rut.equals(rutClient))&(pin == tarjeta1.getPin())){
            auth = true;
        }else{
            auth = false;
        }
        return auth;
    }
    public void girarDinero(int giro){
        if(Saldo > giro){
            Saldo = Saldo - giro;
        }else{
            System.out.println("El saldo es insuficiente para el giro solicitado.");
        }
    }
    public void depositarDinero(int dinero){
        Saldo = Saldo + dinero;
    }
}
