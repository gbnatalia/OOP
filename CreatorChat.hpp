#ifndef LESSON_CREATORCHAT_HPP
#define LESSON_CREATORCHAT_HPP

#include <iostream>
#include "messager_struct.h"

using namespace std;

class CreatorChat {

    unsigned int ID;
    static CreatorChat * instance;

public:

    static CreatorChat * getInstance() {
        if (instance == nullptr) {
            instance = new CreatorChat();
            instance->ID = 0;
        }
        return instance;
    }

    // запрет присваивания
    void operator=(const CreatorChat &) = delete;

    CHAT_INFO  Create(){

        CHAT_INFO chi;
        chi.ID = ++ID;
        cout << "Input Chat Description: ";
        cin >> chi.description;
        return chi;
    }
};

CreatorChat* CreatorChat::instance= nullptr;

#endif //LESSON_CREATORCHAT_HPP
