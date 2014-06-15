
/**
 * Write a description of class Celular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Celular
{
   private int numeroCelular = 91361928;
   private String compannia = "Amistar";
   private int valorPlan = 25990;
   private char activo = 'I';
   private int cantidadMinutos = 80;
   private int cantidadMensajes = 50;
   
   public String mostrar_info_plan(){
       String info;
       info = (String)(numeroCelular + " " + valorPlan);
       return info;
    }
    
   public void aumentar_minutos(int x){
       this.cantidadMinutos = cantidadMinutos + x;
    }
    
   public void aumentar_valorPlan(int y){
       this.valorPlan = valorPlan + y;
    }
    
   public void desactivar_cel(){
       activo = 'I';
    }
    
   public void reiniciar_cantmin(){
       //Al inicio del mes.
       cantidadMinutos = 0;
    }
    
    public double calcular_precio_min(){
        double pmin;
        pmin = (double)(valorPlan / cantidadMinutos);
        return pmin;
    }
    
    public void activar_celular(int x, int y){
        activo = 'A';
        valorPlan = y;
        cantidadMinutos = x;
    }
    
    public void incrementar_msg(){
        cantidadMensajes++;
    }
    
    public int obtener_tot_msg(int msg){
        int valormsg;
        valormsg = cantidadMensajes * msg;
        return valormsg;
    }
    
    public int calcular_tot_plan(int msg){
        int cashplan;
        cashplan = valorPlan + (cantidadMensajes * msg);
        return cashplan;
    }
}
