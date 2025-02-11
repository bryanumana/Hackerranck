package java.introduction;

import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=1; i <= 10; i++){
            int m = n * i;
            System.out.println(n + " x " + i + " = " + m);
        }
    }
}
