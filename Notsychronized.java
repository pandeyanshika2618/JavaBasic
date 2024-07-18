import com.sun.security.jgss.GSSUtil;

class Mydata
{
    synchronized void display (String str)
    {
        for (int i  = 0 ; i  <str.length() ; i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
class MyT1 extends Thread{
    Mydata d1 ;
    MyT1(Mydata d1)
    {
        this.d1 = d1 ;
    }
    public void run()
    {
        d1.display("class1");
    }
}
class MyT2 extends Thread
{
    Mydata d2 ;
    MyT2 (Mydata d2)
    {
        this.d2 = d2 ;
    }
    public void run()
    {
        d2.display("class2");
    }
}
public class Notsychronized {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        MyT1 t1 = new MyT1(d);
        MyT2 t2  = new MyT2(d);
        t1.start();
        t2.start();
    }
}
