package Model.Messager;

import Model.Chat.UserInfo;
import Model.Storage.Storage;

public class ChatInfo {

    private int         ID;
    private String      chatDescription;
    private UserInfo    userCreator;

    public void setID(int ID) {this.ID = ID;}
    public int getID(){return ID;}

    public void setChatDescription(String chatDescription) {this.chatDescription = chatDescription;}
    public String getChatDescription(){return chatDescription;}

    public void setUser(UserInfo user) {this.userCreator = user;}
    public UserInfo getUser(){return userCreator;}

}
