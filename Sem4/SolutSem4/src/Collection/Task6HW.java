// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Collection;

import java.util.LinkedList;

public class Task6HW {
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        
        // Обходим исходный список в обратном порядке и добавляем элементы в новый список
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        
        return reversedList;
    }

    public static void Solutions1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Обратный список: " + reversedList);
    }
}
