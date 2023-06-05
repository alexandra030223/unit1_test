package L2_Conditions_Loops;
import java.util.Scanner;
public class Guess {
    public static void main(String[]args){
//        if (condition){
//            sequence of operators
//        } else {
//            sequence of operators
//        }
        Scanner myScanner = new Scanner(System.in);
        char ch, answer = 'S';
        System.out.println("Guess the letter in diapason A-Z");
        System.out.println("Enter it:");
//        String input = myScanner.nextLine();
//        ch = input.toUpperCase().charAt(0); сделать нечувстильным к регистру
        ch = myScanner.nextLine().charAt(0);

        if(ch!=answer) {
            System.out.print("Sorry, but necessary letter is located ");}
            if (ch < answer)
                System.out.println("the end of the alphabet.");
            else System.out.println("the beginning of the alphabet.");
        }

    }

