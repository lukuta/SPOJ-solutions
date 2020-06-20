package spoj.FLAMASTE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        skipLine(scan);

        for (int i = 0; i < cases; i++) {
            String line = scan.nextLine();
            char[] chars = line.toCharArray();

            String transformedLine = transformLine(chars);

            System.out.println(transformedLine);
        }
    }

    private static void skipLine(Scanner scan) {
        scan.nextLine();
    }

    private static String transformLine(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        char lastChar = 0;
        int counter = 0;
        for (char currentChar : chars) {
            if (lastChar != currentChar) {
                appendCharSection(stringBuilder, lastChar, counter);
                lastChar = currentChar;
                counter = 1;
            } else {
                counter++;
            }
        }
        appendCharSection(stringBuilder, lastChar, counter);
        return stringBuilder.toString();
    }

    private static void appendCharSection(StringBuilder stringBuilder, char lastChar, int counter) {
        switch (counter) {
            case 0:
                break;
            case 1:
                stringBuilder.append(lastChar);
                break;
            case 2:
                stringBuilder.append(lastChar).append(lastChar);
                break;
            default:
                stringBuilder.append(lastChar).append(counter);
        }
    }
}