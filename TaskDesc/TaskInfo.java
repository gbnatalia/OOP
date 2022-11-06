package TaskDesc;

import java.util.Date;

public class TaskInfo /*implements Comparable<TaskInfo>*/{
    Date        date_add;     // дата/время добавления записи
    Date        date_end;     // крайнее дата/время завершения задачи
    String description;       // описание задачи

    public TaskInfo(Date date_end, String description){
        date_add = new Date();
        this.date_end = date_end;
        this.description = description;
    }

    public Date getDate_add(){
        return date_add;
    }

    public Date getDate_end(){
        return date_end;
    }

    public String getDescription(){
        return description;
    }

    /*
    @Override
    public int compareTo(TaskInfo o) {
        int res = o1.getDate_end().compareTo(o2.getDate_end());
        if (res == 0)
            res =  o1.getDate_add().compareTo(o2.getDate_add());
        return res;
    }

    @Override
    public String toString() {
        return getDescription();
    }
     */
}