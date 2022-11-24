package Controller;

import Model.Chat.IModelChat;
import Model.Messager.ChatInfo;

public class HandlerDelUser implements IHandlerAction<ChatInfo>{

    IModelChat chat;

    public HandlerDelUser(IModelChat chat){
        System.out.println("Создание обработчика удаления пользователя");
        this.chat = chat;
    }

    public void exec(ChatInfo data)
    {
        System.out.println("Обработчик нажатия кнопки удаления пользователя");
        chat.delUser(data);
    }
}