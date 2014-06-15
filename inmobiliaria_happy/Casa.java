/**
 * Clase Casa del projecto Inmobiliaria Happy
 * 
 * @author Simon Morales 
 * @version 03.31.2014
 */
public class Casa
{
    //Conjunto de atributos de la clase CASA
    private String owner, color;
    private int habitaciones;
    private char tipocasa;
    private double preciocasa;
    private boolean sold;
    //Método Constructor sin parámetros de la clase CASA
    public Casa()
    {
        owner = "";
        habitaciones = 1;
        color = "";
        tipocasa = 'A';
        preciocasa = 0.0;
        sold = false;
    }
    //Método Constructor con parámetros de la clase CASA
    public Casa(String owner, int habitaciones, String color, char tipocasa, double preciocasa, boolean sold)
    {
        this.owner = owner;
        this.habitaciones = habitaciones;
        this.color = color;
        this.tipocasa = tipocasa;
        this.preciocasa = preciocasa;
        this.sold = sold;
    }
    //Accesadores de la clase CASA
    public String getOwner()
    {
        return owner;
    }

    public String getColor()
    {
        return color;
    }

    public int getHabitaciones()
    {
        return habitaciones;
    }

    public char getTipoCasa()
    {
        return tipocasa;
    }

    public double getPrecioCasa()
    {
        return preciocasa;
    }

    public boolean getSold()
    {
        return sold;
    }
    //Mutadores de la clase CASA
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setHabitaciones(int habitaciones)
    {
        this.habitaciones = habitaciones;
    }
    
    public void setTipoCasa(char tipocasa)
    {
        this.tipocasa = tipocasa;
    }
    public void setPrecioCasa(double preciocasa)
    {
        this.preciocasa = preciocasa;
    }
    public void setSold(boolean sold)
    {
        this.sold = sold;
    }
    public void ImprimirDatos()
    {
        System.out.println("El dueño es: "+owner);
        System.out.println("El color de la casa es: "+color);
        System.out.println("El numero de habitaciones de la casa es: "+habitaciones);
        System.out.println("El tipo de casa es: "+tipocasa);
        System.out.println("El precio de la casa es: "+preciocasa);
        System.out.println("¿Esta vendida la casa?: "+sold);
    }
    public void Incremento(double incremento)
    {
        preciocasa = preciocasa + (preciocasa*incremento);
    }
    public String obtenerDatos(){
        String datos;
        datos = owner + " " + tipocasa + " " + preciocasa;
        return datos;
    }
}
