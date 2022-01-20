package NestedLoops.NestedLoopsMoreExercise;

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int newNum = n;
        if (n > 10){
            newNum = 10;
        }
        for (int i = 1; i < newNum; i++) {
            for (int j = 1; j < newNum; j++) {
                for (int k = 1; k < newNum; k++) {
                    for (int l = 1; l < newNum; l++) {

                            if (i + j == k + l) {
                                if (n % (i + j) == 0){

                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                }
                            }

                    }
                }
            }
        }

    }
}
