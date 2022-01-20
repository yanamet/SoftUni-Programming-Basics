package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean cakeIsOver = false;
        int cakePieces = a * b;
        while (!input.equals("STOP")){
            int currentPieces = Integer.parseInt(input);
            cakePieces -= currentPieces;
            if (cakePieces < 0){
                cakeIsOver = true;
                break;
            }
            input = scanner.nextLine();
        }
            if (cakeIsOver){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
            }else {
                System.out.printf("%d pieces are left.", cakePieces);
            }
    }

}
