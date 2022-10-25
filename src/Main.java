import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        MemoryManager manager = new MemoryManager(10,rnd.nextInt(12, 18));

        VM virtualMemory = new VM();
        for(int i = 0; i < manager.tablePages.length; i++){
            virtualMemory.pages.add(new Page());
        }
        virtualMemory.Run(manager);


        for(int i = 0; i < manager.kolCells; i++){

        }



    }
}