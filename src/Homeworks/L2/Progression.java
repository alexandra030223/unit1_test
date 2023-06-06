package Homeworks.L2;
import java.util.Scanner;
public class Progression {
    public static void main(String [] args){
        int first;
        int d;
        System.out.println("Ведите множитель для расчета геометрической прогрессии: ");
        Scanner progressionNumber = new Scanner(System.in);
        d = progressionNumber.nextInt();

        for(first = 1; first <= 1000; first=first*d){
            System.out.println(first);

        }
    }
}
