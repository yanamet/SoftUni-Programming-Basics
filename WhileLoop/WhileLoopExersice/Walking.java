package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;
        int goal = 10000;

        while (totalSteps < goal){
        String input = scanner.nextLine();
            if (input.equals("Going home")){
                int homeSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += homeSteps;
                break;
            }
            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
        }

            if (totalSteps >= goal){
                System.out.printf("Goal reached! Good job!%n" +
                        "%d steps over the goal!", totalSteps - goal);
            }else {
                System.out.printf("%d more steps to reach goal.", goal - totalSteps);
            }

    }
}
