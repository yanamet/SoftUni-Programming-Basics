package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());
        double sec = distance * secPerMeter;
        double oddTime = Math.floor(distance / 15);
        oddTime = oddTime * 12.50;
        double hisRecord = sec + oddTime;
        if (hisRecord < worldRecord)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", hisRecord);
        }else {
            hisRecord = hisRecord - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", hisRecord);
        }

    }
}
