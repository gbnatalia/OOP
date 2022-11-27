//
// Created by admin on 21.11.2022.
//

#ifndef LESSON_MESSAGER_STRUCT_H
#define LESSON_MESSAGER_STRUCT_H

#include <string>
using namespace std;

//enum UStatus{creator = 0, admin, user_chat};

typedef struct _USER_INFO{
    unsigned int ID;
    unsigned int IDChat;
    string userName;
    string userTelephone;
//    UStatus userStatus;

    bool operator==(_USER_INFO const & rhs) const {
        return (this->ID == rhs.ID);
    }
} USER_INFO;

typedef struct _CHAT_INFO{
    unsigned int ID;
    string       description;

    bool operator==(_CHAT_INFO const & rhs) const {
        return (this->ID == rhs.ID);
    }
}CHAT_INFO;

#endif //LESSON_MESSAGER_STRUCT_H
