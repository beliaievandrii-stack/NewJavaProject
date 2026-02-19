package lesson4a;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Edit x");
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        while (true){
            if(scanner.hasNextInt()){
                x = scanner.nextInt();
               break;
            } else {
                System.out.println("Deine Bedeutung enthält Buchstaben " + "Edit x" );
                scanner = new Scanner(System.in);
            }
        }

        System.out.println("Edit y");
        while (true){
            if(scanner.hasNextInt()){
                y = scanner.nextInt();
                break;
            } else {
                System.out.println("Deine Bedeutung enthält Buchstaben " + "Edit y" );
                scanner = new Scanner(System.in);
            }
        }

        int summ = x + y;

        System.out.println("x + y = " + summ);

        int diff = x - y;
        System.out.println("x - y = " + diff);

        int multyply = x * y;
        System.out.println("x * y = " + multyply);

        int divide = x / y;
        System.out.println("x : y = " + divide);

        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y");
        }

    }
}
