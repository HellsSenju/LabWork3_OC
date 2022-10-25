import java.util.Random;

public class Page {
    public int appeal; //кол во обращений (изначально рандомное число)
    public String name;
    public Page(int ind)
    {
        Random rnd = new Random();
        appeal= rnd.nextInt(1,20);
        name = "Page#" + ind;
    }
}
