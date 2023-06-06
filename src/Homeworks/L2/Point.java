package Homeworks.L2;
import java.util.Scanner;
public class Point {
    public static void main(String [] args){
        char ch = '.';
        char one;
        System.out.println("Ведите любой символ на клавиатуре и попробуйте угадать заданный");
        Scanner myScanner = new Scanner(System.in);
        one = myScanner.next().charAt(0);
        if (one==ch){
            System.out.println("Вы выбрали: " + ch + "\nВы угадали!");
        }else System.out.println("Вы не угадали.Попробуйте еще раз!");
    }
}
