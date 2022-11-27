#ifndef LESSON_MYSTORAGE_HPP
#define LESSON_MYSTORAGE_HPP

#include "IStorage.hpp"
#include <vector>
#include <cstring>
#include <iostream>

using namespace std;

template <typename Type>
class MyStorage: public IStorage<Type>
{
    vector<Type> * lst;

public:

    MyStorage(): IStorage<Type>(){
        this->lst = new vector<Type>();
    }

    ~MyStorage();

    virtual bool addData(const Type data);

    virtual void delData(const Type data);

    //virtual Type restoreData(const int index);
    virtual vector<Type> * restoreAllData();

};
/*
template <typename Type>
MyStorage<Type>::MyStorage(){
    this->data = new Type;
}*/

template <typename Type>
MyStorage<Type>::~MyStorage(){
    delete lst;
}

template <typename Type>
bool MyStorage<Type>::addData(const Type data){
    cout << "Add new data" << endl;
    lst->push_back(data);
    return true;
}

template <typename Type>
void MyStorage<Type>::delData(const Type data){
    for (auto it = lst->begin(); it <= lst->end(); it++) {
        if (*it == data){
            cout << "Del data" << endl;
            lst->erase(it);
            return;
        }
    }
    cout << "Data no find" << endl;
}

template <typename Type>
vector<Type> * MyStorage<Type>::restoreAllData(){
    return lst;
}

#endif //LESSON_MYSTORAGE_HPP
