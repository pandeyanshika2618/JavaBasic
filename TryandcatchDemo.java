import java.util.Scanner;

public class TryandcatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            int c = a/b ;
            System.out.println("The result of division is  " +c);
        }



        catch(ArrayIndexOutOfBoundsException  e)
        {
            System.out.println("error is : "+ e );
            System.out.println("The denominator cant' be zero , Please Try again with different input");
        }


        System.out.println("Happy Coding!");
    }
}
