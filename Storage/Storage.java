package Storage;

import java.util.List;


interface IStorage {
    void WriteData(TaskDesc.TaskInfo rec);

    TaskDesc.TaskInfo ReadData(int ind);

    List<TaskDesc.TaskInfo> ReadAll();
}

public class Storage implements IStorage {
    IStorage stor;

    public Storage(IStorage stor) {
        this.stor = stor;
    }

    public void WriteData(TaskDesc.TaskInfo rec) {
        stor.WriteData(rec);
    }

    public TaskDesc.TaskInfo ReadData(int ind) {
        return stor.ReadData(ind);
    }

    public List<TaskDesc.TaskInfo> ReadAll() {
        return stor.ReadAll();
    }
}
