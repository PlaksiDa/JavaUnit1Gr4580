import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    // Задание №4
    // Напишите метод, который составит строку, состоящую из 100
    // повторений слова TEST и метод, который запишет эту строку в
    // простой текстовый файл, обработайте исключения.

    public static String repeatWord(String word, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void writeToFile(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

}
