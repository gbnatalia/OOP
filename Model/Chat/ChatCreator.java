package Model.Chat;

import Model.Messager.ChatInfo;

import static Model.Chat.UStatus.creator;
import static Model.Chat.UStatus.user_chat;

public class ChatCreator {
    private static ChatCreator instance = null;
    static public int  currentID = 0;
    ChatInfo item;

    public static ChatCreator getInstance(){
        if (instance == null){
            instance = new ChatCreator();
        }
        instance.init();
        return instance;
    }

    private void init(){
        item =  new ChatInfo();
        item.setID(++currentID);
        item.setChatDescription("Без описания");
        item.setUser(UserCreator.getInstance().setUserStatus(creator).Create());
    }

    public ChatInfo Create(){
        return item;
    }

    public ChatCreator setChatDescription(String chatDescription){
        item.setChatDescription(chatDescription);
        return this;
    }

    public ChatCreator setUserCreator(UserInfo userCreator){
        item.setUser(userCreator);
        return this;
    }
}