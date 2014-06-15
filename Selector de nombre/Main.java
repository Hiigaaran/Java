public class Main
{
    public static void main(String[] args){
        int contador;
        Selector select1;
        select1 = new Selector();
        contador = select1.Select();
        
        switch (contador)
        {
            case 1:
                System.out.println("1. 4m Games");
                break;
            case 2:
                System.out.println("2. Tesla Gaming");
                break;
            case 3:
                System.out.println("3. Leak Software");
                break;
            case 4:
                System.out.println("4. DayDream Games");
                break;
            case 5:
                System.out.println("5. RottenWitch Entertainment");
                break;
            case 6:
                System.out.println("6. GG Productions");
                break;
            case 7:
                System.out.println("7. Meridiano Software");
                break;
            case 8:
                System.out.println("8. Midnight Games");
                break;
            case 9:
                System.out.println("9. Adjetivo Entertainment");
                break;
            case 10:
                System.out.println("10. 4m Reality");
                break;
            default:
                break;
        }
    }
}
