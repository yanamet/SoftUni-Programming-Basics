package WhileLoop.WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double allGradesSum = 0;
        int count = 1;
        int failedTimes = 0;
        boolean failed = false;
        int n = 1;
        while (n <= 12){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4){
                count++;
                allGradesSum += grade;
                failedTimes = 0;
            }else {
                failedTimes ++;
            }
            if (failedTimes > 1) {
                failed = true;
                break;
            }
            n++;
        }
        double avarageScore = allGradesSum / 12;
        if (failed){
            System.out.printf("%s has been excluded at %d grade", name, count);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, avarageScore);
        }
    }
}
