package WhileLoop;

import java.util.Scanner;

public class Jumping2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int targetHeight = Integer.parseInt(console.nextLine());
        int currentHeight = targetHeight-30;

        int count = 0;
        int countFails = 0;
        while (currentHeight<=targetHeight) {
            int attempt = Integer.parseInt(console.nextLine());
            count++;
            if (attempt > currentHeight) {
                currentHeight += 5;
                countFails=0;
                continue;
            }
            countFails++;
            if (countFails==3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, count);
                break;
            }
        }
        if (currentHeight > targetHeight) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", targetHeight, count);
        }
    }
}
