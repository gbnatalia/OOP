//
// Created by admin on 25.11.2022.
//

#ifndef LESSON_USERCREATOR_H
#define LESSON_USERCREATOR_H

#include <iostream>
#include "messager_struct.h"

using namespace std;

class CreatorUser {

    unsigned int ID;
    static CreatorUser * instance;

public:

    static CreatorUser * getInstance() {
        if (instance == nullptr) {
            instance = new CreatorUser();
            instance->ID = 0;
        }
        return instance;
    }

    USER_INFO Create(unsigned int IDChat){

        USER_INFO ui;

        ui.ID = ++ID;
        ui.IDChat = IDChat;

        cout << "Input Name User: ";
        cin >> ui.userName;

        cout << "Input User Telephone: ";
        cin >> ui.userTelephone;

        //ui.userStatus = user_chat;

        return ui;
    }

};
CreatorUser* CreatorUser::instance= nullptr;

#endif //LESSON_USERCREATOR_H
