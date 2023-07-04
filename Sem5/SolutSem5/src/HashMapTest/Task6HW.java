// Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, 
// что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать,|
// как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.(можно выводить без сортировки, но обязательно в отдельном методе)

package HashMapTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6HW {
    private Map<String, List<String>> contacts;

    public Task6HW() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void printContacts() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public void printContactsSortedByCount() {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(contacts.entrySet());
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));

        for (int i = entries.size() - 1; i >= 0; i--) {
            Map.Entry<String, List<String>> entry = entries.get(i);
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void Solution1() {
        Task6HW phoneBook = new Task6HW();

        // Добавляем контакты
        phoneBook.addContact("John", "123456789");
        phoneBook.addContact("Alice", "987654321");
        phoneBook.addContact("John", "111111111");
        phoneBook.addContact("Bob", "222222222");

        // Выводим контакты
        phoneBook.printContacts();

        System.out.println("-----");

        // Выводим отсортированные контакты
        phoneBook.printContactsSortedByCount();
    }
}
