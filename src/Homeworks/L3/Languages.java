package Homeworks.L3;
import java.util.Scanner;
public class Languages {
    public static void main(String [] args){
        int language;
        System.out.println("Write the number of language that you want to choose." +
                "\n1.English" +
                "\n2.Română " +
                "\n3.Русский " +
                "\n4.Français");
        Scanner chooseTheLanguage = new Scanner(System.in);
        language = chooseTheLanguage.nextInt();
        System.out.println("\n");
        switch (language){
            case 1:
                System.out.println("Hello! You chose English language");
                break;
            case 2:
                System.out.println("Bună ziua! Ați ales limba română");
                break;
            case 3:
                System.out.println("Добрый день! Вы выбрали русския язык");
                break;
            case 4:
                System.out.println("Bon après-midi! Vous avez choisi le français");
                break;
            default:
                System.out.print("Зaпpoc не найден.");
        }
    }
}
