package L1_HM_Java_Fagurel_Alexandra;
import java.util.Scanner;
public class GalToLit {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write a gallon number that you want to calculate to liters");
        double gallons;
        double liters;
        gallons = myScanner.nextDouble();
        liters = gallons * 3.7854;
        System.out.println(gallons + " галлонам соответсвует " + liters + " литров");
    }
}
