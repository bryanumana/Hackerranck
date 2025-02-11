package java.introduction;

import java.io.*;
import java.util.Calendar;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }
}

public class Java_Data_And_Time {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\o.txt"))) {

            String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);
            int day = Integer.parseInt(firstMultipleInput[1]);
            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Result.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
