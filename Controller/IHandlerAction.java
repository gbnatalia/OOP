package Controller;

public interface IHandlerAction<T> {
    void exec(T data);
}
