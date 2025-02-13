package avaj.exception_handling;

import java.util.Scanner;

class MyCalculator {

    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Java_Exception_Handling {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        try {
            long result = calculator.power(n, p);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();
    }
}

