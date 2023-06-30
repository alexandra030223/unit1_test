package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;
import java.util.Scanner;
public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст:");
        int age = in.nextInt();

        System.out.print("Введите пол (M - мужской, F - женский): ");
        char gender = in.next().charAt(0);

        if (age < 65 && gender == 'F') {
            int yearsLeft = 65 - age;
            System.out.println("До выхода на пенсию осталось " + yearsLeft + " лет");
        } else if (age < 70 && gender == 'M' ){
            int yearsLeft = 70 - age;
            System.out.println("До выхода на пенсию осталось " + yearsLeft + " лет");
        }else if(age > 65 && gender == 'F'){
            int yearsAgo = age - 65;
            System.out.println("Вы вышли на пенсию " + yearsAgo + " лет назад");
        }else if(age > 70 && gender == 'M'){
            int yearsAgo = age - 70;
            System.out.println("Вы вышли на пенсию " + yearsAgo + " лет назад");
        }
    }
}
