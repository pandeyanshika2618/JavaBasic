public class calculator {

    public static  void  addition(double a, double b) {
        double sum = a + b;
        System.out.println("The result of sum is" +sum);
    }

    public static void product(double a, double b) {
        double pro = a + b;
        System.out.println("The result of product" +pro);
    }

    public static void subtraction(double a, double b) {
        double sub = a - b;
        System.out.println("The result of subtraction" +sub);

    }
    public  static void division(int a , int b)
    {

       // Exception handling of division case by try and catch block
       /*  try {
             int div  = a/b;
             System.out.println("The result of division is :" + div);
           }
         catch(ArithmeticException e){
             System.out.println("You can not divide a number by zero");
           }*/
         //exception handling by  if else
        if(b == 0)
        {
            System.out.println("We can't divide a number by zero");
        }
        else
        {
            int div = a/b;
            System.out.println("tHE RESULT OF DIVISION IS :"+div);
        }



    }
    public static void main(String[] args) {
        addition(4, 4);
        division(6, 0);
        subtraction(7, 8);
        product(5, 6);
    }
}
