package WhileLoop;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherAmount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int price = 0;
        int ticketCounter = 0;
        int others = 0;

        while (!command.equals("End")) {
            if (command.length() > 8) {
                price = command.charAt(0) + command.charAt(1);
                voucherAmount -= price;
                if (voucherAmount >=0){
                ticketCounter++;}
            } else {
                price = command.charAt(0);
                voucherAmount -= price;
                if (voucherAmount >= 0){
                others++;}
            }
            if (voucherAmount < 0){

                break;
            }
            command = scanner.nextLine();
        }
        System.out.println(ticketCounter);
        System.out.println(others);
    }
}
