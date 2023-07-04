// Задание №3
// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static final Map<Character, Integer> romanToArabicMap = createRomanToArabicMap();

    private static Map<Character, Integer> createRomanToArabicMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int convert(String romanNumber) {
        int arabicNumber = 0;
        int prevValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char currentChar = romanNumber.charAt(i);
            int currentValue = romanToArabicMap.get(currentChar);

            if (currentValue < prevValue) {
                arabicNumber -= currentValue;
            } else {
                arabicNumber += currentValue;
            }

            prevValue = currentValue;
        }

        return arabicNumber;
    }

    public static void Solution3() {
        String romanNumber = "MMXXII";
        int arabicNumber = convert(romanNumber);
        System.out.println(romanNumber + " = " + arabicNumber);
    }
}
