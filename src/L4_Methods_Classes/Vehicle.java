package L4_Methods_Classes;
public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;

    Vehicle(int passengerValue, int fuelcapValue, int mpgValue){
        passenger = passengerValue;
        fuelcap = fuelcapValue;
        mpg = mpgValue;
    }
    Vehicle(){
    }
 void printRange(String name){
     System.out.println(name + " can  take "
             + passenger
             + "passengers to the distance of "
             + fuelcap * mpg + " miles");
 }
 int calculateRange(){
     return fuelcap * mpg;
 }
 void sitInTheVehicle(String myRandomParametersName) {
     int i;
     for (i = 0; i < 100; i++) {
         if (i == passenger) return;
         System.out.println("There is more place!" + myRandomParametersName + " !");
     }
 }
     static void myMethod(){
         int i;
         for(i = 0; i<10; i++){
             if (i==5) return;
             System.out.println(i);
         }
     }
     double calculateFuelVolume(int distance){
         return (double) distance / mpg;
     }
 }

