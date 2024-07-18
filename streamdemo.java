import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamdemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
       // List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        List<String>  str = Arrays.asList("ram","shaym" , "gita");
        List<String>  result=str.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
        System.out.println(result);
       // System.out.println(square);
      //  square.stream().sorted();
      //  System.out.println(square);
     //   number.stream().map(x->x*x).forEach(y-> System.out.println(y));

          int even     = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);

        System.out.println(even);

    }
}
