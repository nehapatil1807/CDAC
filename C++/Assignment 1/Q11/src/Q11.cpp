/*
 c++ program  that declares a class with public, private, and protected access
specifiers. Demonstrate how access specifiers control access to members.
 */

#include <iostream>
using namespace std;

class MyClass {

private:
    int privateVar;

protected:
    int protectedVar;

public:
    MyClass(int p, int pr) {
        privateVar = p;
        protectedVar = pr;
    }

    void display() {
        cout << "Private Variable: " << privateVar << endl;
        cout << "Protected Variable: " << protectedVar << endl;
    }

    void setPrivateVar(int p) {
        privateVar = p;
    }
};


int main() {
    MyClass obj(10, 20);

    obj.display();

    obj.setPrivateVar(30);
    obj.display();
    return 0;
}



