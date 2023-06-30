package Collection;

public class Task9HW<T> {
    private Object[] stack;
    private int top;

    public Task9HW(int capacity) {
        stack = new Object[capacity];
        top = -1;
    }

    // Возвращает текущий размер стека, равный top + 1.
    public int size() {
        return top + 1;
    }

    // Проверяет, является ли стек пустым, путем проверки значения top.
    public boolean empty() {
        return top == -1;
    }

    // Добавляет элемент в стек. Если стек уже полон, выводится сообщение об ошибке "Stack overflow".
    public void push(T element) {
        if (top == stack.length - 1) {
            System.out.println("Стэк переполнен");
            return;
        }
        top++;
        stack[top] = element;
    }

    // Возвращает верхний элемент стека без его удаления. Если стек пустой, выводится сообщение "Stack is empty" и возвращается null.
    public T peek() {
        if (empty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        return (T) stack[top];
    }

    // Удаляет верхний элемент из стека путем присваивания null элементу stack[top] и уменьшает значение переменной top на 1 (top--).
    public T pop() {
        if (empty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        T element = (T) stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    public static void Solutions4() {
        Task9HW<Integer> stack = new Task9HW<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Размер стэка: " + stack.size());
        System.out.println("Верхний элемент: " + stack.peek());

        int poppedElement = stack.pop();
        System.out.println("Извлеченный элемент: " + poppedElement);
        System.out.println("Размер стэка после извлечения: " + stack.size());
    }
}
