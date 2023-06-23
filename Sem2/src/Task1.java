import java.util.Scanner;

public class Task1 {
    public static void execute(){
        // Задание №1
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt(); 

        char c1 = 'a';
        char c2 = 'b';
        boolean flag = true;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (flag) {
                str.append(c1);
                flag = false;
            }
            else {
                str.append(c2);
                flag = true;
            }
        }
        
        System.out.println(str);
        scanner.close();
    }
}
