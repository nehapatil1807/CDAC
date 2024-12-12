/*
typedef to define a struct for a 2D point (x, y) and
performs operations like distance calculation between two points.
 */
//
//#include<iostream>
//#include<math.h>
//typedef struct {
//	float x;
//	float y;
//}Point;
//
//float calculateDistance(Point p1, Point p2){
//	float d1 = p2.x - p1.x;
//	float d2 = p2.y - p1.y;
//	return sqrt(d1*d1 + d2*d2);
//}
//
//int main(){
//	Point p1{3.0, 4.0};
//	Point p2{6.0, 8.0};
//	float c = calculateDistance(p1, p2);
//	printf("Distance between two point : %.2f\n", c);
//}



#include <iostream>
using namespace std;

class Employee {
    char name[30];
    int id;
    int salary;

public:
    void acceptRecord() {
        cout << "Enter name: ";
        cin >> name;  // Using cin instead of scanf for C++ consistency
    }

    void printRecord() {
        cout << "Name: " << name << endl;
    }
};

int main() {
    Employee e;
    e.acceptRecord();
    e.printRecord();
    return 0;
}

