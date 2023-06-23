import java.util.Scanner;

public class Task2 {
    public static void task2() {
        // Задание №2
        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbResult = new StringBuilder();

        sbResult.append(sb.charAt(0));

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) != sb.charAt(i + 1)) {
                sbResult.append(sb.charAt(i + 1));
            }
        }

        System.out.println(sbResult);
        scanner.close();
    }
}
