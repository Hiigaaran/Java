
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
    private String rut; 
    private String nombres = "Juan Pedro"; 
    private String apellidoPaterno = "Perez";
    private String apellidoMaterno = "Del Transito"; 
    private String fechadeNacimiento = "29/2/1985";
    private String direccion;
    private int peso = 80;
    private double estatura = 1.85;
    private char sexo = 'H';
    
    public void imprimir_datos_estudiante(){
        String datos;
        datos = (String)(nombres + " " + apellidoPaterno + " " + apellidoMaterno + " " + peso + " " + estatura);
        System.out.println(""+datos);
    }
    
    public void aumentar_peso_estudiante(int x){
        this.peso = peso + x;
    }
    
    public void disminuir_estatura_estudiante(double y){
        this.estatura = estatura - y;
    }
    
    public int mostrar_peso_gr(){
        int gr;
        gr = peso * 1000;
        return gr;
    }
}
