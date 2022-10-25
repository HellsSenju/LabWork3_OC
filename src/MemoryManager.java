import java.util.ArrayList;
import java.util.Arrays;

public class MemoryManager {
    public Page[] DRAM; //размер - кол-во ячеек ОЗУ одного размера
    public MemoryManager(int kolCells){
        DRAM = new Page[kolCells];
        Print();
    }

    public void AddPage(Page page){
        for(int i = 0; i < DRAM.length; i++){
            if(DRAM[i] == null){
                DRAM[i] = page;
                Print();
                return;
            }
        }
        int minInd = 0, minAppeal = 100000;
        for(int i = 0; i < DRAM.length; i++){
            if(DRAM[i].appeal < minAppeal){
                minAppeal = DRAM[i].appeal;
                minInd = i;
            }
        }
        page.appeal++;
        System.out.println("====Страница : " + page.name + "(" + page.appeal + ")" +
                "  заместила " + DRAM[minInd].name + "(" + minAppeal + ")====");

        DRAM[minInd] = page;

        Print();
    }

    public void Print(){
        for(int i = 0; i < DRAM.length; i++){
            if(DRAM[i] == null) System.out.println("[" + i + "]" + " = null");
            else System.out.println("[" + i + "]" + " = " + DRAM[i].name + " кол-во обращений: " + DRAM[i].appeal);
        }
        System.out.println("---------------------------------------------------");
    }
}
