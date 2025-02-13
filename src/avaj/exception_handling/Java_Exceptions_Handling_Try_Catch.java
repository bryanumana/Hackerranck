package avaj.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exceptions_Handling_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int div = (x / y);
            System.out.println(div);
        }  catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
