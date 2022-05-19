package control_flow;

import java.util.ArrayList;
import java.util.Collection;

public class ForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfInt = new ArrayList();
        arrayOfInt.add(1);
        arrayOfInt.add(2);
        arrayOfInt.add(3);
        arrayOfInt.add(4);
        arrayOfInt.add(5);

        for (Integer integer : arrayOfInt) {
            System.out.println(integer);
        }
    }
}
