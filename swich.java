package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class swich {
    public static void main(String[] args) {

        System.out.println("Edit x");
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        while (true) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Deine Bedeutung enthält Buchstaben " + "Edit x");
                scanner = new Scanner(System.in);
            }
        }

        System.out.println("Edit y");
        while (true) {
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            } else {
                System.out.println("Deine Bedeutung enthält Buchstaben " + "Edit y");
                scanner = new Scanner(System.in);
            }
        }

        while (true) {
            System.out.println("Wählen Sie eine Operation aus + - : *");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+': {
                    int summ = x + y;
                    System.out.println("x + y = " + summ);
                    break;
                }

                case '-': {
                    int diff = x - y;
                    System.out.println("x - y = " + diff);
                    break;
                }

                case '*': {
                    int multyply = x * y;
                    System.out.println("x * y = " + multyply);
                    break;
                }

                case ':': {
                    while (true) {
                        if (y == 0) {
                            System.out.println("y = 0 Teilung unmöglich");
                            System.out.println("Edit y");

                            while (true) {
                                if (scanner.hasNextInt()) {
                                    y = scanner.nextInt();
                                    break;
                                } else {
                                    System.out.println("Deine Bedeutung enthält Buchstaben " + "Edit y");
                                    scanner = new Scanner(System.in);
                                }
                            }

                        } else {
                            double divide = (double) x / y;
                            System.out.println("x : y = " + divide);
                            break;
                        }
                    }
                    break;


                }
                default: {
                    System.out.println("Unbekannte Operation!");
                    continue;
                }
                case '>': {
                    if (x > y) {
                        System.out.println(x + " > " + y);
                    } else if (x < y) {
                        System.out.println(x + " < " + y);
                    } else {
                        System.out.println(x + " = " + y);
                    }
                }
            }
            break;
        }

    }
}