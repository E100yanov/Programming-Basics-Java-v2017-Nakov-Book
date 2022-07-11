package Chapter3;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapePerSquare = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapeAmount = vineyard * grapePerSquare;
        double wineProduced = totalGrapeAmount * 0.40 /  2.5;

        double diff = Math.abs(wineProduced - wineNeeded);

        if(wineProduced >= wineNeeded){
            double dividedWine = diff / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(dividedWine));
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }
    }
}
