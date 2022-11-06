import Sheduler.Sheduler;
import TaskDesc.TaskInfo;
import Tasks.Task;

import java.util.Date;
import java.util.HashMap;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args)
    {
        Sheduler sh = new Sheduler();
        sh.startWork();

        // формирование массива крайних дат окончания задачи
        Date[] dte = new Date[]{
                new Date(), new Date(), new Date(), new Date(), new Date(),
                new Date(), new Date(), new Date(), new Date(), new Date()
        };
        for (Date dt: dte) {
            long ms = dt.getTime();
            dt.setTime(ms + rnd(9) * 20_000);
            System.out.println(dt);
        }

        // добавление задач в планировщик
        for (int i = 0; i < dte.length; i++)
        {
            TaskInfo rec = new TaskInfo(dte[i], String.format("Задача %d", i+1));
            sh.addTask(rec);
            try {
                sleep(1000);
            }
            catch(InterruptedException e){
                System.out.printf("Прерывание основного потока\n");
            }
        }

        try {
            sleep(150_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sh.endWork();

        System.out.println("Конец работы!");
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

}