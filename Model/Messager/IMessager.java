package Model.Messager;

import Model.Chat.UserInfo;

public interface IMessager {

    boolean createChat(ChatInfo chat);

    boolean deleteChat(ChatInfo chat);
}
