package Chapter4;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = {"Error", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", };
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 0 || number >= 8)
        {
            System.out.println("Error");
        }
        else
        {
            System.out.println(dayOfWeek[number]);
        }
    }
}
