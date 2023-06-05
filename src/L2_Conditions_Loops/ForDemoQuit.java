package L2_Conditions_Loops;

import java.util.Scanner;
public class ForDemoQuit {
    public static void main(String[] args)
//            throws IOException
    {
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("To stop enter q");
        for (i = 0; i > -100; i++){
//        for (i = 0; System.in.read() !='q'; i++){

            char userInput = input.nextLine().charAt(0);
            System.out.println("Run nr." + i);
            if (userInput == 'q') i= -1000;
        }

        for (i=0; i < 10;){
            System.out.println("Run nr. " + i);
            i++;
        }
    }
}
