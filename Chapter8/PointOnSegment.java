package Chapter8;

import java.util.Scanner;

public class PointOnSegment {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);

        int x1 = Integer.parseInt(scanners.nextLine());
        int x2 = Integer.parseInt(scanners.nextLine());
        int x = Integer.parseInt(scanners.nextLine());

        int dist1 = Math.abs(x1 - x);
        int dist2 = Math.abs(x2 - x);

        int distance = Math.min(dist1, dist2);

        if (x > Math.min(x1, x2) && x < Math.max(x1, x2)) {
            System.out.println("in");
            System.out.println(distance);
        } else {
            System.out.println("out");
            System.out.println(distance);
        }
    }
}
