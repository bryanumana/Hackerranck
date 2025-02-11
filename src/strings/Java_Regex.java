package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Java_Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})$";
}

