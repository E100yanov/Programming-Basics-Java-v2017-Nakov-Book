package Chapter1;
import java.util.Scanner;
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++){
            System.out.print("*");              // top
        }
        System.out.println();
        for(int i = 2; i <= n - 1; i++){        // mid
            System.out.print("*");
            for(int j = 2; j <= n - 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


        for(int i = 1; i <= n; i++){
            System.out.print("*");              // bottom
        }

    }
}
