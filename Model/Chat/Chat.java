package Model.Chat;

import Model.Messager.ChatInfo;
import Model.Storage.IStorage;


public class Chat implements IModelChat{
    ChatInfo chi;
    IStorage<ChatInfo> storage = null;

    public Chat(IStorage<ChatInfo> storage){
        this.storage = storage;
    }

    public boolean addUser(ChatInfo chatInfo){

        if (storage != null){
            System.out.printf("Добавление пользователя \"" + chatInfo.getUser().getUserName() + "\" в чат\n");
            return storage.addData(chatInfo);
        }
        return false;
    }

    public boolean delUser(ChatInfo chatInfo){
        if (storage != null) {
            System.out.println("Удаление пользователя \"" + chatInfo.getUser().getUserName() + "\" из чата");
            return storage.delData(chatInfo);
        }
        return false;
    }

}
