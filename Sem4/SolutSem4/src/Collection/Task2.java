// Задание №2
//  Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private static List<String> memory = new ArrayList<>();

    public static void Solutions2() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Введите строку (print/revert для выполнения операции): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                printMemory();
            } else if (input.equalsIgnoreCase("revert")) {
                revertMemory();
            } else {
                rememberString(input);
            }
        }
    }

    private static void rememberString(String input) {
        memory.add(input);
    }

    private static void printMemory() {
        for (int i = memory.size() - 1; i >= 0; i--) {
            System.out.println(memory.get(i));
        }
    }

    private static void revertMemory() {
        if (!memory.isEmpty()) {
            memory.remove(memory.size() - 1);
            System.out.println("Предыдущая строка удалена из памяти.");
        } else {
            System.out.println("Память пуста.");
        }
    }
}
