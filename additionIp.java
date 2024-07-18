import java.util.Scanner;

public class additionIp {
    public void suma(int a , int b)
    {
        int c = a+b ;
        System.out.println("The sum:  " +c);
    }
    public static void main(String[]  args)
    {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        additionIp az = new additionIp();
        az.suma(a,b);
    }

}

