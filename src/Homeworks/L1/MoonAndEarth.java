package Homeworks.L1;
import java.util.Scanner;
public class MoonAndEarth {
    public static void main(String [] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Ведите вашу массу тела в кг:");
        double g = 9.8;
        double m;
        m = newScanner.nextDouble();
        double F;
        F = m * g;
        System.out.println("Ваша сила тяжести на Земле равна " + F + "Ньютон");
        double Fmoon;
        Fmoon = F * 0.17;
        System.out.println("Ваша сила тяжести на Луне равна " + Fmoon + "Ньютон");
    }
}

