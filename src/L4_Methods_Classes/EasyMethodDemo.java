package L4_Methods;
import java.util.Scanner;
public class EasyMethodDemo {
    public static void main(String [] args) {
        int c =6;
        int d = -16;
        calculateSum();
        calculateSumWithArguments(c, d);
        calculateSumWithArguments(20, 17);
        int result = calculateSumWithArgumentsAndResult(3, 5);
        int result2 = calculateAndReturnSumEnterByUser();
    }
    public static void calculateSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
    public static void calculateSumWithArguments(int a, int b){
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
    public static int calculateSumWithArgumentsAndResult(int a, int b){
        int sum = a + b;
        System.out.println("Sum is " + sum);
        return a + b;
    }
    public static int calculateAndReturnSumEnterByUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        return calculateSumWithArgumentsAndResult(a, b);
    }
}
