package Chapter4;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee": price = 0.5;   break;
                    case "water": price = 0.8;    break;
                    case "beer": price = 1.2;     break;
                    case "sweets": price = 1.45;  break;
                    case "peanuts": price = 1.60; break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee": price = 0.4;   break;
                    case "water": price = 0.7;    break;
                    case "beer": price = 1.15;    break;
                    case "sweets": price = 1.3;   break;
                    case "peanuts": price = 1.50; break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee": price = 0.45;  break;
                    case "water": price = 0.7;    break;
                    case "beer": price = 1.1;     break;
                    case "sweets": price = 1.35;  break;
                    case "peanuts": price = 1.55; break;
                }
                break;
        }
        System.out.println(quantity*price);
    }
}