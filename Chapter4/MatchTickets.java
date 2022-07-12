package Chapter4;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int groupCount = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if(category.equals("VIP")){
            ticketPrice = 499.99;
        }else if(category.equals("Normal")){
            ticketPrice = 249.99;
        }

        double transportCost = 0;

        if(groupCount <= 4){
            transportCost = budget * 0.75;
        }else if(groupCount <= 9){
            transportCost = budget * 0.60;
        }else if(groupCount <= 24){
            transportCost = budget * 0.50;
        }else if(groupCount <= 49){
            transportCost = budget * 0.40;
        }else {
            transportCost = budget * 0.25;
        }

        double totalCost = groupCount * ticketPrice + transportCost;

        double diff = Math.abs(budget - totalCost);

        if(budget >= totalCost){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
