package Model.Chat;

import Model.Messager.ChatInfo;

public interface IModelChat{

    boolean addUser(ChatInfo user);

    boolean delUser(ChatInfo user);
}