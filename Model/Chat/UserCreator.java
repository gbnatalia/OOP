package Model.Chat;
import static Model.Chat.UStatus.user_chat;

public class UserCreator {
     private static UserCreator instance = null;
    UserInfo item;

    public static UserCreator getInstance(){
        if (instance == null){
            instance = new UserCreator();
        }
        instance.init();
        return instance;
    }

    private void init(){
        item =  new UserInfo();
        item.setUserName("Неизвестный");
        item.setUserTelephone("0(000)000-0000");
        item.setUserStatus(user_chat);
    }

    public UserInfo Create(){
        return item;
    }

    public UserCreator setUserName(String userName){
        item.setUserName(userName);
        return this;
    }

    public UserCreator setUserTelephone(String userTelephone){
        item.setUserTelephone(userTelephone);
        return this;
    }

    public UserCreator setUserStatus(UStatus userStatus){
        item.setUserStatus(userStatus);
        return this;
    }
}
