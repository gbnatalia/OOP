package Controller;

import Model.Chat.IModelChat;
import Model.Chat.UserInfo;
import Model.Messager.ChatInfo;
import Model.Messager.IMessager;

public class HandlerAddChat implements IHandlerAction<ChatInfo>{

    IMessager msgr;

    public HandlerAddChat(IMessager msgr){
        System.out.println("Создание обработчика создания чата");
        this.msgr = msgr;
    }

    public void exec(ChatInfo data){
        System.out.println("Обработчик нажатия кнопки создания чата");
        msgr.createChat(data);
    }
}
