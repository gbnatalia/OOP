package Model.Storage;


public class StorageTXT<T> implements IStorage<T>{

    /*Объект файла*/


    void StorageTXT(String fileName){

        /*Логика открытия файла*/
    }

    public boolean addData(T data){
        /*Логика сохранения в файл*/
        return true;
    }

    public boolean delData(T data){
        /*Логика удаления записи из файла*/
        return true;
    }

    public T restoreData(int index){
        /*Логика чтения записи из файла*/
        return null;
    }

}
