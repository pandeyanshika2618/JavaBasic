interface mylambda
{
    void display(int a , int b);
    default void defaultmethod()
    {
        System.out.println("Derfault method");
    }
}
/*class My implements mylambda{
    @Override
    public void display() {
        System.out.println("Hello world");
    }
}*/

public class LambdaDemo {
    public static void main(String[] args) {
        mylambda  m1 = ( a ,  b) ->{

            int sum = a+b ;
            System.out.println("The sum is " +sum);
        };
        m1.display(3,4);
    }
}
