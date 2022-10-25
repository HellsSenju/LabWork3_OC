import java.util.ArrayList;
import java.util.Arrays;

public class MemoryManager {
    public int kolCells;
    public int[] tablePages;
    public MemoryManager(int kolCells, int kolPages){
        this.kolCells = kolCells;
        tablePages = new int[kolPages];
        Arrays.fill(tablePages, -1);
    }

    public void RunLRU() //last recently used
    {
        //поиск странично


    }
}
