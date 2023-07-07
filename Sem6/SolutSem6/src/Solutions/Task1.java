package Solutions;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main() {
        int[] array = generateRandomArray(1000);
        double uniquePercentage = calculateUniquePercentage(array);
        System.out.println("Процент уникальных чисел: " + uniquePercentage + "%");
    }

    // Метод для заполнения массива случайными числами от 0 до 24
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    // Метод для вычисления процента уникальных значений в массиве
    public static double calculateUniquePercentage(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        int uniqueCount = uniqueSet.size();
        double percentage = (double) uniqueCount * 100 / array.length;
        return percentage;
    }
}