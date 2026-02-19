package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Geld;

        while (true){

            if (!scanner.hasNextInt()){
                    System.out.println("Das ist keine ganze Zahl!");
                    scanner.next();
                    continue;
            }

            Geld = scanner.nextInt();

            if (Geld < 20) {
                System.out.println("Zu wenig Geld!");
                continue;
            }
            break;

        }

        int breadPrice = 20;
        int moneyAfterShoping = Geld - breadPrice;
        int chaildMoney = moneyAfterShoping >= 50  ? 10 : 5;
        chaildMoney = moneyAfterShoping == 0 ? 0 : chaildMoney;
        System.out.println(chaildMoney);

    }
}
