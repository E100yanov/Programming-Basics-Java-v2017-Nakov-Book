package Chapter3;
import java.util.Scanner;
public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine().toLowerCase();
        String text2 = scanner.nextLine().toLowerCase();

        if(text1.equals(text2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
