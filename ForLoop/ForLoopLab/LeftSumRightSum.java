package ForLoop.ForLoopLab;

import java.util.Scanner;

public class LeftSumRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }
        int diff = Math.abs(leftSum - rightSum);
        if (diff == 0){
            System.out.printf("Yes, sum = %d", leftSum);
        }else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
