package Sheduler;
import TaskDesc.TaskInfo;
import Tasks.*;
import java.util.*;

public class Sheduler  {
    Timer timer;
    TimerTask timerTask;
    public Sheduler(){
        timerTask = new ContentSheduler();
    }

    //public void addTask(Thread task, TaskInfo t){
    public void addTask(TaskInfo t){
        ((ContentSheduler)timerTask).addTask(t);
    }

    public void startWork(){

        // стартуем TimerTask в виде демона
        timer = new Timer(true);

        // будем запускать каждые 11 секунд (11 * 1000 миллисекунд)
        timer.scheduleAtFixedRate(timerTask, 0, 11_000);

        System.out.println("TimerTask начал выполнение");
    }

    public void endWork(){
        timer.cancel();
        System.out.println("TimerTask прекращена");
    }
}
