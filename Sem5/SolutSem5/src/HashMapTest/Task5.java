// Задание №5
// Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг
// прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
// одинаковой длиной не должны “потеряться”.

package HashMapTest;

import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    public static void sortByLength(String[] strings) {
        Map<Integer, String> lengthToStringMap = new TreeMap<>();

        for (String str : strings) {
            int length = str.length();
            String value = lengthToStringMap.getOrDefault(length, "");
            lengthToStringMap.put(length, value + str + " ");
        }

        for (String str : lengthToStringMap.values()) {
            String[] words = str.trim().split("\\s+");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }

    public static void Solution5() {
        String[] strings = {
                "Мороз и солнце день чудесный",
                "Еще ты дремлешь друг прелестный",
                "Пора красавица проснись"
        };

        sortByLength(strings);
    }
}
