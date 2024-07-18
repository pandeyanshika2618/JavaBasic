public class scope {
     int x = 11 ;
    private int y = 33 ;
    public void method1 (int x)
    {
         scope t = new scope();
         this.x = 22 ;
         y = 44 ;
         System.out.println(+x);
        System.out.println(+t.x);
        System.out.println(+t.y);
        System.out.println(+y);

    }
    public static void main (String [] args)
    {
        scope t = new scope();
        t.method1(5);
    }

}
