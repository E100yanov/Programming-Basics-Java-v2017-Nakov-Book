package Chapter5;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());
        int ivanYears = 18;
        double expenses = 0;

        for(int i = 1800; i <= endYear; i++){
            if(i % 2 == 0){
                expenses += 12_000;
            }else {
                expenses += 12_000 + 50 * ivanYears;
            }
            ivanYears++;
        }
        double diff = Math.abs(inheritedMoney - expenses);
        if(inheritedMoney >= expenses){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff );
        }else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
