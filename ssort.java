import java.util.ArrayList;
import java.util.List;

class data {
    int id;
    int value;
    public data(int id, int value) {
        this.id = id;
        this.value = value;
    }
}
public class ssort {
    public static void main(String[] args) {
        List<data> list = new ArrayList<>();
        list.add(new data(11, 10));
        list.add(new data(2, 23));
        list.add(new data(64, 78));
        list.add(new data(5, 97));

        //TODO: sort it on the basis of id;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).id < list.get(j).id) {
                    //swap
                }
            }
        }

        list.stream().sorted((d1, d2) -> {
            if(d1.value < d2.value)
                //swap
                return -1;
            return 1; // not to swap
        }).forEach(e -> System.out.println("id: " + e.id + ", value: " + e.value));

    }
}
