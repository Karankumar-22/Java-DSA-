import java.util.*;

public class arraylist_76 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(9);
        list.add(6);
        list.add(4);
        System.out.println(list);

        // get element
        int element = list.get(1);
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);

        // set a new element
        list.set(0, 66);
        System.out.println(list);

        // contain elemnt

        System.out.println(list.contains(6));
    }
}
