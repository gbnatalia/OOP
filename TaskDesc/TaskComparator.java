package TaskDesc;

import java.util.Comparator;

// приоритет очереди определяется требуемым временем завершения задачи и
// опционно временем добавления задачи
//
public class TaskComparator implements Comparator<TaskInfo> {

    @Override
    public int compare(TaskInfo o1, TaskInfo o2) {
        int res = o1.getDate_end().compareTo(o2.getDate_end());
        if (res == 0)
            res =  o1.getDate_add().compareTo(o2.getDate_add());
        return res;
    }
}

