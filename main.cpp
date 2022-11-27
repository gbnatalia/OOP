
#include "MyMessanger.hpp"
#include <iostream>
using namespace std;

int main() {
    unsigned int num = 100;
    MyMessanger messanger;

    while (num != 10){
        cout << endl << "Select Action: " << endl;
        cout << "1 Create New Chat" << endl;
        cout << "2 Append New User" << endl;
        cout << "3 Delete User" << endl;
        cout << "4 Delete Chat" << endl;
        cout << "10 Exit" << endl;
        cout << "Select num actions: ";
        cin >> num;

        //stoi(const string& str, size_t *idx = 0, int base = 10);

        switch (num) {
            case 1: messanger.AddChatClick(); break;
            case 2: messanger.AddUserClick(); break;
            case 3: messanger.DelUserClick(); break;
            case 4: messanger.DelChatClick(); break;
            case 10: return 0;
            default:
                cout << "No Actions " << num << endl;
        }

    }

    return 0;
}
