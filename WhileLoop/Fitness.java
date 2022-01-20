package WhileLoop;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int proteinShakeCounter = 0;
        int proteinBarCounter = 0;
        double workoutCounter = 0;
        double proteinCouner = 0;
        for (int i = 1; i <= n; i++) {
            String activity = scanner.nextLine();
            switch (activity) {
                case "Back":
                    backCounter++;
                    workoutCounter++;
                    break;
                case "Chest":
                    chestCounter++;
                    workoutCounter++;
                    break;
                case "Legs":
                    legsCounter++;
                    workoutCounter++;
                    break;
                case "Abs":
                    absCounter++;
                    workoutCounter++;
                    break;

                case "Protein shake":
                    proteinShakeCounter++;
                    proteinCouner++;
                    break;
                case "Protein bar":
                    proteinBarCounter++;
                    proteinCouner++;
                            break;
            }
        }
        double workingoutPer = (workoutCounter * 100) / n;
        double proteinPer = (proteinCouner * 100) / n;
        System.out.printf("%d - back%n", backCounter);
        System.out.printf("%d - chest%n", chestCounter);
        System.out.printf("%d - legs%n", legsCounter);
        System.out.printf("%d - abs%n", absCounter);
        System.out.printf("%d - protein shake%n", proteinShakeCounter);
        System.out.printf("%d - protein bar%n", proteinBarCounter);
        System.out.printf("%.2f%% - work out%n", workingoutPer);
        System.out.printf("%.2f%% - protein%n", proteinPer);
    }
}
