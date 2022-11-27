#ifndef LESSON_MYMESSANGER_HPP
#define LESSON_MYMESSANGER_HPP

#include <algorithm>
#include "messager_struct.h"
#include "MyStorage.hpp"
#include "CreatorChat.hpp"
#include "CreatorUser.hpp"
#include "MyController.hpp"
#include "messager_struct.h"
#include "MyStorage.hpp"
#include "CreatorUser.hpp"
#include "CreatorChat.hpp"
#include "MyController.hpp"


class MyMessanger {

    MyStorage<CHAT_INFO> storCHI;
    MyStorage<USER_INFO> storUI;

    CreatorUser * uCreator;
    CreatorChat *chCreator;

    MyController * chatController;


    unsigned int SelectChat(){
        unsigned int IDChat;
        cout << "Select ID chat from list:" << endl;
        chatController->printChats();
        cout << "ID = " ;
        cin >> IDChat;
        return IDChat;
    }


public:

    MyMessanger(){
        chatController = new MyController(&storCHI, &storUI);
        chCreator = CreatorChat::getInstance();
        uCreator = CreatorUser::getInstance();
    }

    void AddChatClick() {
        cout << endl << "======= ADD CHAT ===== " << endl;

        // заполнение с помощью всплывающих окон информации по новому чату
        CHAT_INFO chi = chCreator->Create();
        USER_INFO user = uCreator->Create(chi.ID);

        // вызов функции контроллера для создания чата и регистрации его в хранилище
        chatController->addChat(chi, user);
        chatController->printChats();
    }

    void DelChatClick(){
        cout << endl << "======= DEL CHAT ===== " << endl;
        unsigned int IDChat = SelectChat();
        chatController->delChat(IDChat);
        chatController->printChats();
    }

    void AddUserClick(){

       unsigned int IDChat;
        cout << endl << "======= ADD USER ===== " << endl;
       try{
           unsigned int IDChat = SelectChat();
           USER_INFO user = uCreator->Create(IDChat);
           chatController->addUser(user);
           chatController->printUsers(IDChat);
       }
       catch(...){
           cout << "Вы ввели некорректные данные" << endl;
       }

    }

    void DelUserClick(){
        cout << endl << "======= DEL USER ===== " << endl;

        try {
            unsigned int IDChat = SelectChat();
            unsigned int IDUser;

            cout << "Select ID user from list:" << endl;
            chatController->printUsers(IDChat);
            cout << "ID = ";
            cin >> IDUser;
            chatController->delUser(IDUser);
            chatController->printUsers(IDChat);
        }
        catch(...){
            cout << "Вы ввели некорректные данные" << endl;
        }

    }
};


#endif //LESSON_MYMESSANGER_HPP
