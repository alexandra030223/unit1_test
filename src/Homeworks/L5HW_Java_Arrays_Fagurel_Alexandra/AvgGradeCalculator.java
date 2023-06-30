package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;
import java.util.Scanner;
public class AvgGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int numberOfStudents = scanner.nextInt();

        int totalGrade = 0;
        int count = 0;

        while (count < numberOfStudents) {
            System.out.print("Введите оценку студента: ");
            int grade = scanner.nextInt();

            totalGrade += grade;
            count++;
        }

        double averageGrade = (double) totalGrade / numberOfStudents;

        System.out.println("Средний балл в группе: " + averageGrade);
    }
}
