
/**
 * Clase Main de la Clinica
 * 
 * @author Simón Morales
 * @author Dany Yañez
 * @version 02-06-2014
 */
public class Main
{
    public static void main(String[] args){
        Paciente paciente1, paciente2;
        Habitacion habitacion1, habitacion2;
        
        paciente1 = new Paciente("17.819.265-5", 'M', 80, false);
        paciente2 = new Paciente("16.523.687-4", 'M', 62, true);
        
        habitacion1 = new Habitacion(paciente1, 214, 'B', "01-06-2014", 1);
        habitacion2 = new Habitacion(paciente2, 245, 'A', "25-05-2014", 8);
        
        paciente1.setPeso(85);
        System.out.println(paciente1.getPeso());
        
        System.out.println(habitacion2.ObtenerDesc(200000));
    }
}
