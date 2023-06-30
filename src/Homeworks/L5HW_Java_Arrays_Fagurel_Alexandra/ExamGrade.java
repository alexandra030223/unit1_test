package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;
import java.util.Scanner;
public class ExamGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество набранных баллов: ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Оценка: " + grade);
    }
}

