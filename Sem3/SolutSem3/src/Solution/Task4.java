// Задание №4
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void Solutions4() {
        List<ArrayList<String>> catalog = new ArrayList<>();

        // Добавление жанров и книг в каталог
        addGenreAndBooks(catalog, "Фантастика", "Книга 1", "Книга 2", "Книга 3");
        addGenreAndBooks(catalog, "Детективы", "Книга 4", "Книга 5");
        addGenreAndBooks(catalog, "Романы", "Книга 6", "Книга 7", "Книга 8", "Книга 9");

        // Вывод каталога
        for (ArrayList<String> genreBooks : catalog) {
            String genre = genreBooks.get(0);
            System.out.println("Жанр: " + genre);
            for (int i = 1; i < genreBooks.size(); i++) {
                String book = genreBooks.get(i);
                System.out.println("- " + book);
            }
            System.out.println();
        }
    }

    public static void addGenreAndBooks(List<ArrayList<String>> catalog, String genre, String... books) {
        ArrayList<String> genreBooks = new ArrayList<>();
        genreBooks.add(genre);
        for (String book : books) {
            genreBooks.add(book);
        }
        catalog.add(genreBooks);
    }
}
