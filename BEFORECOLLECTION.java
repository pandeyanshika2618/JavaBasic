/*import java.util.Hashtable;
import java.util.Vector;

public class BEFORECOLLECTION {
    public static void main(String[] args) {
         int arr[] = new int[]{1,2 ,3 ,4 };
         Vector<Integer> v = new Vector();
        Hashtable<Integer , String> h = new Hashtable();

        v.addElement(1);
        v.addElement(2);


        h.put(1, "geeks");
        h.put(2, "4 geeks");


        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));

    }

} */
//code with Collection Frame work
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BEFORECOLLECTION {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();


        list.add(1);
        list.add(2);
        map.put(1, "geeks");
        map.put(2, "4geeks");


        System.out.println(list.get(0)); // ArrayList's get method
        System.out.println(map.get(1));  // HashMap's get method
    }
}

