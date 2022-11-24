package Model.Messager;

import Model.Chat.UserInfo;
import Model.Storage.IStorage;

public class Messager implements IMessager{

    IStorage<ChatInfo> storage = null;

    public Messager(IStorage<ChatInfo> storage){
        this.storage = storage;
    }

    public boolean createChat(ChatInfo chat){
        /* Логика создания чата:
        Правила создания чата
        Регистрация чата
        Регистрация пользователя - создателя чата
        */
        if (storage != null){
            System.out.printf("Добавление нового чата \"%s\" в базу чатов\n", chat.getChatDescription());
            return storage.addData(chat);
        }
        return false;
    }

    public boolean deleteChat(ChatInfo chat){
        /* Логика удаления чата*/
        if (storage != null) {
            System.out.printf("Удаление чата \"%s\" из базы\n", chat.getChatDescription());
            return storage.delData(chat);
        }
        return false;
    }
}
