
 class Mya1<T> {
    T A[] = (T[]) new Object[10];
    int length = 10 ;
    public void append(T a)
    {
        A[length++] = a ;
    }
//     public void append (int  a )
//     {
//         for (int i = 0 ; i <= a; i++)
//         {
//             System.out.println(i);
//         }
//     }
    public void  display()
    {
        for (int i = 0 ; i <length ; i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class Myarray {
    public static void main(String[] args) {
       /* Mya1<Integer> ma = new Mya1<>();
        ma.append(10);
        ma.append(12);
        ma.append(17);
        ma.display() ;

        */
        // if no parameter is given we can store string as well as array
        Mya1 ma = new Mya1() ;
        ma.append(5);
        ma.display() ;

    }
}
