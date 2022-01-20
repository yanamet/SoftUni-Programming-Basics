package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfyingGrades = Integer.parseInt(scanner.nextLine());
        int counterUnsGrades = 0;
        int numberOfProblems = 0;
        String lastProblem = "";
        boolean needsABreak = false;
        double sumGrade = 0;
        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            double score = Double.parseDouble(scanner.nextLine());
            lastProblem = command;
            sumGrade += score;
            if (score <= 4) {
                counterUnsGrades++;
            }
            if (counterUnsGrades >= unsatisfyingGrades) {
                needsABreak = true;
                break;
            }
            numberOfProblems++;
            command = scanner.nextLine();
        }

        double avarage = sumGrade / numberOfProblems;
        if (needsABreak){
            System.out.printf("You need a break, %d poor grades.", counterUnsGrades);
        }else {
            System.out.printf("Average score: %.2f%n", avarage);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
