package L4_Methods;
public class VehicleDemo {
    public static void main(String [] args){

        Vehicle minivan; //Объявляем ссылочную пер
        minivan = new Vehicle(); //иницилизируем -выделяем память для
        Vehicle sportcar = new Vehicle();

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;

        System.out.println("Car2 passengers: "+ car2.passenger);
        System.out.println("Car1 passengers: "+ car1.passenger);

        car1.passenger = 7;
        System.out.println("Car2 passengers: "+ car2.passenger);
        System.out.println("Car1 passengers: "+ car1.passenger);

        car2.passenger = -100;
        System.out.println("Car2 passengers: "+ car2.passenger);
        System.out.println("Car1 passengers: "+ car1.passenger);

        minivan.passenger = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passenger = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        sportcar.printRange("Sportcar");
        minivan.printRange("Minivan");
        System.out.println("Just range for minivan: " + minivan.calculateRange());

        sportcar.sitInTheVehicle("Sportcar");
        minivan.sitInTheVehicle("Minivan");

        Vehicle.myMethod();
        System.out.println("Sportcar needs the following volume of fuel to go at the distance of " + "miles");
        System.out.println("Minivan needs the following volume of fuel to go at the distance of " + "miles");


    }
}
