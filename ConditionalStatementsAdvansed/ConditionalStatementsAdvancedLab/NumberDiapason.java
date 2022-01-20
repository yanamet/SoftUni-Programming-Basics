package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberDiapason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 100 || num > 200){
            if (num != 0){
            result = "invalid";}
        }
        System.out.println(result);
    }
}
