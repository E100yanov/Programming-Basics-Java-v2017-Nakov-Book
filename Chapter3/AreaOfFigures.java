package Chapter3;
import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0;

        switch (figureType){
            case "square":
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            break;
            case "rectangle":
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
            break;
            case "circle":
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
            break;
            case "triangle":
            double sideOfTriangle = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (sideOfTriangle * height) / 2;
            break;
        }
        System.out.printf("%.3f", area);
    }
}
