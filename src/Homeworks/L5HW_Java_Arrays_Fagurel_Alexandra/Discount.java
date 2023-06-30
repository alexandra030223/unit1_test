package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        while (true) {
            System.out.println("Enter the price of your goods or 0.0 to stop the program");
        double price = scanner.nextDouble();
        if (price == 0.0) {
            break;
        }
        sum += price;
    }
        double discount = 0;

        if (sum>= 1000.0 && sum<=10000.0){
            discount= 0.1;
        } else if (sum>=10000.0){
            discount= 0.2;

            double discountedAmount = sum - (sum * discount);
            if (discount > 0){
                double savedAmount = sum * discount;
                System.out.println("Congratulations! You have saved " + savedAmount + " $");
            }
        }else {
            double notEnoughAmount = 1000.0 - sum;
            System.out.println("Spend " + notEnoughAmount + " $ more to get the discount");
        }
    }
}
