package spoj.FCTRL3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            int nextInt = scan.nextInt();
            int reducedNumber = Math.min(nextInt, 10);
            int meaningDigits = factorial(reducedNumber) % 100;
            int onesDigits = meaningDigits % 10;
            int tensDigits = (meaningDigits / 10) % 10;

            System.out.println(tensDigits + " " + onesDigits);
        }
    }

    static int factorial(int numb) {
       return IntStream
                .rangeClosed(1, numb)
                .reduce(1, (prev, next) -> prev * next);
    }
}  