package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("[^A-Za-z]+");

        List<String> tokensFiltrados = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokensFiltrados.add(token);
            }
        }

        System.out.println(tokensFiltrados.size());

        for (String token : tokensFiltrados) {
            System.out.println(token);
        }

        scan.close();
    }

}
