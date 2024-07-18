interface mr{
    public void display(String s);
}
class dummy{

}
public class MethodReference {
    public static void add(int a , int b)
    {
        int sum = a+b ;
        System.out.println("sum  " +sum);
    }
    public static void main(String[] args) {
       // mr m1 = System.out::println;//display has become println
       // m1.display("Hello");
       // MethodReference m2 = MethodReference::add;
       // m2.add(2,4);
    }
}
