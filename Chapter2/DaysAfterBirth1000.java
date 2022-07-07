package Chapter2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DaysAfterBirth1000 {
    public static void main(String[] args) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner scan = new Scanner(System.in);
        LocalDate d = LocalDate.parse(scan.nextLine(),f);
        LocalDate d1 = d.plusDays(1000);
        System.out.println(f.format(d1));
    }
}
