// Задание №2
// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task6HW {
    public static void Solutions2() {
        List<Integer> numbers = generateRandomNumbers(10);

        System.out.println("Исходный список: " + numbers);

        removeEvenNumbers(numbers);

        System.out.println("Список после удаления четных чисел: " + numbers);
    }

    // Генерирует случайный список чисел.
    // count количество чисел в списке
    public static List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100)); // Генерация случайного числа от 0 до 99
        }

        return numbers;
    }

    // Удаляем четные числа из списка.
    // numbers список чисел
    public static void removeEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}