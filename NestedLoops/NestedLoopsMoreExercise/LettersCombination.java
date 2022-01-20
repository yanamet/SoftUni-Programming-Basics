package NestedLoops.NestedLoopsMoreExercise;

import java.util.Scanner;

public class LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String from = scanner.nextLine();
        String to = scanner.nextLine();
        String without = scanner.nextLine();
        int a = from.charAt(0);
        int b = to.charAt(0);
        int c = without.charAt(0);

        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i != c) {
                for (int first = a; first <= b; first++) {
                    for (int seco = a; seco <= b; seco++) {
                        for (int third = a; third <= b; third++) {
                            if (first != c && seco != c && third != c) {
                                System.out.printf("%c%c%c ", first, seco, third);
                                counter++;
                            }
                        }
                    }
                }

            }
            break;
        }
        System.out.print(counter);
    }
}
