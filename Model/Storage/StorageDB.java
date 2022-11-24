package Model.Storage;

public class StorageDB<T> implements IStorage<T>{

    /*Объект БД*/


    void StorageTXT(String fileName){

        /*Логика соединения с базой*/
    }

    public boolean addData(T data){
        /*Логика добавления записи в базу*/
        return true;
    }

    public boolean delData(T data){
        /*Логика удаления записи из базы*/
        return true;
    }

    public T restoreData(int index){
        /*Логика чтения записи из базы*/
        return null;
    }


}