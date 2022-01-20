package ForLoop.ForLoopExercise;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        double startingPoints = Double.parseDouble(scanner.nextLine());
        double avarageScore = 0.0;
        double winCounter = 0;
        double points = startingPoints;
        for (int i = 1; i <= tournamentsCount ; i++) {
            String position = scanner.nextLine();
            switch (position){
                case "W":
                    points += 2000;
                    avarageScore += 2000;
                    winCounter++;
                    break;
                case "F":
                    points += 1200;
                    avarageScore += 1200;
                    break;
                case "SF":
                    points += 720;
                    avarageScore += 720;
                    break;
            }
        }
        avarageScore = avarageScore / tournamentsCount;
        double winPer = (winCounter * 100) / tournamentsCount;
        System.out.printf("Final points: %.0f%n", points);
        System.out.printf("Average points: %.0f%n", Math.floor(avarageScore));
        System.out.printf("%.2f%%", winPer);


    }
}
