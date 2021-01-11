import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aghf");
        set.add(45);
        set.add(45);
        set.add("ogik");
        set.add("fkjgj");
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
