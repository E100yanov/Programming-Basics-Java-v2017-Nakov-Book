package Chapter3;
import java.util.Scanner;
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double transportPrice = 0;

        if(kilometers < 20){
            switch (timeOfDay){
                case "day":
                    transportPrice = 0.79 * kilometers + 0.70;
                    break;
                case "night":
                    transportPrice = 0.90 * kilometers + 0.70;
                    break;
            }
        }else if(kilometers < 100){
            transportPrice = 0.09 * kilometers;
        }else {
            transportPrice = 0.06 * kilometers;
        }

        System.out.printf("%.2f", transportPrice);
    }
}
