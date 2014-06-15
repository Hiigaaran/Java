
/**
 * Write a description of class Persona here.
 * 
 * @author Simon Morales
 * @version 2014.3.19
 */
public class Persona
{
    //atributos
    private String rut, nombre;
    private int edad;
    private double promedio;
    private char sexo; //'F': femenino, 'M': masculino
    private boolean evaluacion; //'true': Aprobado 'false': Reprobado
    //métodos
    public boolean validar_rut(String out)
    {
        if(rut.length() < 8)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    //método constructor sin parámetros
    public Persona()
    {
        rut = "";
        nombre = "";
        edad = 0;
        promedio = 0;
        sexo = 'M';
        evaluacion = false;
    }
    //método constructor con parametros
    public Persona(String rut, String nombre, int edad, double promedio, char sexo, boolean evaluacion)
    {
        this.rut = rut;                //El "this."sirve para distinguir entre clase y parametro, para la clase va this.rut y para el parametro va solo rut.
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
        this.evaluacion = evaluacion;
    }
    public void aumentar_edad()
    {
        edad = edad + 1;
    }
    //Accesadores 
    public String getRut()
    {
        return rut;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
    public double getPromedio()
    {
        return promedio;
    }
    public char getSexo()
    {
        return sexo;
    }
    public boolean getEvaluacion()
    {
        return evaluacion;
    }
    //Mutadores
    public void setRut(String rut)
    {
        this.rut = rut;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public void setPromedio(double promedio)
    {
        this.promedio = promedio;
    }
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    public void setEvaluacion(boolean evaluacion)
    {
        this.evaluacion = evaluacion;
    }
    //impresion
    public void printPersona()
    {
        System.out.println("El rut es: "+rut);
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El Sexo es: "+sexo);
        System.out.println("¿Esta Aprobado?"+evaluacion);
    }
    public void IncrementarEdad()
    {
        this.edad = edad +1;
    }
}
