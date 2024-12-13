
			#include<iostream>
			#include<cstring>
			using namespace std;

			class TollBooth{
			private:
				int totalVehicles;
				double totalRevenue;

			public:
				void reset(){
					totalVehicles = 0;
					totalRevenue = 0.0;
				}

				void vehiclePayingToll(int vehicleType, double tollAmount){
					 totalVehicles++;
					 totalRevenue += tollAmount;

					 char vehicle[30];
					 switch(vehicleType){
					 case 1:
						 strcpy(vehicle, "Standard Car");
						 break;

					 case 2:
						 strcpy(vehicle, "Truck");

						 break;

					 case 3:
						 strcpy(vehicle, "Bus");
						 break;
					 }
					 cout << vehicle << " has paid the toll of $" << tollAmount << endl;
				}

				int getTotalVehicles(){
					return totalVehicles;
				}

				double getTotalRevenue(){
					return totalRevenue;
				}
			};

			int main(){

				TollBooth t;
				int choice;

				const double CAR_TOLL = 2;
				const double TRUCK_TOLL = 5;
				const double BUS_TOLL = 10;

				do{
					cout << "1. Add a standard car and collect toll" << endl;
					cout << "2. Add a truck and collect toll" << endl;
					cout << "3. Add a bus and collect toll" << endl;
					cout << "4. Display total cars passed" << endl;
					cout << "5. Display total revenue collected" << endl;
					cout << "6. Reset booth statistics" << endl;
					cout << "7. Exit" << endl;
					cout << "Enter your choice : ";
					cin >> choice;

					switch(choice){
					case 1:
						t.vehiclePayingToll(1, CAR_TOLL);
						break;

					case 2:
						t.vehiclePayingToll(2, TRUCK_TOLL);
					    break;

					case 3:
						t.vehiclePayingToll(3, BUS_TOLL);
						break;

					case 4:
						cout << "Total vehicle passed : " << t.getTotalVehicles() <<endl;
						break;

					case 5:
						cout << "Total Revenue collected : " << t.getTotalRevenue() << endl;
					    break;

					case 6:
						t.reset();
						break;

					case 7:
						cout << "Exiting program, Thank You :)" << endl;
					}


				} while(choice != 7);

				return 0;
			}


