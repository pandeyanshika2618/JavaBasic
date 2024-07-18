import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(15);
        ArrayList<Integer> a= new ArrayList<>(List.of(10 ,11,12,13 ,14,15,16));
        A.addAll(1,a);

        a.set(1 ,84);
        a.remove(3);
        System.out.println( "After getting element"+a.get(3));
        for(var y : a)
        {
            System.out.println(y);
        }
        a.add(4,20);
       // Collections .sort(a);
        a.sort(null);
        System.out.println(a);

      //  System.out.println(a.subList(0,5));
        //List<Integer> subList = a.subList(1, 4);


       // ArrayList<Integer> newList = new ArrayList<>(subList);
      //  System.out.println(newList);


        //ListIterator<Integer> it = a.listIterator();
       /* while(it.hasNext())
        {
            System.out.println(it.next());
        }

*/

    }
}
