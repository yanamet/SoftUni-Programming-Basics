package ForLoop.ForLoopLab;

import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
