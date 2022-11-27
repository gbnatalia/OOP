#ifndef LESSON_MYCONTROLLER_HPP
#define LESSON_MYCONTROLLER_HPP

#include <vector>
#include <iostream>
#include "IStorage.hpp"

using namespace std;

class MyController {

    IStorage<CHAT_INFO> * storageChat = nullptr;
    IStorage<USER_INFO> * storageUser = nullptr;

private:
    CHAT_INFO findChat(unsigned int ID){

        vector<CHAT_INFO> * lst = storageChat->restoreAllData();
        for (auto el : *lst){
            cout << el.ID << " "<<  el.description << endl;
            if (el.ID == ID)
                return el;
        }

        CHAT_INFO chi;
        memmove(&chi, 0, sizeof(chi));
        return chi;
    }

    USER_INFO findUser(unsigned int ID){
        vector<USER_INFO> * lst =storageUser->restoreAllData();
        for (auto el : *lst){
            if (el.ID == ID)
                return el;
        }
        USER_INFO ui;
        memmove(&ui, 0, sizeof(ui));
        return ui;
    }

public:

    MyController(IStorage<CHAT_INFO> * storageChat, IStorage<USER_INFO> * storageUser){
        this->storageChat = storageChat;
        this->storageUser = storageUser;
    };

    void addChat(const CHAT_INFO& data, const USER_INFO& user){
        cout << "Add new chat "  << data.description << endl;
        storageChat->addData(data);
        this->addUser(user);
    }

    void delChat(unsigned int chatID){
        CHAT_INFO chat = findChat(chatID);
        if (chat.ID != 0){
            cout << "Delete chat "  << chat.description << endl;
            storageChat->delData(chat);
        }
        else {
            cout << "No Find chat with ID = "  << chatID << endl;
        }
    }

    void printChats(){
        vector<CHAT_INFO> * lst =storageChat->restoreAllData();
        cout << "List chats (ID, Description):" << endl;
        for (auto el : *lst){
            cout << el.ID << " " << el.description << endl;
        }
    }

    void addUser(const USER_INFO& data){
        cout << "Add new user " <<  data.userName << endl;
        storageUser->addData(data);
    }

    void delUser(const unsigned int userID){
        USER_INFO ui = findUser(userID);
        if (ui.ID != 0){
            cout << "Delete user "  << ui.userName << endl;
            storageUser->delData(ui);
        }
        else {
            cout << "No Find user with ID = "  << userID << endl;
        }
    }

    void printUsers(unsigned int IDChat){
        vector<USER_INFO> * lst =storageUser->restoreAllData();
        cout << "List users for chat with ID = " << IDChat << " (ID, Name, Telephone):" << endl;
        for (auto el : *lst){
            if (el.IDChat == IDChat)
                cout << el.ID << " "<< el.userName << " " << el.userTelephone << endl;
        }
    }
};


#endif //LESSON_MYCONTROLLER_HPP
