// Задание №1
// Реализовать алгоритм сортировки слиянием


package Solution;

public class Task5HW {
    public static void Solutions1() {
        int[] array = {5, 2, 9, 1, 3, 6, 4};
        
        System.out.println("Исходный массив:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nОтсортированный массив:");
        printArray(array);
    }
    
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        
        // Разделение массива на левую и правую части
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }
        
        mergeSort(left); // Рекурсивная сортировка левой части
        mergeSort(right); // Рекурсивная сортировка правой части
        
        merge(left, right, array); // Слияние отсортированных частей
    }
    
    public static void merge(int[] left, int[] right, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;
        
        // Слияние отсортированных частей
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        
        // Добавление оставшихся элементов из левой части (если есть)
        while (leftIndex < left.length) {
            array[arrayIndex] = left[leftIndex];
            leftIndex++;
            arrayIndex++;
        }
        
        // Добавление оставшихся элементов из правой части (если есть)
        while (rightIndex < right.length) {
            array[arrayIndex] = right[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
