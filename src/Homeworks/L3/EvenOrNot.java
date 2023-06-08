package Homeworks.L3;
import java.util.Scanner;
public class EvenOrNot {
    public static void main(String[]args){
        int i;
        System.out.println("Ведите любое целое число:");
        Scanner evenOrNot = new Scanner(System.in);
        i = evenOrNot.nextInt();
        if((i%2)==0){
            System.out.println(i + "-это четное число");
        }else {
            System.out.println(i + "-это нечетное число");
        }
    }
}
