package NestedLoops.NestedLoopsLab;

import java.util.Scanner;

public class CombinationsNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int lastI = 0;
        int lastJ = 0;
        boolean magicSumIsFound = false;
        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                int result = i + j;
                counter++;
                if (result == magicNumber) {
                    magicSumIsFound = true;
                    lastI = i;
                    lastJ = j;
                    break;
                }

            }
            if (magicSumIsFound) {
                break;
            }
        }
        if (magicSumIsFound) {
            System.out.printf("Combination N:%d ", counter);
            System.out.printf("(%d + %d = %d)", lastI, lastJ, magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
