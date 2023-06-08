package L4_Methods;
import java.util.Scanner;
public class Sound {
    public static void main(String[] args) {
        calculateAndPrintDistance();
        double result = calculateAndReturnDistance(45);
        String my_string = "Distance, CALCULATED BY METHOD CALL, to the place of lightning strike is ";
        System.out.println("");
    }
    public static void calculateAndPrintDistance() {
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time passed between lighting and thunder of it:");
        float time = input.nextFloat();
        distance = time * 335;
        String my_string = "Distance to the place of lighting strike is";
        System.out.println(my_string + distance + "meters");
    }

        public static double calculateAndReturnDistance(float time) {
            double distance;
            distance = time * 335;
            return distance;
        }
}
