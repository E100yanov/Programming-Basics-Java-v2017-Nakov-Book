package Chapter5;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int periodOfTime = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int checkedPatients = 0;
        int uncheckedPatients = 0;

        for(int i = 1; i <= periodOfTime; i++ ){
            int patients = Integer.parseInt(scanner.nextLine());

            if(i % 3 == 0 && uncheckedPatients > checkedPatients){
                doctors++;
            }
            if(patients <= doctors){
                checkedPatients += patients;
            }else {
                uncheckedPatients += patients - doctors;
                checkedPatients += doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", checkedPatients);
        System.out.printf("Untreated patients: %d.", uncheckedPatients);
    }
}
