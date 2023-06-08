package L3_ControlStatements;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args){
////        while (condition){
////            operator
////        }
//
//        char ch ='a';
//        System.out.println("With while");
//
//        while (ch <= 'z'){
//            System.out.print(ch);
//            ch++;
//        }
//        System.out.println("\n\nWith for:");
//        for (ch = 'a'; ch <= 'z';  ch++){
//            System.out.print(ch);
//        }
//        System.out.print(ch);
//
//        do{
//            ch--;
//            System.out.print(ch);
//        } while (ch >'z');

        Scanner in = new Scanner(System.in);
//        System.out.println("Enter condition");
//        boolean condition = in.nextBoolean();

        int m = 0;

        while(m > 0){
            System.out.println("Print it with while");
            m -=1;
        }
        char ch;
        do{
            System.out.println("Enter value of ch:");
            ch = in.nextLine().charAt(0);
        } while (ch != 'q');
    }
}
