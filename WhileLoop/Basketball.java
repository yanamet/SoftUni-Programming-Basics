package WhileLoop;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basketballSum = Double.parseDouble(scanner.nextLine());
        double sneakers = basketballSum - (basketballSum * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = outfit / 4;
        double acsessories = ball / 5;
        double all = sneakers + outfit + ball + acsessories;
        System.out.printf("%.2f", basketballSum + all);
    }
}
