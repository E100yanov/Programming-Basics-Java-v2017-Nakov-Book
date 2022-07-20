package Chapter5;
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());

            if(max < number){
                max = number;
            }
        }
        System.out.println(max);
    }
}
