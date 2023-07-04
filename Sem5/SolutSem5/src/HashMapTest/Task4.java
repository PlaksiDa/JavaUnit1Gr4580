// Задание №4
// Написать метод, который переведёт данное целое число в римский формат.


package HashMapTest;

import java.util.TreeMap;

public class Task4 {
    private static final TreeMap<Integer, String> arabicToRomanMap = createArabicToRomanMap();

    private static TreeMap<Integer, String> createArabicToRomanMap() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        return map;
    }

    public static String convert(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        while (arabicNumber > 0) {
            int highestValue = arabicToRomanMap.floorKey(arabicNumber);
            String romanSymbol = arabicToRomanMap.get(highestValue);

            romanNumber.append(romanSymbol);
            arabicNumber -= highestValue;
        }

        return romanNumber.toString();
    }

    public static void Solution4() {
        int arabicNumber = 2022;
        String romanNumber = convert(arabicNumber);
        System.out.println(arabicNumber + " = " + romanNumber);
    }
}
