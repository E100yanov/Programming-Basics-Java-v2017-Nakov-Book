package Chapter2;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtPlayground = Integer.parseInt(scanner.nextLine());
        double widthTile = Double.parseDouble(scanner.nextLine());
        double lenghtTile = Double.parseDouble(scanner.nextLine());
        int widthBench = Integer.parseInt(scanner.nextLine());
        int lengthBench = Integer.parseInt(scanner.nextLine());

        int totalSize = lenghtPlayground * lenghtPlayground;
        int benchSpace = widthBench * lengthBench;
        int playgroundSpace = totalSize - benchSpace;
        double tileSpace = widthTile * lenghtTile;
        double neededTiles = playgroundSpace * 1.0 / tileSpace;
        double neededTime = neededTiles * 0.2;

        System.out.printf("%.2f%n",neededTiles);
        System.out.printf("%.2f",neededTime);
    }
}
