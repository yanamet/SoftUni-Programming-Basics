package WhileLoop;

import java.util.Scanner;

public class Jumping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedHeight = Integer.parseInt(scanner.nextLine());
        int height = wantedHeight - 30;
        int failedJumps = 0;
        int lastJump = 0;
        int total = 0;
        boolean heFailed = false;
        while (true) {
            int currentHeight = Integer.parseInt(scanner.nextLine());
            total++;
            if (currentHeight > height) {
                height += 5;
                failedJumps = 0;
            } else {
                failedJumps++;
            }
            lastJump = currentHeight;
            if (failedJumps == 3){
                heFailed = true;
                break;
            }
            if (currentHeight > wantedHeight){
                break;
            }
        }
        if (heFailed){
            System.out.printf("Tihomir failed at %dcm after %d jumps.", lastJump, total);
        }else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, total);
        }
    }
}

