
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado
{
    private int codigoEmpleado;
    private int sueldo = 210000;
    private int edad = 20;
    
    public void aumentar_sueldo(double x){
        this.sueldo = (int)(sueldo + (sueldo*(x/100)));
    }
    
    public void aumentar_edad(){
        edad++;
    }
    
    public int mostrar_sueldo_tot(){
        double isapre, afp;
        afp = ((sueldo * 12)/100);
        isapre = ((sueldo * 7)/100);
        this.sueldo =(int)(sueldo - afp - isapre);
        return sueldo;
    }
}
