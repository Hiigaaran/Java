
/**
 * Creador de Certificados. 
 * 
 * @author Kadesh
 * @version 06-06-14
 */
public class Certificado
{
   //Atributos principales.
   private Persona persona1;
   private int codigocer;
   private String tipocer;
   private String emision;
   private int precio;
   
   //Constructor sin parámetros.
   public Certificado(){
       persona1 = new Persona();
       codigocer = 0;
       tipocer = "";
       emision = "";
       precio = 0;
    }
   
   //Constructor con parámetros.
   public Certificado(Persona persona1, int codigocer, String tipocer, String emision, int precio){
       setPersona1(persona1);
       setCodigocer(codigocer);
       setTipocer(tipocer);
       setEmision(emision);
       setPrecio(precio);
    }
   
   //Mutadores.
   public void setPersona1(Persona persona1){
       this.persona1 = persona1;
    }
   public void setCodigocer(int codigocer){
       this.codigocer = codigocer;
    }
   public void setTipocer(String tipocer){
       if (tipocer.equals("nacimiento") | tipocer.equals("matrimonio") | tipocer.equals("defuncion")){
           this.tipocer = tipocer;
        }else{
            System.out.println("El valor ingresado no es válido");
        }
    }
   public void setEmision(String emision){
       this.emision = emision;
   }
   public void setPrecio(int precio){
       this.precio = precio;
    }
   
   //Accesadores.
   public Persona getPersona1(){
       return persona1;
    }
    public int getCodigocer(){
        return codigocer;
    }
    public String getTipocer(){
        return tipocer;
    }
    public String getEmision(){
        return emision;
    }
    public int getPrecio(){
        return precio;
    }
    
    //Método impresor.
    public void printCertificado(){
        persona1.printPersona();
        System.out.println("Codigo del certificado: "+codigocer);
        System.out.println("Tipo de Certificado: "+tipocer);
        System.out.println("Fecha de emisión: "+emision);
        System.out.println("Precio de certificado: "+precio);
    }
    
    //Customers.
    public void mostrarDatos(){
        System.out.println(""+codigocer+" "+persona1.getRut()+" "+tipocer);
    }
    public void hacerDonante(){
        persona1.setDonante(true);
    }
    public boolean mostrarInfo(){
        boolean comprobador = false;
        if (persona1.getEdad() >= 18 & tipocer.equals("matrimonio")){
            comprobador = true;
        }
        return comprobador;
    }
    public void descontador(){
        if (tipocer.equals("defunsion")){
            precio =(int)(precio + precio*0.1);
        }
    }
    public void aumentarPrecio(int dinero){
        precio = precio + dinero;
    }
}
