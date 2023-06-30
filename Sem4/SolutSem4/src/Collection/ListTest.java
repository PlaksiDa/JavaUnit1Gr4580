package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void TimeTest(int size) {
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> linkList = new ArrayList<>();
        // ArrayList<Integer> simpleList = new ArrayList<>();
        // LinkedList<Integer> linkList = new LinkedList<>();

        long curTime = System.currentTimeMillis();
        System.out.println(curTime);

        curTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            simpleList.add(0,1);
        }

        System.out.println(System.currentTimeMillis() - curTime);
        curTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            linkList.add(0,1);
        }

        System.out.println(System.currentTimeMillis() - curTime);

    }
}
