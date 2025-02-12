package algorithms.data_structures;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        // Create a new list to store the reversed array
        List<Integer> reversedList = new ArrayList<>(a);
        // Use two pointers to swap elements from the start and end
        int left = 0;
        int right = reversedList.size() - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = reversedList.get(left);
            reversedList.set(left, reversedList.get(right));
            reversedList.set(right, temp);
            // Move the pointers towards the center
            left++;
            right--;
        }
        return reversedList;
    }
}

public class Arrays_DS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\array.txt"));

        // Read the number of elements in the array
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the array elements
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Reverse the array
        List<Integer> res = Result.reverseArray(arr);

        // Write the reversed array to the output
        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        // Close the resources
        bufferedReader.close();
        bufferedWriter.close();
    }
}