import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(15);
        ArrayList<Integer> a= new ArrayList<>(List.of(10 ,11,12,13 ,14,15,16));
        A.addAll(1,a);

       /* for(var y : a)
        {
            System.out.println(y);
        }*/
        ListIterator<Integer> it = a.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
