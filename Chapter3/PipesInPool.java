package Chapter3;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hoursAway = Double.parseDouble(scanner.nextLine());

        double pipe1Filled = pipe1 * hoursAway;
        double pipe2Filled = pipe2 * hoursAway;
        double totalAmountFilled = pipe1Filled + pipe2Filled;

        if(totalAmountFilled <= volume){

            double percentOfPoolFilled = totalAmountFilled / volume * 100;
            double percentPipe1Filled = pipe1Filled / totalAmountFilled * 100;
            double percentPipe2Filled = pipe2Filled / totalAmountFilled * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentOfPoolFilled, percentPipe1Filled, percentPipe2Filled);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursAway, totalAmountFilled - volume);
        }

    }
}
