
/**
 * Base de datos de las habitaciones.
 * 
 * @author Simón Morales
 * @author Dany Yañez
 * @version 02-06-2014
 */
public class Habitacion
{
    //Atributos principales de Habitación.
    private Paciente paciente1;
    private int num_habit;
    private char tipo_habit;
    private String ingreso;
    private int dias;
    //Constructor sin parámetros.
    public Habitacion(){
        paciente1 = new Paciente();
        num_habit = 0;
        tipo_habit = 'A';
        ingreso = "";
        dias = 0;
    }
    //Constructor con parámetros
    public Habitacion(Paciente paciente1, int num_habit, char tipo_habit, String ingreso, int dias){
        setPaciente1(paciente1);
        setNum_habit(num_habit);
        setTipo_habit(tipo_habit);
        setIngreso(ingreso);
        setDias(dias);
    }
    //Mutadores.
    public void setPaciente1(Paciente paciente1){
        this.paciente1 = paciente1;
    }

    public void setNum_habit(int num_habit){
        this.num_habit = num_habit;
    }

    public void setTipo_habit(char tipo_habit){
        if(tipo_habit == 'A' | tipo_habit == 'B' | tipo_habit == 'C'){
            this.tipo_habit = tipo_habit;
        }else{
            System.out.println("El tipo de habitación ingresado no es valido");
        }
    }

    public void setIngreso(String ingreso){
        this.ingreso = ingreso;
    }

    public void setDias(int dias){
        this.dias = dias;
    }
    //Accesadores
    public Paciente getPaciente1(){
        return paciente1;
    }

    public int getNum_habit(){
        return num_habit;
    }

    public char getTipo_habit(){
        return tipo_habit;
    }

    public String getIngreso(){
        return ingreso;
    }

    public int getDias(){
        return dias;
    }
    //Método de impresión.
    public void printHabitacion(){
        paciente1.printPaciente();
        System.out.println("Numero de Habitacion: "+num_habit);
        System.out.println("Tipo de Habitacion: "+tipo_habit);
        System.out.println("Fecha de ingreso: "+ingreso);
        System.out.println("Dias de Hospitalizacion: "+dias);
    }
    //Customer.
    public void Obtenerdatos(){
        System.out.println("Clinica Sanita");
        System.out.println("**************************");
        if(paciente1.getEstado() == true){
            System.out.println(""+num_habit+"   "+paciente1.getRut()+"   "+paciente1.getPeso()+"    Alta Médica");
        }else{
            System.out.println(""+num_habit+"   "+paciente1.getRut()+"   "+paciente1.getPeso()+"    Sin Alta Médica");
        }
    }
    public void Dar_alta(){
        if(paciente1.getEstado() == false){
            paciente1.setEstado(true);
        }
    }
    public int ObtenerDesc(int pago){
        if(tipo_habit == 'A' & dias >= 5 & paciente1.getEstado() == true){
            pago = (int)(pago*0.15);
        }
        return pago;
    }
    public boolean Obtener_ingreso(String fecha){
        boolean ver;
        if (fecha.equals(ingreso)){
            ver = true;
        }else{
            ver = false;
        }
        return ver;
    }
}
