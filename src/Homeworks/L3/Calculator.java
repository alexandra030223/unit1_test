package Homeworks.L3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        int a, b, sum;
        double avg;
        System.out.println("Ведите значение для а:");
        Scanner valueForA = new Scanner(System.in);
        a = valueForA.nextInt();
        System.out.println("Ведите значение для b:");
        Scanner valueForB = new Scanner(System.in);
        b = valueForB.nextInt();
        sum = a + b;
        System.out.println("Сумма " + a + " и " + b+ " равна: "+ sum);
        avg = sum/2;
        System.out.println("Среднее значение между " + a + " и " + b + " равно: " + avg);
        if(a<b){
            System.out.println(a + " меньше " + b);
        }else if (a>b){
            System.out.println(a + " больше " + b);
        }else if(a==b){
            System.out.println(a + " равно " + b);
        }
    }
}
