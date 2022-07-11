package Chapter3;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOffs = Integer.parseInt(scanner.nextLine());

        int dayOffsPlayTime = dayOffs * 127;
        int workDaysPlayTime = (365 - dayOffs) * 63;

        int totalPlayTime = dayOffsPlayTime + workDaysPlayTime;
        int aboveTheNorm = Math.abs(totalPlayTime - 30_000);
        int hours = aboveTheNorm / 60;
        int minutes = aboveTheNorm % 60;

        if(totalPlayTime > 30_000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
