package spoj.BFN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            String number = String.valueOf(scan.nextInt());
            int counter = 0;

            while (!isPalindrome(number)) {
                number = sumToPalindrome(number);
                counter++;
            }

            System.out.println(number + " " + counter);
        }
    }

    private static boolean isPalindrome(String number) {
        for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static String sumToPalindrome(String numberStr) {
        int number = Integer.parseInt(numberStr);
        return String.valueOf(number + reverse(number));
    }

    private static int reverse(int number) {
        while (number % 10 == 0) {
            number /= 10;
        }

        int reversedNumber = 0;
        do {
            int onesDigit = number % 10;
            reversedNumber = reversedNumber * 10 + onesDigit;
            number /= 10;
        } while (number != 0);

        return reversedNumber;
    }
}