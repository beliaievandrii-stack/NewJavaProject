package lesson4;

import java.util.Arrays;

public class lesson4 {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        int summ = x + y;
        System.out.println(summ);

        int multyply = x * y;
        System.out.println(multyply);

        int diff = x - y;
        System.out.println(diff);

        double divide = (double) x / y;
        System.out.println(divide);

        int ext = x * x;
        System.out.println(ext);

        System.out.println("it was " + x);
        x = x + 100;
        System.out.println("and now = " + x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        int modul = x % y;
        System.out.println(modul);
    }
}
