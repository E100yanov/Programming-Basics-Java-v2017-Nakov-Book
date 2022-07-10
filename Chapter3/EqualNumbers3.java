package Chapter3;
import java.util.Scanner;
public class EqualNumbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        if(one == two && two == three){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
