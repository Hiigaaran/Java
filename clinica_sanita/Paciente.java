
/**
 * Registro de Pacientes.
 * 
 * @author Simón Morales
 * @author Dany Yañez
 * @version 02-06-2014
 */
public class Paciente
{
    //Atributos principales de la clase.
    private String rut;
    private char sexo;
    private int peso;
    private boolean estado;
    
    //Constructor sin parámetros.
    public Paciente(){
        rut = "";
        sexo = 'F';
        peso = 0;
        estado = false;
    }
    //Constructor con parámetros.
    public Paciente(String rut, char sexo, int peso, boolean estado){
        setRut(rut);
        setSexo(sexo);
        setPeso(peso);
        setEstado(estado);
    }
    //Mutadores.
    public void setRut(String rut){
        if(rut.length()>=8){
            this.rut = rut;
        }else{
            System.out.println("El rut ingresado no es válido.");
        }
    }
    public void setSexo(char sexo){
        if(sexo == 'M' | sexo == 'F'){
            this.sexo = sexo;
        }else{
            System.out.println("El sexo ingresado no es válido");
        }
    }
    public void setPeso(int peso){
        if(peso>=1 & peso < 350){
            this.peso = peso;
        }else{
            System.out.println("El peso ingresado no es válido");
        }
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    //Accesadores.
    public String getRut(){
        return rut;
    }
    public char getSexo(){
        return sexo;
    }
    public int getPeso(){
        return peso;
    }
    public boolean getEstado(){
        return estado;
    }
    //Método de impresión.
    public void printPaciente(){
        System.out.println("Rut del paciente: "+rut);
        System.out.println("Sexo del paciente: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Estado de alta: "+estado);
    }
}
