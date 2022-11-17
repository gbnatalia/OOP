package Sheduler;

import TaskDesc.TaskInfo;
import Tasks.*;
import java.util.*;

/* enum PRIORITET {    LOW,    MEDIUM,    HIGH} */

public class ContentSheduler extends TimerTask {
    Queue<TaskInfo> queue;

    public ContentSheduler(){
        queue = new PriorityQueue<TaskInfo>(new TaskDesc.TaskComparator());
        //queue = new PriorityQueue<TaskInfo>();
    }

    public void addTask(TaskInfo t){
        queue.add(t);
    }

    @Override
    public void run()
    {
        //System.out.println("Старт TimerTask");
        // выборка следующего элемента из очереди
        // передача его в функцию запуска
        if (queue.isEmpty() == false){
            TaskInfo ti = queue.remove();
            Task task = new Task(ti);
            task.start();
        }
        //System.out.println("Конец TimerTask");
    }
}
