

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args)
    {
        String[] words = new String[10];
        words[5] = "Helloo";
        Optional<String> checkNull = Optional.ofNullable(words[6]);
       String value = checkNull.orElse("Defalut");
//        System.out.println(checkNull.get()) ;
//        System.out.println(checkNull.toString());
        //checkNull.orElse("Defalut");

        if (value != null) {
            String word = checkNull.get().toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
