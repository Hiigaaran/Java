
/**
 * Base de Datos de personas
 * 
 * @author Kadesh       
 * @version 06-06-14
 */
public class Persona
{
    //Atributos Principales.
    private String rut;
    private char sexo;
    private int edad;
    private boolean donante;
    
    //Método Constructor sin parámetros.
    public Persona(){
        rut = " ";
        sexo = 'F';
        edad = 0;
        donante = false;
    }
    
    //Método constructor con parámetros.
    public Persona(String rut, char sexo, int edad, boolean donante){
        setRut(rut);
        setSexo(sexo);
        setEdad(edad);
        setDonante(donante);
    }
    
    //Mutadores
    public void setRut(String rut){
        if (rut.length() >= 8){
            this.rut = rut;
        }else{
            System.out.println("El valor ingresado no es válido");
        }
    }
    public void setSexo(char sexo){
        if (sexo == 'F' | sexo == 'M'){
            this.sexo = sexo;
        }else{
            System.out.println("El valor ingresado no es válido");
        }
    }
    public void setEdad(int edad){
        if (edad >= 0 & edad < 121){
            this.edad = edad;
        }else{
            System.out.println("El valor ingresado no es válido");
        }
    }
    public void setDonante(boolean donante){
        this.donante = donante;
    }
    
    //Accesadores
    public String getRut(){
        return rut;
    }
    public char getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getDonante(){
        return donante;
    }
    
    //Método de impresión.  
    public void printPersona(){
        System.out.println("Rut: "+rut);
        System.out.println("Sexo: "+sexo);
        System.out.println("Edad: "+edad);
        System.out.println("Donante: "+donante);
    }
}
