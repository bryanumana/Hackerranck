package java.introduction;

import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int polynomial = a;
            for (int j = 0; j < n; j++) {
                polynomial += Math.pow(2, j) * b;
                System.out.print(polynomial + " ");
            }
            System.out.println();

        }
    }
}
