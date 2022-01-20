package NestedLoops.NestedLoopsMoreExercise;

import java.util.Scanner;

public class WeddingChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isOver = false;
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                counter++;
                System.out.printf("(%d <-> %d) ", i, j);
                if (counter == tables) {
                    isOver = true;
                    break;
                }
            }
            if (isOver){
                break;
            }
        }


    }
}
