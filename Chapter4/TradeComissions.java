package Chapter4;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sell = Double.parseDouble(scan.nextLine());
        double commission = 0;

        if ((!town.equals("Sofia") && !town.equals("Varna") && !town.equals("Plovdiv")) || sell < 0) {
            System.out.println("error");
        } else if ("Sofia".equals(town)) {

            if (sell >= 0 && sell <= 500) {
                commission = sell * 0.05;
            } else if (sell > 500 && sell <= 1000) {
                commission = sell * 0.07;
            } else if (sell > 1000 && sell <= 10000) {
                commission = sell * 0.08;
            } else if (sell > 10000) {
                commission = sell * 0.12;
            }
            System.out.printf("%.02f", commission);

        } else if ("Varna".equals(town)) {
            if (sell >= 0 && sell <= 500) {
                commission = sell * 0.045;
            } else if (sell > 500 && sell <= 1000) {
                commission = sell * 0.075;
            } else if (sell > 1000 && sell <= 10000) {
                commission = sell * 0.1;
            } else if (sell > 10000) {
                commission = sell * 0.13;
            }
            System.out.printf("%.02f", commission);

        } else if ("Plovdiv".equals(town)) {
            if (sell >= 0 && sell <= 500) {
                commission = sell * 0.055;
            } else if (sell > 500 && sell <= 1000) {
                commission = sell * 0.08;
            } else if (sell > 1000 && sell <= 10000) {
                commission = sell * 0.12;
            } else if (sell > 10000) {
                commission = sell * 0.145;
            }
            System.out.printf("%.02f", commission);

        }

    }
}
