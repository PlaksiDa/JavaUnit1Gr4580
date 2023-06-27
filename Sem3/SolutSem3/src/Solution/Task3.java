// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void Solutions3() {
        List<Object> list = new ArrayList<>();
        list.add("строка 1");
        list.add(10);
        list.add("строка 2");
        list.add(20);
        list.add("строка 3");

        // Проход по списку и удаление целых чисел
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof Integer) {
                iterator.remove();
            }
        }

        // Вывод списка после удаления целых чисел
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
