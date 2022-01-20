package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int first = 1; first <= 9; first++) {
            for (int secound = 1; secound <= 9; secound++) {
                for (int third = 1; third <= 9; third++) {
                    for (int fourth = 1; fourth <= 9; fourth++) {
                        if (n % first == 0 && n % secound == 0 && n % third == 0 && n % fourth == 0){
                            System.out.printf("%d%d%d%d ", first, secound, third, fourth);
                        }
                    }
                }
            }
        }
    }
}
