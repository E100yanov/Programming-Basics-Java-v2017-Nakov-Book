package Chapter5;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCargos = Integer.parseInt(scanner.nextLine());

        int totalCargoWeight = 0;
        int price = 0;
        int minibus = 0;
        int truck = 0;
        int train = 0;

        for(int i = 1; i <= numberOfCargos; i++){
            int cargoWeight = Integer.parseInt(scanner.nextLine());
            totalCargoWeight += cargoWeight;

            if(cargoWeight < 4){
                price += cargoWeight * 200;
                minibus += cargoWeight;
            }else if(cargoWeight < 12){
                price += cargoWeight * 175;
                truck += cargoWeight;
            }else {
                price += cargoWeight * 120;
                train += cargoWeight;
            }
        }

        double averagePrice = 1.0 * price / totalCargoWeight;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", 1.0 * minibus / totalCargoWeight * 100);
        System.out.printf("%.2f%%%n", 1.0 * truck / totalCargoWeight * 100);
        System.out.printf("%.2f%%", 1.0 * train / totalCargoWeight * 100);
    }
}
