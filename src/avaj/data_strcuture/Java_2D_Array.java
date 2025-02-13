package avaj.data_strcuture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Leer la matriz 6x6
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Calcular la suma máxima de los hourglasses
        int maxSum = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible

        // Iterar sobre todas las posibles posiciones de hourglasses
        for (int i = 0; i < 4; i++) { // Filas
            for (int j = 0; j < 4; j++) { // Columnas
                // Calcular la suma del hourglass actual
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                // Actualizar la suma máxima
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        // Imprimir la suma máxima
        System.out.println(maxSum);
    }

}
