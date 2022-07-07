package Chapter2;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String currencyFrom = scanner.nextLine();
        String currencyTo = scanner.nextLine();

        double convertFrom = 0;
        double convertTo = 0;

        switch (currencyFrom){
            case "BGN":
                convertFrom = 1;
            break;
            case "USD":
                convertFrom = 1.79549;
            break;
            case "EUR":
                convertFrom = 1.95583;
            break;
            case "GBP":
                convertFrom = 2.53405;
            break;
        }

        switch (currencyTo){
            case "BGN":
                convertTo = 1;
                break;
            case "USD":
                convertTo = 1.79549;
                break;
            case "EUR":
                convertTo = 1.95583;
                break;
            case "GBP":
                convertTo = 2.53405;
                break;
        }

        double result = amount * convertFrom / convertTo;
        System.out.printf("%.2f %s", result, currencyTo);
    }
}
