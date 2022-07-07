package Chapter2;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetableCost = Double.parseDouble(scanner.nextLine());
        double fruitCost = Double.parseDouble(scanner.nextLine());
        int vegetableKg = Integer.parseInt(scanner.nextLine());
        int fruitKg = Integer.parseInt(scanner.nextLine());

        double costInEuro = ((vegetableKg * vegetableCost) + (fruitKg * fruitCost)) / 1.94;
        System.out.printf("%.2f", costInEuro);
    }
}
