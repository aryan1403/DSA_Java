import java.util.HashSet;
import java.util.Set;

public class setex {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(19);
        set.add(2);
        set.add(2); 

        set.remove(2);
        System.out.println(set.toString());

        // Task --> Emp system in which take the user input 
        // [id, name, salary, role], fetch data by id and use set ds in it.
    }
}
