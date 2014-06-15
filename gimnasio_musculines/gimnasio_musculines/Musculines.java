
/**
 * Clase Musculines, Base de datos del gimnasio.
 * 
 * @author Sergio Matamala
 * @author Simon Morales
 * 
 * @version 12-04-2014
 */
public class Musculines
{
    //Atributos de la clase Musculines "Datos de clientes".
    private String rut_cliente,name,surname;
    private char sex;
    private int age,weekh,fee;
    private boolean state;
    
    //Métodos contructores de la clase Musculines.
    //Método constructor sin parámetros.
    public Musculines(){
        rut_cliente = "";
        name = "";
        surname = "";
        sex = 'M';
        age = 0;
        weekh = 0;
        fee = 0;
        state = false;
    }
    //Método constructor con parámetros.
    public Musculines(String rut_cliente, String name, String surname, char sex, int age, int weekh, int fee, boolean state){
        this.rut_cliente = rut_cliente;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.weekh = weekh;
        this.fee = fee;
        this.state = state;
    }
    
    //Métodos accesadores para cada atributo en la base de datos.
    public String getRut_Cliente(){
        return rut_cliente;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public char getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public int getWeekh(){
        return weekh;
    }
    public int getFee(){
        return fee;
    }
    public boolean getState(){
        return state;
    }
    
    //Método mutadores para los atributos de la base de datos.
    public void setRut_Cliente(String rut_cliente){
        this.rut_cliente = rut_cliente;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeekh(int weekh){
        this.weekh = weekh;
    }
    public void setFee(int fee){
        this.fee = fee;
    }
    public void setState(boolean state){
        this.state = state;
    }
    
    //Métodos de impresión para mostrar los datos de la base de datos.
    public void printMusculines(){
        System.out.println("Rut Cliente="+rut_cliente);
        System.out.println("Nombre="+name);
        System.out.println("Apellido="+surname);
        System.out.println("Genero="+sex);
        System.out.println("Edad="+age);
        System.out.println("Horas semanales="+weekh);
        System.out.println("Mensualidad="+fee);
        System.out.println("Estado de membresia="+state);
    }
    
    //Métodos customer para la clase Musculines.
    public int rebajar_fee(double porcentaje){
        fee = (int)(fee - (fee*porcentaje));
        return fee;
    }
    public String obtener_datos(){
        String datos;
        datos = (String)(name + " " + surname + " " + weekh);
        return datos;
    }
    public int obtener_horas(){
        int horas;
        horas = 10 - weekh;
        return horas;
    }
    
}
