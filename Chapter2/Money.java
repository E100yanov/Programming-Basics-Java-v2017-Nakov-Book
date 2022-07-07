package Chapter2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoin = Double.parseDouble((scanner.nextLine()));
        double yoan = Double.parseDouble((scanner.nextLine()));
        double commissionPercent = Double.parseDouble(scanner.nextLine())/100;

        double bitcoinsInBGN = 1168 * bitcoin;
        double yoanToDollars = 0.15 * yoan;
        double yoanToBGN = yoanToDollars * 1.76;

        double resultInEuro = (bitcoinsInBGN + yoanToBGN) / 1.95;

        double total = resultInEuro - (commissionPercent * resultInEuro);

        System.out.println(total);
    }
}
