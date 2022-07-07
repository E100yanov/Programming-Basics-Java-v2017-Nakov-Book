package Chapter2;
import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inches = ");
        double inch = Double.parseDouble(scanner.nextLine());
        double sm = inch * 2.54;
        System.out.println("Centimeters = " + sm);

    }
}
