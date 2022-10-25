import java.util.ArrayList;
import java.util.Random;

public class VM {
    public ArrayList<Page> pages;
    //идет обращение к страницам
    public void Run(MemoryManager manager){
        Random rnd = new Random();
        //обращение к рандомной странице
        int appealPage = rnd.nextInt(0, pages.size());
        System.out.println("Обращение к странице:  " + appealPage);
        //смотрим, есть ли страница в озу
        if(Check(appealPage, manager)){
            System.out.println("Страница :  " + appealPage + ",  В ОЗУ: " + manager.tablePages[appealPage]);
        }
        else{
            System.out.println("------------------------Страничное прерывание--------------------------");
            System.out.println("-----Производится отображение странцы на свободный страничный блок-----");

        }
    }

    public boolean Check(int appealPage, MemoryManager manager){
        if(manager.tablePages[appealPage] == -1) return false;
        return true;
    }
}
