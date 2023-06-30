// Задание №5 (доп)
// Реализовать алгоритм перевода из инфиксной записи в постфиксную для
// арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
// Вычислить запись если это возможно.

// Исправить*

package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static String convertToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }

                if (stack.isEmpty() || stack.peek() != '(') {
                    throw new IllegalArgumentException("Invalid expression");
                }

                stack.pop(); // Удаляем '(' со стека
            } else {
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    if (stack.peek() == '(') {
                        throw new IllegalArgumentException("Invalid expression");
                    }
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                throw new IllegalArgumentException("Invalid expression");
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int evaluatePostfix(String postfix, Map<Character, Integer> variables) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else if (Character.isLetter(ch)) {
                int value = variables.get(ch);
                stack.push(value);
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void Solutions5() {
        String infixExpression = "x ^ y / (5 * z) + 10";

        // Задайте значения переменных
        Map<Character, Integer> variables = new HashMap<>();
        variables.put('x', 2);
        variables.put('y', 3);
        variables.put('z', 4);

        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);

        int result = evaluatePostfix(postfixExpression, variables);
        System.out.println("Result: " + result);
    }
}
