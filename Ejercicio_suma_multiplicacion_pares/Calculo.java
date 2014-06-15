public class Calculo
{
    private int x,y,z,k;
    public Calculo(int x,int y)
    {
        this.x=x;
        this.y=y;
        z=0;
        k=1;
    }
    public void determinarPAR()
    {
        if (x>y)
        {
            while (y<=x)
            {
                if (y%2==0)
                {
                    z=z+y;
                    k=k*y;
                }
                y=y+1;
            }
        }
        if (y>x)
        {
            while (x<=y)
            {
                if (x%2==0)
                {
                    z=z+x;
                    k=k*x;
                }
                x=x+1;
            }
        }
    }
    public void imprimirCalculo()
    {
        System.out.println("El resultado de la suma de los pares es: "+z);
        System.out.println("El resultado de la multiplicacion es: "+k);
    }
}
