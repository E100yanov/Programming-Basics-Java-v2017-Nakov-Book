package Chapter7;

import java.util.Scanner;

public class StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= n; k++) {
                for (int j = 0; j <= n; j++) {
                    for (int s = 0; s <= n; s++) {
                        for (int d = 0; d <= n; d++) {
                            int combinations = i + k + j + s + d;
                            if (combinations == n) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
