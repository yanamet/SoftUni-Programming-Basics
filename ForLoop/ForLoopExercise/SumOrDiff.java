package ForLoop.ForLoopExercise;

import java.util.Scanner;

public class SumOrDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > max){
                max = num;
            }
            sum += num;

        }

        sum = sum - max;
        if (sum == max){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", sum);
        }else {
            int diff = (int) Math.abs(sum - max);
            System.out.printf("No%n");
            System.out.printf("Diff = %d", diff);
        }
    }
}
