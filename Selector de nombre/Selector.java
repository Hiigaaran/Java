

public class Selector
{
    private int select;
    public Selector(){
        select = 0;
    }
    public int Select(){
            select = (int)(Math.random()*9+1);
            return select;
    }
}
