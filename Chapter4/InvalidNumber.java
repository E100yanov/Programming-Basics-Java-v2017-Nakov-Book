package Chapter4;
import java.util.Scanner;
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean inRange = (num >= 100 && num <= 200) || num == 0;
        if (!inRange)
        {
            System.out.println("invalid");
        }
    }
}
