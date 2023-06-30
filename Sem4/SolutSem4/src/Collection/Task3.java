// Задание №3
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 

package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    public static void Solutions3_1() {
        int[] array = {1, 2, 3, 4, 5};
        printStack(array);
    }

    public static void printStack(int[] array) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int element : array) {
            stack.push(element);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void Solutions3_2() {
        int[] array = {1, 2, 3, 4, 5};
        printQueue(array);
    }

    public static void printQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int element : array) {
            queue.offer(element);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
