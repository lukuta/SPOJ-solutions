package spoj.PA05_POT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            int base = scan.nextInt();
            int exponent = scan.nextInt();

            int onesDigit = calculatePowerOnesDigit(base, exponent);
            System.out.println(onesDigit);
        }
    }

    private static int calculatePowerOnesDigit(int base, int exponent) {
        int onesDigit = base % 10;
        if (onesDigit == 0 || onesDigit == 1 || onesDigit == 5 || onesDigit == 6) {
            return onesDigit;
        }

        int meaningExponent = exponent % 4 == 0 ? 4 : exponent % 4;
        int numb = onesDigit;
        for (int i = 1; i < meaningExponent; i++) {
            numb = (numb * onesDigit) % 10;
        }
        return numb;
    }
}  