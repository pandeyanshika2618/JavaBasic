public class Throwdemo {
    static  int f1(int a , int b) throws Exception
    {
        if (b == 0)
            throw new Exception();
        return a/b;
    }
    static public void f2() throws Exception
    {
        f1(10 ,0);
    }
    static public void f3() throws Exception
    {
        f2();
    }

    public static void main(String[] args) {
        try {
            f3();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
