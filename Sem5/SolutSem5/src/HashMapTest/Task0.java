// Задание №0
// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Task0 {
    public static void Solution0() {
        Map<String, String> employees = new HashMap<>();
        employees.put("123456", "Иванов");
        employees.put("321456", "Васильев");
        employees.put("234561", "Петрова");
        employees.put("234432", "Иванов");
        employees.put("654321", "Петрова");
        employees.put("345678", "Иванов");
        
        // Вывод данных по сотрудникам с фамилией Иванов
        System.out.println("Данные по сотрудникам с фамилией Иванов:");
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println("Номер паспорта: " + entry.getKey() + ", Фамилия: " + entry.getValue());
            }
        }
    }
}
