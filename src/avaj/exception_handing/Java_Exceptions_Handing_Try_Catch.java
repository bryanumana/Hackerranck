package avaj.exception_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exceptions_Handing_Try_Catch {
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
