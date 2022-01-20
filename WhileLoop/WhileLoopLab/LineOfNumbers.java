package WhileLoop.WhileLoopLab;

import java.util.Scanner;

public class LineOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int line = 1;
        while (line <= n) {
            System.out.println(line);
            line = line * 2 + 1;
        }
    }
}
