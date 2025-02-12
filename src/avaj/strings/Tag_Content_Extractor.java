package avaj.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine()); // Read the number of lines

        // Process each line
        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            extractAndPrintValidContent(line);
        }

        scanner.close();
    }

    private static void extractAndPrintValidContent(String line) {
        // Regex to match valid tags and their content
        String regex = "<([^>]+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        boolean found = false;

        // Find all matches
        while (matcher.find()) {
            // Print the content between valid tags
            System.out.println(matcher.group(2).trim());
            found = true;
        }

        // If no valid content is found, print "None"
        if (!found) {
            System.out.println("None");
        }
    }
}