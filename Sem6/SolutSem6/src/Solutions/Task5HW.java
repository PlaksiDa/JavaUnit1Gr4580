package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task5HW {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Task5HW(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public static void main() {
        // Создание списка ноутбуков
        List<Task5HW> notebooks = new ArrayList<>();
        notebooks.add(new Task5HW("Brand1", 8, 500, "Windows", "Black"));
        notebooks.add(new Task5HW("Brand2", 16, 1000, "MacOS", "Silver"));
        notebooks.add(new Task5HW("Brand3", 8, 1000, "Linux", "Red"));
        notebooks.add(new Task5HW("Brand4", 16, 500, "Windows", "Blue"));
        notebooks.add(new Task5HW("Brand5", 8, 1000, "MacOS", "White"));
        notebooks.add(new Task5HW("Brand6", 16, 1000, "Linux", "Black"));
        notebooks.add(new Task5HW("Brand7", 8, 500, "Windows", "Silver"));
        notebooks.add(new Task5HW("Brand8", 16, 1000, "MacOS", "Red"));

        // Запрос критериев фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();

        int criterion;
        do {
            System.out.println();
            System.out.println("---------- Результаты поиска ----------");
            List<Task5HW> filteredNotebooks = filterNotebooks(notebooks, filters);

            if (filteredNotebooks.isEmpty()) {
                System.out.println("Нет ноутбуков, удовлетворяющих заданным критериям.");
            } else {
                for (Task5HW notebook : filteredNotebooks) {
                    System.out.println(notebook.getBrand());
                }
            }
            System.out.println("---------------------------------------");

            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Сбросить поиск");
            System.out.println("0 - Выход");

            criterion = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            if (criterion == 0) {
                System.out.println("Программа завершена.");
                return;
            }

            if (criterion == 5) {
                filters.clear();
                System.out.println("Поиск сброшен.");
                continue;
            }

            String prompt;
            switch (criterion) {
                case 1:
                    prompt = "Введите минимальное значение (до 16):";
                    break;
                case 2:
                    prompt = "Введите минимальное значение (до 1000):";
                    break;
                case 3:
                    prompt = "Доступные ОС: Windows, MacOS, Linux";
                    break;
                case 4:
                    prompt = "Доступные цвета: Black, Silver, Red, Blue, White";
                    break;
                default:
                    System.out.println("Некорректный критерий: " + criterion);
                    continue;
            }

            System.out.println(prompt);
            Object filterValue = scanner.nextLine();

            filters.put(criterion, filterValue);
        } while (true);
    }

    public static List<Task5HW> filterNotebooks(List<Task5HW> notebooks, Map<Integer, Object> filters) {
        List<Task5HW> filteredNotebooks = new ArrayList<>();

        for (Task5HW notebook : notebooks) {
            boolean isMatch = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criterion = entry.getKey();
                Object filterValue = entry.getValue();

                switch (criterion) {
                    case 1:
                        if (notebook.getRam() < Integer.parseInt(filterValue.toString())) {
                            isMatch = false;
                        }
                        break;
                    case 2:
                        if (notebook.getStorage() < Integer.parseInt(filterValue.toString())) {
                            isMatch = false;
                        }
                        break;
                    case 3:
                        if (!notebook.getOperatingSystem().equalsIgnoreCase(filterValue.toString())) {
                            isMatch = false;
                        }
                        break;
                    case 4:
                        if (!notebook.getColor().equalsIgnoreCase(filterValue.toString())) {
                            isMatch = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный критерий: " + criterion);
                        break;
                }
            }

            if (isMatch) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}