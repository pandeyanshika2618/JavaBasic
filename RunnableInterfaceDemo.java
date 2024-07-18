
    class Test1 implements Runnable
    {
        public void run()
        {
            int i = 1;
            while(true)
            {
                System.out.println(i+ "Hello");
            }
        }
    }
    public class RunnableInterfaceDemo {
        public static void main(String[] args) {
            Test1 t = new Test1();
            Thread a= new Thread(t);
            a.start();
            int i = 1 ;
            while (true)
            {
                System.out.println(i+ "HIII");
            }
        }
    }


