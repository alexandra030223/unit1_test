package Homeworks.L3;
import java.io.IOException;
public class Help2 {
    public static void main(String[] args) throws IOException {
        {
            char choice, ignore;
//            choice = '\0';
            do {
                System.out.println("Cпpaвкa:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while\n");
                System.out.print("Bыбepитe: ");
//                try {
                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
//                }catch (IOException e){
//                    System.out.println("Error of reading" + e.getMessage());
//                }
            } while (choice < '1' | choice > '5');
            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("Oпepaтop if:\n");
                    System.out.println("if(ycлoвиe) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("Oпepaтop switch:\n");
                    System.out.println("switch(выpaжeниe) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Oпepaтop for:\n");
                    System.out.print("for(инициaлизaция; условие; итерация)");
                    System.out.println(" оператор;");
                    break;
                case '4':
                    System.out.println("Oпepaтop while:\n");
                    System.out.println("while(ycлoвиe) оператор;");
                    break;
                case '5':
                    System.out.println("Oпepaтop do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие};");
                    break;
            }
        }
    }
}
