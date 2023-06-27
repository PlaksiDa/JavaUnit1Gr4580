// Задание №2
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы

package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void Solutions2() {
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Earth"); // Дублирование элемента
        planets.add("Mars"); // Дублирование элемента

        // Вывод названия каждой планеты и количество его повторений в списке
        Map<String, Integer> planetCount = new HashMap<>();
        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                int count = planetCount.get(planet);
                planetCount.put(planet, count + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : planetCount.entrySet()) {
            String planet = entry.getKey();
            int count = entry.getValue();
            System.out.println(planet + ": " + count);
        }

        // Удаление повторяющихся элементов
        List<String> uniquePlanets = new ArrayList<>(planetCount.keySet());

        System.out.println("Уникальные планеты:");
        for (String planet : uniquePlanets) {
            System.out.println(planet);
        }
    }
}
