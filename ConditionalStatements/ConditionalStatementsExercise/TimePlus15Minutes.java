package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int hours =Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int allTime = hours * 60 + min + 15;
        int outputHours = allTime / 60;
        int outputMin = allTime % 60;
        if (outputHours > 23){
            outputHours = 0;
        }

        System.out.printf("%d:%02d", outputHours, outputMin);

    }
}
