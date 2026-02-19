package lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        char[] answer = {'O', 'd', 'e', 's', 'a'};
        char[] result = new char[answer.length];

        System.out.println("Where are you from Andrii?");
        Scanner scanner = new Scanner(System.in);
        String answer1 = new String(result);
        while (true) {
            System.out.print("Enter a letter: ");
            String edit = scanner.next();
            char ch = edit.charAt(0);
            boolean found = false;
            for (int i = 0; i < answer.length; i++) {
                if (ch == answer[i]) {
                    result[i] = ch;
                    found = true;
                }
            }
            if (!found){
                System.out.println("Try again");
            } else {
                answer1 = new String(result);
                System.out.println("Current progress: " + answer1);
            }
            if (Arrays.equals(answer, result)){
                System.out.println("You are win, die Antwort war: " + answer1);
                break;
            }
        }
    }
}