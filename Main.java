/*
Описать простую концепцию мессенджера позволяющего переписываться
некоторому количеству участников в общей группе\чате

В чате должена быть логика добавления и удаления участников.
Описывать логику с учетом с SOLID-принципов
 */

import Model.Chat.ChatCreator;
import Model.Chat.UStatus;
import Model.Chat.UserCreator;
import Model.Chat.UserInfo;
import Model.Messager.ChatInfo;

import static Model.Chat.UStatus.creator;
import static Model.Chat.UStatus.user_chat;

public class Main {
    public static void main(String[] args) {

        MyMessager myShed= new MyMessager();

        UserInfo user = UserCreator.getInstance().setUserName("Организатор").setUserStatus(creator).setUserTelephone("8(111)111-1111").Create();
        ChatInfo chat = ChatCreator.getInstance().setUserCreator(user).setChatDescription("Чат1").Create();

        myShed.createChatClick(chat);

        UserInfo user2 = UserCreator.getInstance().setUserName("Пользователь").setUserStatus(user_chat).setUserTelephone("8(222)222-2222").Create();
        ChatInfo chat2 = ChatCreator.getInstance().setUserCreator(user2).setChatDescription("Чат1").Create();

        myShed.addUserClick(chat2);

        myShed.delUserClick(chat2);


        myShed.deleteChatClick(chat);
    }

}