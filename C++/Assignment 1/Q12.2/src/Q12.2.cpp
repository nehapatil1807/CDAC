/*
typedef to define a struct for a 2D point (x, y) and
performs operations like distance calculation between two points.
*/
#include <iostream>
#include <string>
using namespace std;

class Employee {
    string name;
    int id;
    int salary;

public:
    void acceptRecord() {
        cout << "Enter name: ";
        getline(cin, name);
        cout << "Enter id: ";
        cin >> id;
        cin.ignore();
        cout << "Enter salary: ";
        cin >> salary;
    }

    void printRecord() {
        cout << "Name: " << name << endl;
        cout << "Id: " << id << endl;
        cout << "Salary: " << salary << endl;
    }
};

int main() {
    Employee e;
    e.acceptRecord();
    e.printRecord();
    return 0;
}
