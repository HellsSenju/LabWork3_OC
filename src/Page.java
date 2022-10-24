import java.util.Random;

public class Page {
    public int appeal; //кол во обращений (изначально рандомное число)
    public Page()
    {
        Random rnd = new Random();
        appeal= rnd.nextInt(0,20);
    }
}
