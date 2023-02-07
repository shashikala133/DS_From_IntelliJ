import java.util.*;
public class One {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(2);
        set.add(3);
        set.add(7);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println(set.size());
    }
}
