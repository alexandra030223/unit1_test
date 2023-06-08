package Homeworks.L1;
import java.util.Scanner;
public class Sound {
        public static void main(String[] args){
            double dist;
            dist = 1100 * 7.2;
            System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " футов" );
            System.out.println();

            double eho;
            double time;
            System.out.println("Ведите время, через которое вы услышали эхо: ");
            Scanner soundTime = new Scanner(System.in);
            time = soundTime.nextDouble();
            eho = time/2;
            double dist2;
            dist2 = 1100 * eho;
            System.out.println("Расстояние до объекта " + "составляет " + dist2 + " футов" );
        }
    }

