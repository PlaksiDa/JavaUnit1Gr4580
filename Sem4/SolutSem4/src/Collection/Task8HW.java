// 3. В калькулятор добавьте возможность отменить последнюю операцию. Калькулятор сделать на основе программы разработанной на семинаре.

package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class Task8HW {
    private Deque<Double> operandStack;
    private Deque<String> operatorStack;
    private double currentResult;

    public Task8HW() {
        operandStack = new LinkedList<>();
        operatorStack = new LinkedList<>();
        currentResult = 0.0;
    }

    // Выполняет операцию с заданным оператором и операндом, обновляет текущий результат вычислений.
    public void performOperation(String operator, double operand) {
        operandStack.push(operand);
        operatorStack.push(operator);

        switch (operator) {
            case "+":
                currentResult += operand;
                break;
            case "-":
                currentResult -= operand;
                break;
            case "*":
                currentResult *= operand;
                break;
            case "/":
                currentResult /= operand;
                break;
        }
    }

    // Отменяет последнюю операцию, восстанавливая предыдущий результат вычислений. Если стеки операндов и операторов пусты, метод ничего не делает.
    public void undoLastOperation() {
        if (!operandStack.isEmpty() && !operatorStack.isEmpty()) {
            double lastOperand = operandStack.pop();
            String lastOperator = operatorStack.pop();

            switch (lastOperator) {
                case "+":
                    currentResult -= lastOperand;
                    break;
                case "-":
                    currentResult += lastOperand;
                    break;
                case "*":
                    currentResult /= lastOperand;
                    break;
                case "/":
                    currentResult *= lastOperand;
                    break;
            }
        }
    }

    // Возвращает текущий результат вычислений.
    public double getCurrentResult() {
        return currentResult;
    }

    public static void Solutions3() {
        Task8HW calculator = new Task8HW();
        calculator.performOperation("+", 5);
        calculator.performOperation("*", 2);
        calculator.performOperation("-", 3);

        System.out.println("Текущий результат: " + calculator.getCurrentResult());

        calculator.undoLastOperation();
        System.out.println("После отмены: " + calculator.getCurrentResult());
    }
}