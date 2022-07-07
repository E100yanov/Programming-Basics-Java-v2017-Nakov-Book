package Chapter2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));
    }
}
