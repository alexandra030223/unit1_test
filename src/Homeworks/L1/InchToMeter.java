package Homeworks.L1;
public class InchToMeter {
    public static void main(String [] args){
        double inch, meter;
        int counter;
        counter = 0;
        for (inch = 1; inch <=100; inch++){
            meter = inch * 39.37;
            System.out.println(inch+ " дюймам соответсвует " + meter + " метра");
            counter++;
            if (counter==12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
