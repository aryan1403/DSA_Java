import java.util.ArrayList;
import java.util.List;

public class streamex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(53);
        list.add(-4);

        for (int i : list) {
            if(i >= 0) {
                // System.out.println(i);
            }
        }
        // list.stream().filter(e -> (e >= 0 && e % 2 == 0)).forEach(System.out::println);
        
    }
}
