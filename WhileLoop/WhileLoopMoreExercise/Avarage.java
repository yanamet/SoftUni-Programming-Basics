package WhileLoop.WhileLoopMoreExercise;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            sum += num;
            counter ++;
        }
        System.out.printf("%.2f", sum / counter);
    }
}
