import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task8HW {
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
    // запишите в лог-файл.

    public static void bubbleSort(int[] array, String logFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath))) {
            int n = array.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }

                // Запись текущего состояния массива в лог-файл
                writer.write("Iteration " + (i + 1) + ": ");
                for (int num : array) {
                    writer.write(num + " ");
                }
                writer.newLine();

                // Если во время итерации не было обменов, то массив уже отсортирован
                if (!swapped) {
                    break;
                }
            }

            System.out.println("Результат записан в лог-файл: " + logFilePath);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
