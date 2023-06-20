import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        // task1_1();
        // task1_2();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();

        // Домашняя работа:
        // task1HW();
        // task2HW();
        // task3HW();
        // task4HW();

    }

    private static void task1_1() {
        // Задание №1
        // Написать программу, которая запросит пользователя ввести
        // <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение
        // “Привет, <Имя>!”

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");

    }

    private static void task1_2() {
        // В консоли запросить имя пользователя. В зависимости от
        // текущего времени, вывести приветствие вида
        // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        LocalTime timeOfDay = LocalTime.now();
        System.out.println(timeOfDay);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        if (timeOfDay.getHour() >= 5 && timeOfDay.getHour() < 12) {
            System.out.println("Доброе утро, " + name + "!");
        }
        if (timeOfDay.getHour() >= 12 && timeOfDay.getHour() < 18) {
            System.out.println("Добрый день, " + name + "!");
        }
        if (timeOfDay.getHour() >= 18 && timeOfDay.getHour() < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        }
        if (timeOfDay.getHour() >= 23 && timeOfDay.getHour() < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }

    private static void task2() {
        // Задание №2
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        int[] mass = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int countMax = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                count++;
                if (count > countMax)
                    countMax = count;
            } else
                count = 0;
        }

        System.out.println(countMax);
    }

    private static void task3() {
        // Задание №3
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести
        // эти элементы в конец массива.
        // Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны от заданного, а остальные - равны ему

        int[] mass = { 1, 1, 0, 3, 1, 3, 0, 1, 0, 3 };
        int[] mass2 = new int[mass.length];
        int count = 0;
        int index = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != 3) {
                mass2[index++] = mass[i];
            } else {
                count++;
            }
        }

        for (int i = mass.length - count; i < mass.length; i++) {
            mass2[i] = 3;
        }

        System.out.println(Arrays.toString(mass2));
    }

    private static void task4() {
        // Задание №4
        // Напишите метод, который находит самую длинную строку общего
        // префикса среди массива строк.
        // Если общего префикса нет, вернуть пустую строку "".

        String[] strings = { "abcdef", "abcdxyz", "abc123" };

        if (strings == null || strings.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }

    private static void task5() {
        // Задание №5 (доп)
        // Во фразе "Добро пожаловать на курс по Java" переставить слова
        // в обратном порядке.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String sentence = text;

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        String reversed = reversedSentence.toString().trim();
        System.out.println(reversed);
    }

    private static void task6() {
        // Задание №6 (доп)
        // Реализовать функцию возведения числа а в степень b. a, b из Z.
        // Сводя количество выполняемых действий к минимуму.
        // Пример 1: а = 3, b = 2, ответ: 9
        // Пример 2: а = 2, b = -2, ответ: 0.25
        // Пример 3: а = 3, b = 0, ответ: 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        Integer a = scanner.nextInt();
        System.out.print("Введите b: ");
        Integer b = scanner.nextInt();

        double result = 1;

        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                result /= a;
            }
        }

        System.out.println(result);
    }

    private static void task7() {
        // Задание №7 (доп)
        // На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
        // две команды
        // - команда 1 (к1): увеличить в с раза, а умножается на c
        // - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
        // Написать программу, которая выдаёт набор команд, позволяющий число a
        // превратить в число b или сообщить, что это невозможно
        // Пример 1: а = 1, b = 7, c = 1, d = 3
        // ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
        // Пример 2: а = 11, b = 7, c = 2, d = 1
        // ответ: “”.

        int a = 1;
        int b = 7;
        int c = 1;
        int d = 3;

        String commands = "";

        if (a == b) {
            System.out.println(commands); // Число a уже равно числу b, не требуется ни одной команды
            return;
        }

        if (a > b) {
            System.out.println("Невозможно превратить число a в число b");
            return;
        }

        while (a < b) {
            if ((b - a) % d == 0) {
                int steps = (b - a) / d;
                for (int i = 0; i < steps; i++) {
                    commands += "к2, ";
                    a += d;
                }
                break;
            }

            a *= c;
            commands += "к1, ";
        }

        if (a == b) {
            System.out.println(commands.substring(0, commands.length() - 2));
        } else {
            System.out.println("Невозможно превратить число a в число b");
        }
    }

    private static void task8() {
        // Задание №8 (доп)
        // Задан массив, например, nums = [1,7,3,6,5,6].
        // Написать программу, которая найдет индекс i для этого массива
        // такой, что сумма элементов с индексами < i равна сумме
        // элементов с индексами > i.

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int leftSum = 0;
        int rightSum = 0;
        int balanceIndex = -1;

        // Вычисляем общую сумму всех элементов массива
        for (int num : nums) {
            rightSum += num;
        }

        // Проходим по элементам массива и ищем индекс, где сумма элементов слева равна
        // сумме элементов справа
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                balanceIndex = i;
                break;
            }

            leftSum += nums[i];
        }

        if (balanceIndex != -1) {
            System.out.println("Индекс сбалансированного элемента: " + balanceIndex);
        } else {
            System.out.println("Сбалансированный элемент не найден.");
        }
    }

    private static void task9() {
        // Задание №9 (доп)
        // Записать в файл следующие данные:
        // Name Surname Age
        // Kate Smith 20
        // Paul Green 25
        // Mike Black 23

        String filename = "data.txt";
        String data = "Name Surname Age\n" +
                "Kate Smith 20\n" +
                "Paul Green 25\n" +
                "Mike Black 23";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
            System.out.println("Данные успешно записаны в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        }
    }

    private static void task1HW() {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
        // (произведение чисел от 1 до n)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // Вычисление n-го треугольного числа
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }

        // Вычисление факториала числа n
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("n-ое треугольное число: " + triangleNumber);
        System.out.println("Факториал числа n: " + factorial);
    }

    private static void task2HW() {
        // Вывести все простые числа от 1 до 1000
        System.out.println("Простые числа от 1 до 1000:");

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    private static void task3HW() {
        // Реализовать простой калькулятор

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Деление на ноль");
                }
                break;
            default:
                System.out.println("Неверный оператор");
                break;
        }
    }

    private static void task4HW() {
        // *Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
        // восстановить выражение до верного равенства. Предложить хотя бы
        // одно решение или сообщить, что его нет

        boolean solutionFound = false;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int result = 2 * 10 + i + j * 10 + 5;
                if (result == 69) {
                    System.out.println("Первое число: " + i + ", второе число: " + j);
                    solutionFound = true;
                }
            }
        }

        if (!solutionFound) {
            System.out.println("Решений нет.");
        }
    }
}