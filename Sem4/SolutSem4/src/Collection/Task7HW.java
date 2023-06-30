// 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Collection;

import java.util.LinkedList;

public class Task7HW<T> {
    private LinkedList<T> queue;

    public Task7HW() {
        queue = new LinkedList<>();
    }

    // Добавляет элемент в конец очереди с помощью метода addLast() класса LinkedList.
    public void enqueue(T element) {
        queue.addLast(element);
    }

    // Возвращает и удаляет первый элемент из очереди с помощью метода pollFirst() класса LinkedList.
    public T dequeue() {
        return queue.pollFirst();
    }

    // Возвращает первый элемент из очереди, не удаляя его, с помощью метода peekFirst() класса LinkedList.
    public T first() {
        return queue.peekFirst();
    }

    public static void Solutions2() {
        Task7HW<String> queue = new Task7HW<>();
        queue.enqueue("Элемент 1");
        queue.enqueue("Элемент 2");
        queue.enqueue("Элемент 3");

        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Извлеченный элемент: " + queue.dequeue());
        System.out.println("Первый элемент после извлечения: " + queue.first());
    }
}
