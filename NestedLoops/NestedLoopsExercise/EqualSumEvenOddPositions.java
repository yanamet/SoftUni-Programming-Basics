package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumEvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            int evenSum = 0;

            int oddSum = 0;
            int currentNum = i;
            for (int j = 1; j <= 6; j++) {
                int count = currentNum % 10;
                currentNum = currentNum / 10;
                if (j % 2 == 0) {
                    evenSum += count;
                } else {
                    oddSum += count;
                }
            }
            if (evenSum == oddSum) {

                System.out.print(i + " ");
            }

        }
    }
}
