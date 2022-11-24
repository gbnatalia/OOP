package Model.Storage;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> implements IStorage<T>{
    List<T> list = null;

    public Storage(){
        list = new ArrayList<T>();
    }

    public boolean addData(T data){
        if (list != null){
            list.add(data);
            System.out.println("Добавление в базу прошло успешно");
            return true;
        }
        else {
            System.out.println("Добавление в базу не удалось");
            return false;
        }
    }

    public boolean delData(T data){
        if (list != null){
            list.remove(data);
            System.out.println("Удаление из базы прошло успешно");
            return true;
        }
        else{
            System.out.println("Удаление из не удалось");
            return false;
        }
    }

    public T restoreData(int index){
        return list.get(index);
    }

}
