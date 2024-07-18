class lowbalance extends Exception{

    public String tostring()
    {
        return "The balance should not be less than 5000";
    }
}
public class customException {
    static void fun1()
    {
        try {
            throw new lowbalance();
        }
        catch(lowbalance e)
        {
            System.out.println(e);
        }
    }
    static void fun2()
    {
              fun1();
    }
    static void fun3()
    {
         fun2();
    }

    public static void main(String[] args) {
        fun1();
    }
}
