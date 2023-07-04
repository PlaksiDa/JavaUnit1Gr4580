// Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в Интернете и включить в проект)

package HashMapTest;

import java.util.Arrays;

public class Task7HW {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Поочередно извлекаем элементы из кучи и помещаем их в правильное место
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify для уменьшения размера кучи
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && array[left] > array[largest])
            largest = left;

        // Если правый потомок больше наибольшего элемента
        if (right < n && array[right] > array[largest])
            largest = right;

        // Если наибольший элемент не является корнем
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно применяем heapify к поддереву
            heapify(array, n, largest);
        }
    }

    public static void Solution2() {
        int[] array = {4, 10, 3, 5, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
