// Задание №3
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из
// этого списка.

package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task7HW {
    public static void Solutions3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(15);
        numbers.add(3);
        
        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);
        double average = findAverage(numbers);
        
        System.out.println("Минимальное значение: " + minimum);
        System.out.println("Максимальное значение: " + maximum);
        System.out.println("Среднее значение: " + average);
    }
    
    // Находим минимальное значение в списке чисел
    // numbers список чисел
    // IllegalArgumentException если список пуст
    public static int findMinimum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        
        return Collections.min(numbers);
    }
    
    // Находим максимальное значение в списке чисел
    public static int findMaximum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        
        return Collections.max(numbers);
    }
    
    // Вычисляем среднее значение списка чисел
    public static double findAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.size();
    }
}
