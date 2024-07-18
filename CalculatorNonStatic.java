import java.util.Scanner;
public class CalculatorNonStatic {

    public   void  addition(double a, double b) {
        double sum = a + b;
        System.out.println("The result of sum is" +sum);
    }

    public void Product(double a, double b) {
        double pro = a + b;
        System.out.println("The result of product" +pro);
    }

    public  void subtraction(double a, double b) {
        double sub = a - b;
        System.out.println("The result of subtraction" +sub);

    }
    public  void division(int a , int b)
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
        Scanner sc = new Scanner(System.in);
        CalculatorNonStatic calculator = new CalculatorNonStatic();
        System.out.println("Enter first number for addition: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number for addition: ");
        double b  = sc.nextDouble();
        calculator.addition(a,b);

        System.out.println("Enter first number for division: ");
        int m= sc.nextInt();
        System.out.println("Enter second number for division: ");
        int n = sc.nextInt();
        calculator.division(m,n);

        System.out.println("Enter first number for subtraction: ");
        double p = sc.nextDouble();
        System.out.println("Enter second number for subtraction: ") ;
        double q = sc.nextDouble();
        calculator.subtraction(p,q);

        System.out.println("Enter first number for product: ") ;
        double x =sc.nextDouble();
        System.out.println("Enter second number for product: ") ;
        double y =sc.nextDouble();
        calculator.Product(x , y);

    }
}
