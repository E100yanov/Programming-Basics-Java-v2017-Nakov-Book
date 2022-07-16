package Chapter3;
import java.util.Scanner;
public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int fullTime = firstTime + secondTime + thirdTime;
        int minutes = fullTime / 60;
        int seconds = fullTime % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
