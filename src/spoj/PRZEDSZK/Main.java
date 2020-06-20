package spoj.PRZEDSZK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            System.out.println(lcm(scan.nextInt(), scan.nextInt()));
        }

    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        int tmp = 1;
        while (b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }

        return tmp;
    }
}  