package L1_Java_Primitives_Operatons;

import java.util.Scanner;
public class Sound {
    public static void main(String[] args){
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time passed between lighting and thunder of it:");

        float time= input.nextFloat();

        distance = time * 335;

        String my_string = "Distance to the place of lighting strike is";

        System.out.println(my_string + distance + "meters");
    }
}
