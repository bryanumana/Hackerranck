package java.strings;

import java.util.Scanner;

public class Java_String_Reverse {

    public static String reverse(String A) {
        String rev = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            rev = rev + A.charAt(i);
        }

        return rev;
    }

    public static void palindrome (String srt, String rev){
        if(srt.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        palindrome(A, reverse(A));

    }
}
