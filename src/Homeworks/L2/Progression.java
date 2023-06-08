package Homeworks.L2;
import java.util.Scanner;
public class Progression {
    public static void main(String [] args){
        int first;
        int d;
        int last;
        System.out.println("Ведите множитель для расчета геометрической прогрессии: ");
        Scanner progressionNumber = new Scanner(System.in);
        d = progressionNumber.nextInt();
        System.out.println();
        if(d==0 | d==1){
            System.out.println("Множитель не может быть равен 0 или 1.");
            return;
        }
        System.out.println("Ведите число, до которого хотите рассчитать геометрическую прогрессию::");
        Scanner lastNumber = new Scanner(System.in);
        last = lastNumber.nextInt();
        System.out.println();

        System.out.println("Ведите число-первый член прогрессии:");
        Scanner firstMember = new Scanner(System.in);
        first = firstMember.nextInt();

        System.out.println();
        System.out.println("Расчет геометрической прогрессии с вашими даными:\n");
        for(; first <= last; first=first*d) {
            System.out.print(" ");
            System.out.print(first);
        }
    }
}
