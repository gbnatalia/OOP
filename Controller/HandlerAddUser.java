package Controller;

import Model.Chat.IModelChat;
import Model.Chat.*;
import Model.Messager.ChatInfo;

public class HandlerAddUser implements IHandlerAction<ChatInfo>{

    IModelChat chat;

    public HandlerAddUser(IModelChat chat){
        System.out.println("Создание обработчика добавления пользователя");
        this.chat = chat;
    }

    public void exec(ChatInfo data){
        System.out.println("Обработчик нажатия кнопки добавления пользователя");
        chat.addUser(data);
    }
}
