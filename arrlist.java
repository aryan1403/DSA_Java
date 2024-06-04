import java.util.ArrayList;
import java.util.Collections;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(-2);
        list.add(0);
        list.add(70);

        // Sorted list: -2, 0, 20, 70

        Collections.sort(list);

        System.out.println(list.toString());
    }
}
