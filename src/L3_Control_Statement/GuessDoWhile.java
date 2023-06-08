package L3_Control_Statement;
import java.util.Scanner;
public class GuessDoWhile {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char ch = 'S';
        char answer;
            System.out.println("Guess the letter in diapason A-Z");
            do {
                System.out.println("Enter it:");
                answer = myScanner.nextLine().charAt(0);
                if (answer != ch & answer != 'q') {
                    System.out.print("Sorry, but necessary letter is located ");
                    if (answer < ch)
                        System.out.println("the end of the alphabet.");
                    else System.out.println("the beginning of the alphabet.");
                    System.out.println("Want to retry? If not enter 'q'");
                } else if (answer == ch) System.out.println("Congrats!");
                else System.out.println("The answer is S.");
            } while (answer != ch && answer != 'q');

            System.out.println("Good bye!");
        }
    }

