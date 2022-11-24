package Controller;

import Model.Messager.ChatInfo;
import Model.Messager.IMessager;

public class HandlerDelChat implements IHandlerAction<ChatInfo>{

    IMessager msgr;

    public HandlerDelChat(IMessager msgr){
        System.out.println("Создание обработчика удаления чата");
        this.msgr = msgr;
    }

    public void exec(ChatInfo data){
        System.out.println("Обработчик нажатия кнопки удаления чата");
        msgr.deleteChat(data);
    }
}
