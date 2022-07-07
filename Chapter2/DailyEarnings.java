package Chapter2;
import java.util.Scanner;
public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDaysCount = Integer.parseInt(scanner.nextLine());
        double dollarsEarnedPerDay = Double.parseDouble(scanner.nextLine());
        double dollarToBGN = Double.parseDouble(scanner.nextLine());

        double dollarsEarnedPerMonth = dollarsEarnedPerDay * workDaysCount;
        double dollarsEarnedPerYear = (dollarsEarnedPerMonth * 14.5) * 0.75;    // 12 salaries + 2.5 bonus;  0.25% taxes
        double averageDollarsADay = dollarsEarnedPerYear / 365;
        double averageBGNADay = averageDollarsADay * dollarToBGN;
        System.out.printf("%.2f", averageBGNADay);
    }
}
