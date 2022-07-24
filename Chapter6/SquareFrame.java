package Chapter6;
import java.util.Scanner;
public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++)
        {
            if (row == 1 || row == n)
            {
                System.out.print("+ ");
                for (int col = 1; col <= n - 2; col++)
                {
                    System.out.print("- ");
                }
                System.out.println("+");
            }
            else
            {
                System.out.print("| ");
                for (int col = 1; col <= n - 2; col++)
                {
                    System.out.print("- ");
                }
                System.out.println("|");
            }
        }
    }
}
