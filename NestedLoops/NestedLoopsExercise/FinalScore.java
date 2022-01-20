package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class FinalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double yearGrade = 0;
        double counter = 0;
        while (!presentationName.equals("Finish")){
            double sumGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                counter++;
                sumGrades += grade;
                yearGrade += grade;
            }
            double average = sumGrades / n;
            System.out.printf("%s - %.2f.%n", presentationName, average);
            presentationName = scanner.nextLine();
        }
        yearGrade = yearGrade / counter;
        System.out.printf("Student's final assessment is %.2f.", yearGrade);
    }
}
