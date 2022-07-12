package Chapter4;
import java.util.Scanner;
public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());
        double daysToPlayVolleyball = holidays * 2.0 / 3 + weekendsHome + (48 - weekendsHome) * 3.0 / 4;

        if (year.equals("normal")) {
            System.out.printf("%.0f%n", Math.floor(daysToPlayVolleyball));
        } else {
            System.out.printf("%.0f%n", Math.floor(daysToPlayVolleyball * 1.15));
        }

    }
}
