// Задание №1
// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package HashMapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void Solution1() {
        String s1 = "foo";
        String t1 = "bar";
        System.out.println(isIsomorphic(s1, t1));  // false

        String s2 = "paper";
        String t2 = "title";
        System.out.println(isIsomorphic(s2, t2));  // true
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;  // Несоответствие маппинга
                }
            } else {
                if (usedChars.contains(charT)) {
                    return false;  // Буква t уже использована для другого маппинга
                }
                map.put(charS, charT);
                usedChars.add(charT);
            }
        }

        return true;
    }
}
