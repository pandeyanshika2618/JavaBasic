public class dumbs {
    public void addition1 (int a , int b)
        { System.out.println("INT");
           int sum = a+b ;
            System.out.println(+sum);
        }
        public void addition1(long a , long b)
        {  System.out.println("Long");
            long sum = a+b ;
            System.out.println(+sum);
        }
        public void addition1(double a ,double b)
        {  System.out.println("double");
            double sum = a+b ;
            System.out.println(+sum);
        }
        public void addition1(float a , float b)
        { System.out.println("float");
           float  sum = a+b ;
            System.out.println(+sum);
        }
        public static void main(String[] args)
        {
            long x = 6 ;
            long y = 8 ;
            dumbs obj = new dumbs();
            obj.addition1(4,5);
            obj.addition1(x,y);
            obj.addition1(40000l,5);
            obj.addition1(4,5);
        }
    }

