package Chapter4;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String food = sc.nextLine();

        switch (food){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
            case "vegetable":
                System.out.println("vegetable");break;
            default:
                System.out.println("unknown");break;
        }
    }
}
