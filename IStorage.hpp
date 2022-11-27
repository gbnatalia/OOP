#ifndef LESSON_ISTORAGE_HPP
#define LESSON_ISTORAGE_HPP
#include <vector>

using namespace std;
template<typename Type>
class IStorage{
public:
    virtual bool addData(const Type data) = 0;

    virtual void delData(const Type data) = 0;

    virtual  vector<Type> * restoreAllData() = 0;
};

#endif //LESSON_ISTORAGE_HPP
