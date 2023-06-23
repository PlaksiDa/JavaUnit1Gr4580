// 4*. К калькулятору из предыдущего дз добавить логирование

import java.util.Scanner;
import java.util.logging.*;

public class Task10HW {

    private static final Logger logger = Logger.getLogger("CalculatorLogger");

    public static void task3HW() {
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
                logger.info("Выполнено сложение: " + num1 + " + " + num2 + " = " + result);
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                logger.info("Выполнено вычитание: " + num1 + " - " + num2 + " = " + result);
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                logger.info("Выполнено умножение: " + num1 + " * " + num2 + " = " + result);
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    logger.info("Выполнено деление: " + num1 + " / " + num2 + " = " + result);
                    System.out.println("Результат: " + result);
                } else {
                    logger.warning("Деление на ноль");
                    System.out.println("Деление на ноль");
                }
                break;
            default:
                logger.warning("Неверный оператор");
                System.out.println("Неверный оператор");
                break;
        }
    }
}
