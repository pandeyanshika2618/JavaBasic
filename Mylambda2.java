interface mylambda1
{
    void display();
}

class Demo
{
    public void  method1()
    {
        int count = 0;
         mylambda1 m1 =()->{
        System.out.println("Hello"+count);
    };
    }
}
public class Mylambda2 {
    public static void main(String[] args) {
    }
}
