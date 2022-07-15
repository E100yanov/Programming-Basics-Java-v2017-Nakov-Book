package Chapter7;

import java.util.Scanner;

public class StopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());

        if (0 <= n && n < m && m <= 10000 && s <= m) {
            for (int i = m; i >= n; i--) {
                if (i % 2 == 0 && i % 3 == 0) {
                    if (s == i) {
                        break;
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
