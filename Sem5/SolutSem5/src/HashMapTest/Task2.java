// Задание №2
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package HashMapTest;

import java.util.Stack;

public class Task2 {
    public static boolean isExpressionValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || !isMatchingBracket(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

    private static boolean isMatchingBracket(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '[' && closeBracket == ']') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '<' && closeBracket == '>');
    }

    public static void Solution2() {
        String[] expressions = {
                "a+(d*3)",      // true
                "[a+(1*3)",     // false
                "[6+(3*3)]",    // true
                "{a}[+]{(d*3)}",
                "<{a}+{(d*3)}>",
                "{a+]}{(d*3)}"  
        };

        for (String expression : expressions) {
            boolean isValid = isExpressionValid(expression);
            System.out.println(expression + " - " + isValid);
        }
    }
}
