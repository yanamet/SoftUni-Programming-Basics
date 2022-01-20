package ForLoop.ForLoopLab;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        System.out.println("1");
        for (int i = 1; i <=n ; i++) {
            if (i % 2 == 0){
                result = (int) Math.pow(2, i);
                System.out.println(result);
            }
        }
    }
}
