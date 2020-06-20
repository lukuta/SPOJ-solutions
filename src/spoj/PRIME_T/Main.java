package spoj.PRIME_T;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            System.out.println(isPrime(scan.nextInt()));
        }
    }

    static String isPrime(int number) {
        if (number == 1) {
            return "NIE";
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "NIE";
            }
        }
        return "TAK";
    }
}  