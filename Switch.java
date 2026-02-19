package leson7;

import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        System.out.println("Geben Sie bitte Ihres Zahl");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Schreiben Sie bitte richtige Zahl!!! ");
                scanner = new Scanner(System.in);
            }
            else {
                int resalt = scanner.nextInt();
                switch (resalt){
                    case 1 -> System.out.println("Montag");
                    case 2 -> System.out.println("Dienstag");
                    case 3 -> System.out.println("Mittwoch");
                    case 4 -> System.out.println("Donerstag");
                    case 5 -> System.out.println("Freitag");
                    case 6 -> System.out.println("Samstag");
                    case 7 -> System.out.println("Sontag");
                    default -> System.out.println("Ihre6 Zahl muss zwischen 1 und 7 liegen!!!");
                }
                break;
            }
        }
    }
}
