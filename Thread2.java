class Mythread extends Thread{
    public Mythread(String Name)
    {
        super(Name);
        setPriority(Thread.MAX_PRIORITY -1);
    }
    public void run()
    {
        int count = 0 ;
        try {
            while (true) {
                System.out.println(count++);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}


public class Thread2 {
    public static void main(String[] args) {


        Mythread t = new Mythread("MY Thread");
//        System.out.println( t.getName());
//        System.out.println(t.getId()) ;
//        System.out.println(t.threadId() );
//        System.out.println(t.getThreadGroup() );
//        System.out.println(t.getStackTrace() );
//        System.out.println(t.getPriority() );
        t.start();
       // System.out.println(t.getState() );

    }
}
