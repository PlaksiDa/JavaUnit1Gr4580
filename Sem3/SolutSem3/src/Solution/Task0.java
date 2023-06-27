// Задание №0
// Даны следующие строки, cравнить их с помощью == и
// метода equals() класса Object

package Solution;

public class Task0 {
    public static void StringTest() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        if (s1 == s2)
            System.out.println("Test1 ok");
        if (s3 == s4)
            System.out.println("Test2 ok");
        if (s5.equals(s6))
            System.out.println("Test3 ok");
    }
}
