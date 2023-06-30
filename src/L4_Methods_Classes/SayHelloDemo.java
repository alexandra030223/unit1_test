package L4_Methods_Classes;
import java.util.Scanner;
public class SayHelloDemo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        String result = constructHelloSentence(name, 6);
    }

    public static String constructHelloSentence(String name, int age) {
        String resultSentence = "Hello world! My name is " + name + "! I am " + age + " years old.";
        System.out.println(resultSentence);
        return resultSentence;
    }
}
