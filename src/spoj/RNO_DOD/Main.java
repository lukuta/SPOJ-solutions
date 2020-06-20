package spoj.RNO_DOD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            int numbers = scan.nextInt();
            int sum = 0;
            for (int j = 0; j < numbers; j++) {
                sum += scan.nextInt();
            }
            System.out.println(sum);
        }
    }
}  