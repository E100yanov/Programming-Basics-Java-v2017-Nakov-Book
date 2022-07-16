package Chapter3;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        Double bonus = 0.0;
        if (points <= 100) {
            bonus = 5.0;
        } else if (points > 100 && points < 1000) {
            bonus = points * 0.2;
        } else if (points > 1000) {
            bonus = points * 0.1;
        }

        if (points % 2 == 0) {
            bonus += 1.0;
        } else if (points % 5 == 0) {
            bonus += 2.0;
        }

        System.out.println(bonus);
        System.out.println(bonus + points);

    }
}
