import java.io.File;

public class Task6 {
    // Напишите метод, который определит тип (расширение) файлов из
    // текущей папки и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg
    
    public static void printFileExtensions() {
        File folder = new File(".");
        File[] files = folder.listFiles();

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String fileName = files[i].getName();
                    int extensionIndex = fileName.lastIndexOf('.');
                    if (extensionIndex != -1) {
                        String extension = fileName.substring(extensionIndex + 1);
                        System.out.println((i + 1) + " Расширение файла: " + extension);
                    } else {
                        System.out.println((i + 1) + " Расширение файла: ");
                    }
                }
            }
        }
    }
}
