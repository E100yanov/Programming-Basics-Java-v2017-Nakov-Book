package Chapter8;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bricks = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int volume = Integer.parseInt(scanner.nextLine());

        int kurs  =  volume*workers ;
        int needKursove = bricks/kurs;
        int needKursove2 = bricks%kurs;


        if (needKursove2!=0){
            needKursove++;
        }
        System.out.printf( "%d", needKursove) ;

    }
}
