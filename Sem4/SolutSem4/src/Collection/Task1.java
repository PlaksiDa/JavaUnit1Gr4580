// Задание №1
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

package Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void Solutions1() {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (или print~num для вывода и удаления): ");
            String input = scanner.nextLine();

            if (input.startsWith("print~")) {
                int num = Integer.parseInt(input.substring(6));
                if (num >= 0 && num < linkedList.size()) {
                    String output = linkedList.get(num);
                    linkedList.remove(num);
                    System.out.println("Вывод: " + output);
                } else {
                    System.out.println("Позиция num вне диапазона списка.");
                }
            } else {
                String[] parts = input.split("~");
                if (parts.length == 2) {
                    String text = parts[0];
                    int num = Integer.parseInt(parts[1]);
                    if (num >= 0 && num <= linkedList.size()) {
                        linkedList.add(num, text);
                        System.out.println("Строка добавлена в позицию " + num);
                    } else {
                        System.out.println("Позиция num вне диапазона списка.");
                    }
                } else {
                    System.out.println("Некорректный формат строки.");
                }
            }
        }
    }
}
