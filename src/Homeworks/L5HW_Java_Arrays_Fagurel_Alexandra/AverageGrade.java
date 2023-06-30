package Homeworks.L5HW_Java_Classes_Fagurel_Alexandra;

import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        int[][] studentsGrade = new int[numberOfStudents][];
        double [] avgOfStudens = new double[numberOfStudents];
        int totalNrGrades = 0;
        double avg = 0;

        for (int i = 1; i<=numberOfStudents; i++){
            double avgPerStudedent = 0;
            System.out.println("Enter the number of grades for student Nr.: " + i);
            int numberOfGrades = in.nextInt();
            totalNrGrades += numberOfGrades;
            int[] individualGrades = new int[numberOfGrades];

            for (int j = 1; j<=numberOfGrades; j++) {
                System.out.println("Enter grade Nr.: " + j);
                individualGrades[j-1] = in.nextInt();
                avgPerStudedent += individualGrades[j-1];
                avg += individualGrades[j-1];
            }
            avgOfStudens[i-1] = avgPerStudedent / numberOfStudents;
            studentsGrade[i-1] = individualGrades;
        }
        avg /= totalNrGrades;
        System.out.println("Average per each student: ");
        for (double gr: avgOfStudens) {
            System.out.print(gr + " ");

        }
        System.out.println("\nTotal average is: " + avg);

    }
}
