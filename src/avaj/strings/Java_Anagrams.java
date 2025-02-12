package avaj.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean anagram = false;

        String a1 = a.replaceAll("\\s", "").toLowerCase();
        String b1 = b.replaceAll("\\s", "").toLowerCase();

        char[] caractersA1 = a1.toCharArray();
        char[] caractersB1 = b1.toCharArray();

        Arrays.sort(caractersA1);
        Arrays.sort(caractersB1);

        if (Arrays.equals(caractersA1, caractersB1)) {
            return anagram = true;
        }

        return anagram;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
