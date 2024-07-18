public class GenericDemo<T> {
    /*public static void main(String[] args) {
        Object obj = new String("Hello");
      //  obj = new Integer(10);
         String str = (String)obj;
        System.out.println(str);

    }*/
    T data[]=(T[]) new Object[3];

    public static void main(String[] args) {
        GenericDemo<String> gd  = new GenericDemo();
        gd.data[0] ="hi";
        gd.data[1] ="hello";
       // gd.data[3]  =new Integer(10); This will show error
    }
}
