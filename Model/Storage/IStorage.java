package Model.Storage;

public interface IStorage <T>{

    boolean addData(T data);

    boolean delData(T data);

    T restoreData(int index);
}
