
public class Main {
    public static void main(String[] args) {
        MemoryManager manager = new MemoryManager(4);
        int kol = 0;
        while(kol <= 20){
            manager.AddPage(new Page(kol));
            kol++;
        }
    }
}