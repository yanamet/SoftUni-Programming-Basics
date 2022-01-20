package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        boolean volumeIsOver = false;
        String command = scanner.nextLine();
        int volume = a * b * h;
        while (!command.equals("Done")){
            int amountBoxes = Integer.parseInt(command);
            volume -= amountBoxes;
            if (volume < 0){
                volumeIsOver = true;
                break;

            }
            command = scanner.nextLine();
        }
        if (volumeIsOver){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
