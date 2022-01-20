package NestedLoops.NestedLoopsMoreExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        for (int first = 1; first < n; first++) {
            for (int second = 1; second < n; second++) {
                for (int third = 97; third < 97 + l; third++) {
                    for (int fourth = 97; fourth < 97 + l; fourth++) {
                        for (int fifth = 1; fifth <= n; fifth++) {
                            if (fifth > first && fifth > second)
                                System.out.printf("%d%d%c%c%d ", first, second, third, fourth, fifth);
                        }
                    }
                }
            }
        }
    }
}
