import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task5 {
    // Напишите метод, который вернет содержимое текущей папки в виде
    // массива строк.
    // Напишите метод, который запишет массив, возвращенный предыдущим
    // методом в файл.
    // Обработайте ошибки с помощью try-catch конструкции. В случае
    // возникновения исключения, оно должно записаться в лог-файл.

    public static String[] getFolderContents() throws IOException {
        String folderPath = "."; // Текущая папка
        try {
            return Files.list(Paths.get(folderPath))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .toArray(String[]::new);
        } catch (IOException e) {
            throw new IOException("Ошибка при получении содержимого папки: " + e.getMessage());
        }
    }

    public static void writeToFile(String[] content, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            throw new IOException("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void writeToLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Ошибка при записи в лог-файл: " + e.getMessage());
        }
    }
}
