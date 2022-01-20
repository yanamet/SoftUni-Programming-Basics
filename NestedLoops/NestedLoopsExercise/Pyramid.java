package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        boolean isOver = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf ("%d ", number);
                number++;
                if (number > n){
                    isOver = true;
                    break;
                }

            }

            if (isOver){
                break;
            }
            System.out.println();
        }
    }
}
