// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Task1 {
    public static void Solutions1() {
        Random rnd = new Random(0);
        List<Integer> numL = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numL.add(rnd.nextInt());
        }
        System.out.println(numL);
        Collections.sort(numL);
    }
}
