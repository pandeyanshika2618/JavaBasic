interface mylambda4
{
    void display();
}
class useDemo1{
    public void  calllambda(mylambda1 m1)
    {
        m1.display();
    }
}
class Demo1
{
    public void  method1()
    {
        useDemo1 d1 = new useDemo1();
        d1.calllambda(()->{
            System.out.println("Hellooo");
        });
    }
}
public class mylambda3 {
    public static void main(String[] args) {
    }
}

